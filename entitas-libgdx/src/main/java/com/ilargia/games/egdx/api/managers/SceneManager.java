package com.ilargia.games.egdx.api.managers;

import com.ilargia.games.egdx.api.EntityFactory;
import com.ilargia.games.entitas.Entity;

public interface SceneManager extends Manager {

    void addEntityFactory(String name, EntityFactory factory);

    <TEntity extends Entity> TEntity createEntity(String name);

    <L> L createLight(String type, int raysNum, int distance, int colorRGBA);

    <C> C createCamera(String type);

    <C> C getDefaultCamera();

    <B> B getBatch();

    void createScene(String scene);


}
