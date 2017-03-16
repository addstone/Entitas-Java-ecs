package com.examples.games;

import com.badlogic.gdx.math.Interpolation;

import com.examples.games.states.PlatformExampleState;
import com.ilargia.games.egdx.api.ChangeStateCommand;
import com.ilargia.games.egdx.api.EventBus;
import com.ilargia.games.egdx.impl.GameGDX;
import com.ilargia.games.egdx.impl.managers.SceneManagerGDX;
import com.ilargia.games.egdx.transitions.SlideTransition;
import net.engio.mbassy.listener.Handler;

public class ExamplesGame extends GameGDX<ExamplesEngine> {


    private SlideTransition slideTransition;
    private PlatformExampleState pongState;

    public ExamplesGame(ExamplesEngine engine, EventBus bus) {
        super(engine, bus);
        ebus.subscribe(this);
    }


    @Handler
    public void handleChangeState(ChangeStateCommand command) {
        command.change("GameState", this);
    }

    @Override
    public void init() {

    }

    public SlideTransition getSlideTransition() {
        if (slideTransition == null)
            slideTransition = new SlideTransition(1, SlideTransition.DOWN, false, Interpolation.bounceOut, _engine.getManager(SceneManagerGDX.class).getBatch());
        return slideTransition;
    }


    @Override
    public boolean isRunning() {
        return false;
    }

    @Override
    public int getErrorState() {
        return 0;
    }

    public PlatformExampleState getPongState() {
        if (pongState == null)
            pongState = new PlatformExampleState(_engine);
        return pongState;
    }
}
