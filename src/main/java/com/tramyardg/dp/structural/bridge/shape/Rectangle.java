package com.tramyardg.dp.structural.bridge.shape;

import com.tramyardg.dp.structural.bridge.Color;
import com.tramyardg.dp.structural.bridge.Shape;
import com.tramyardg.util.LoggerSingleton;

public class Rectangle extends Shape {

    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        LoggerSingleton.getInstance(Rectangle.class.getName()).info("draw rectangle in ");
        color.applyColor();
    }

}
