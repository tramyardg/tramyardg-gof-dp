package com.tramyardg.dp.structural.decorator;

import com.tramyardg.util.LoggerSingleton;

public class PlainPizza implements Pizza {

    @Override
    public void prepare() {
	LoggerSingleton.getInstance(this.getClass().getName()).info("Pizza");
    }

}
