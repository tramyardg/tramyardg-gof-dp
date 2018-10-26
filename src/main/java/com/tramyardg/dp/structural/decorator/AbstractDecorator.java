package com.tramyardg.dp.structural.decorator;

/**
 * This class contains the item object which will be decorated with the new
 * functionalities. This decorator is never called in the main program (client).
 * 
 * @author RAYMARTHINKPAD
 *
 */
public abstract class AbstractDecorator implements IComponentPizza {

    private IComponentPizza pizza;
    
    // Accepts Pizza type classes (a class that implements Pizza interface)
    public AbstractDecorator(IComponentPizza pizza) {
	this.pizza = pizza;
    }
    
    public void prepare() {
	pizza.prepare();
    }
    
}
