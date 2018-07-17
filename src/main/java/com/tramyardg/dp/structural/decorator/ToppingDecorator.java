package com.tramyardg.dp.structural.decorator;

/**
 * This class contains the item object which will be decorated with the new
 * functionalities.
 * 
 * @author RAYMARTHINKPAD
 *
 */
public abstract class ToppingDecorator {

    private Pizza pizza;
    
    public ToppingDecorator(Pizza pizza) {
	this.pizza = pizza;
    }
    
    public void prepare() {
	pizza.prepare();
    }
    
}
