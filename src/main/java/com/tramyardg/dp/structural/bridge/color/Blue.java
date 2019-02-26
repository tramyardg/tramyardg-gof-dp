package com.tramyardg.dp.structural.bridge.color;

import com.tramyardg.dp.structural.bridge.Color;
import com.tramyardg.util.LoggerSingleton;

public class Blue implements Color {

    @Override
    public void applyColor() {
        LoggerSingleton.getInstance(Blue.class.getName()).info("blue color");
    }

}
