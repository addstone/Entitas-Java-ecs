package com.ilargia.games.egdx.logicbricks.gen.scene;

import com.ilargia.games.egdx.logicbricks.component.scene.CChainLight;
import com.ilargia.games.egdx.logicbricks.component.scene.CConeLight;
import com.ilargia.games.egdx.logicbricks.component.scene.CDirectionalLight;
import com.ilargia.games.egdx.logicbricks.component.scene.CPointLight;
import com.ilargia.games.egdx.logicbricks.component.scene.Camera;
import com.ilargia.games.egdx.logicbricks.component.scene.Catch;
import com.ilargia.games.egdx.logicbricks.component.scene.GameWorld;
import com.ilargia.games.egdx.logicbricks.component.scene.ParallaxLayer;
import com.ilargia.games.egdx.logicbricks.component.scene.Tiled;

/**
 * ---------------------------------------------------------------------------
 * '<auto-generated>' This code was generated by CodeGeneratorApp.
 * ---------------------------------------------------------------------------
 */
public class SceneComponentsLookup {

	public static final int CChainLight = 0;
	public static final int CConeLight = 1;
	public static final int CDirectionalLight = 2;
	public static final int CPointLight = 3;
	public static final int Camera = 4;
	public static final int Catch = 5;
	public static final int GameWorld = 6;
	public static final int ParallaxLayer = 7;
	public static final int Tiled = 8;
	public static final int totalComponents = 9;

	public static String[] componentNames() {
		return new String[]{"CChainLight", "CConeLight", "CDirectionalLight",
				"CPointLight", "Camera", "Catch", "GameWorld", "ParallaxLayer",
				"Tiled"};
	}

	public static Class[] componentTypes() {
		return new Class[]{CChainLight.class, CConeLight.class,
				CDirectionalLight.class, CPointLight.class, Camera.class,
				Catch.class, GameWorld.class, ParallaxLayer.class, Tiled.class};
	}
}