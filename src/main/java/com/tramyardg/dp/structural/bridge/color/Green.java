package com.tramyardg.dp.structural.bridge.color;

import com.tramyardg.dp.structural.bridge.Color;
import com.tramyardg.util.LoggerSingleton;

public class Green implements Color {

    @Override
    public void applyColor() {
        LoggerSingleton.getInstance(Green.class.getName()).info("green color");
    }

}
