package com.ilargia.games.entitas.codeGenerator.generated;

import com.ilargia.games.entitas.interfaces.FactoryEntity;
import java.util.Stack;
import com.ilargia.games.entitas.interfaces.IComponent;
import com.ilargia.games.entitas.EntityMetaData;
import com.ilargia.games.entitas.events.EventBus;

/**
 * ---------------------------------------------------------------------------
 * '<auto-generated>' This code was generated by CodeGeneratorApp.
 * ---------------------------------------------------------------------------
 */
public class Context {

	public Pool otro;
	public Pool core;
	public EventBus<Entity> bus;

	public Context() {
		bus = new EventBus<>();
		otro = createOtroPool();
		core = createCorePool();
	}

	public Pool createOtroPool() {
		return new Pool(OtroComponentIds.totalComponents, 0,
				new EntityMetaData("Otro", OtroComponentIds.componentNames(),
						OtroComponentIds.componentTypes()), factoryEntity(),
				bus);
	}

	public Pool createCorePool() {
		return new Pool(CoreComponentIds.totalComponents, 0,
				new EntityMetaData("Core", CoreComponentIds.componentNames(),
						CoreComponentIds.componentTypes()), factoryEntity(),
				bus);
	}

	public Pool[] allPools() {
		return new Pool[]{otro, core};
	}

	public FactoryEntity<Entity> factoryEntity() {
		return (int totalComponents, Stack<IComponent>[] componentPools,
				EntityMetaData entityMetaData) -> {
			return new Entity(totalComponents, componentPools, entityMetaData,
					bus);
		};
	}
}