package com.tramyardg.dp.structural.bridge.color;

import com.tramyardg.dp.structural.bridge.Color;
import com.tramyardg.util.LoggerSingleton;

public class Red implements Color {

    @Override
    public void applyColor() {
	LoggerSingleton.getInstance(Red.class.getName()).info("red color");
    }

}
