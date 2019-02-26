package com.tramyardg.dp.structural.bridge.shape;

import com.tramyardg.dp.structural.bridge.Color;
import com.tramyardg.dp.structural.bridge.Shape;
import com.tramyardg.util.LoggerSingleton;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        LoggerSingleton.getInstance(Circle.class.getName()).info("draw circle in ");
        color.applyColor();
    }

}
