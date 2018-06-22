package com.tramyardg.dp.structural.bridge;

import com.tramyardg.dp.structural.bridge.color.Blue;
import com.tramyardg.dp.structural.bridge.color.Green;
import com.tramyardg.dp.structural.bridge.color.Red;
import com.tramyardg.dp.structural.bridge.shape.Circle;
import com.tramyardg.dp.structural.bridge.shape.Rectangle;
import com.tramyardg.dp.structural.bridge.shape.Square;

public class BridgeClient {

    public static void main(String[] args) {
	Shape[] shapes = { new Circle(new Red()), new Rectangle(new Green()), new Square(new Blue()) };

	for (Shape shape : shapes) {
	    shape.draw();
	}
    }

}
