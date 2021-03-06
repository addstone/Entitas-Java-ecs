package ilargia.entitas.codeGeneration.plugins.postProcessors;


import ilargia.entitas.codeGeneration.interfaces.IAppDomain;
import ilargia.entitas.codeGeneration.plugins.config.TargetPackageConfig;
import ilargia.entitas.codeGeneration.data.CodeGenFile;
import ilargia.entitas.codeGeneration.interfaces.ICodeGenFilePostProcessor;
import ilargia.entitas.codeGeneration.interfaces.IConfigurable;
import ilargia.entitas.codeGeneration.utils.CodeGeneratorUtil;
import org.jboss.forge.roaster.model.source.JavaClassSource;

import java.io.File;
import java.util.List;
import java.util.Properties;

public class WriteToDiskPostProcessor implements ICodeGenFilePostProcessor<JavaClassSource>, IConfigurable {

    private final TargetPackageConfig targetPackageConfig;
    private IAppDomain projectConfig;

    public WriteToDiskPostProcessor() {
        targetPackageConfig = new TargetPackageConfig();

    }

    @Override
    public Properties defaultProperties() {
        return targetPackageConfig.defaultProperties();
    }

    @Override
    public void setProperties(Properties properties) {
        targetPackageConfig.setProperties(properties);
    }

    @Override
    public String getName() {
        return "Write to disk";
    }

    @Override
    public Integer gePriority() {
        return 100;
    }

    @Override
    public boolean isEnableByDefault() {
        return true;
    }

    @Override
    public boolean runInDryMode() {
        return false;
    }

    @Override
    public void setAppDomain(IAppDomain appDomain) {
        projectConfig = appDomain;
    }

    @Override
    public List<CodeGenFile<JavaClassSource>> postProcess(List<CodeGenFile<JavaClassSource>> files) {
        files.stream().forEach(f -> createFile(f.getFileName(), f.getSubDir(), f.getFileContent()));
        return files;

    }

    public File createFile(String className, String subDir, JavaClassSource content) {
        String targetPackage = targetPackageConfig.getTargetPackage();
        String finalPackage = subDir.equals("") || className.contains("Shared")?
                String.format("%s", targetPackage) :
                String.format("%s.%s", targetPackage, subDir);
        content.setPackage(finalPackage);

        String pathPackage = targetPackage.replace(".", "/");
        String pathFile = subDir.equals("") || className.contains("Shared")?
                String.format("%s/%s/%s.java", projectConfig.getSrcDirs().get(0), pathPackage, className) :
                String.format("%s/%s/%s/%s.java", projectConfig.getSrcDirs().get(0), pathPackage, subDir, className);

        File file = new File(pathFile);
        CodeGeneratorUtil.writeFile(file, content.toString());
        return file;
    }


}
