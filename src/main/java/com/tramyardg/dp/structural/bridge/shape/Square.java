package com.tramyardg.dp.structural.bridge.shape;

import com.tramyardg.dp.structural.bridge.Color;
import com.tramyardg.dp.structural.bridge.Shape;
import com.tramyardg.util.LoggerSingleton;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        LoggerSingleton.getInstance(Square.class.getName()).info("draw square in ");
        color.applyColor();
    }

}
