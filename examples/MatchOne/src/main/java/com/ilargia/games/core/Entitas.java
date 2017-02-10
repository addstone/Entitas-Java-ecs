package com.ilargia.games.core;

import com.ilargia.games.entitas.Context;

import java.util.Stack;

/**
 * ---------------------------------------------------------------------------
 * '<auto-generated>' This code was generated by CodeGeneratorApp.
 * ---------------------------------------------------------------------------
 */
public class Entitas {

    public GameSessionContext gamesession;
    public InputContext input;
    public GameContext game;

    public Entitas() {
        gamesession = createGamesessionContext();
        input = createInputContext();
        game = createGameContext();
    }

    public GameSessionContext createGamesessionContext() {
        return new GameSessionContext(GamesessionComponentIds.totalComponents,
                0, new ContextInfo("GameSession",
                GamesessionComponentIds.componentNames(),
                GamesessionComponentIds.componentTypes()),
                factoryGameSessionEntity());
    }

    public InputContext createInputContext() {
        return new InputContext(InputComponentIds.totalComponents, 0,
                new ContextInfo("Input", InputComponentIds.componentNames(),
                        InputComponentIds.componentTypes()),
                factoryInputEntity());
    }

    public GameContext createGameContext() {
        return new GameContext(GameComponentIds.totalComponents, 0,
                new ContextInfo("Game", GameComponentIds.componentNames(),
                        GameComponentIds.componentTypes()), factoryGameEntity());
    }

    public Context[] allContexts() {
        return new Context[]{gamesession, input, game};
    }

    public FactoryEntity<GameSessionEntity> factoryGameSessionEntity() {
        return (int totalComponents, Stack<IComponent>[] componentContexts,
                ContextInfo contextInfo) -> {
            return new GameSessionEntity(totalComponents, componentContexts,
                    contextInfo);
        };
    }

    public FactoryEntity<InputEntity> factoryInputEntity() {
        return (int totalComponents, Stack<IComponent>[] componentContexts,
                ContextInfo contextInfo) -> {
            return new InputEntity(totalComponents, componentContexts,
                    contextInfo);
        };
    }

    public FactoryEntity<GameEntity> factoryGameEntity() {
        return (int totalComponents, Stack<IComponent>[] componentContexts,
                ContextInfo contextInfo) -> {
            return new GameEntity(totalComponents, componentContexts,
                    contextInfo);
        };
    }
}