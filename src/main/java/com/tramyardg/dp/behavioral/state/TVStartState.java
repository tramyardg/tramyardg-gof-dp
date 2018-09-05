package com.tramyardg.dp.behavioral.state;

import com.tramyardg.util.LoggerSingleton;

public class TVStartState implements State {

    @Override
    public void doAction() {
	LoggerSingleton.getInstance(this.getClass().getName()).info("TV is turned ON!");
    }

}
