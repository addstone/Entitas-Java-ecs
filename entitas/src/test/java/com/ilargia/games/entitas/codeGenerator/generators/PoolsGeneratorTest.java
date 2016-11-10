package com.ilargia.games.entitas.codeGenerator.generators;

import com.ilargia.games.entitas.codeGenerator.intermediate.CodeGenFile;
import org.jboss.forge.roaster.Roaster;
import org.junit.Before;
import org.junit.Test;

public class PoolsGeneratorTest {

    static final public int totalComponents = 0;
    private PoolsGenerator generator;
    private String[] poolNames;

    @Before
    public void setUp() throws Exception {
        generator = new PoolsGenerator();
        poolNames = new String[]{"pruebas", "test", "core"};


    }

    @Test
    public void componentSize() {
        CodeGenFile[] result = generator.generate(poolNames);

        System.out.println(Roaster.format(result[0].fileContent.toString()));
        //assertEquals(3, IComponent.getComponentSize());


    }

}
