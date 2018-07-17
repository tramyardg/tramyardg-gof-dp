package com.tramyardg.dp.structural.decorator;

import com.tramyardg.util.LoggerSingleton;

public class PepperoniToppings extends ToppingDecorator {

    public PepperoniToppings(Pizza pizza) {
	super(pizza);
    }
    
    @Override
    public void prepare() {
	super.prepare();
	LoggerSingleton.getInstance(this.getClass().getName()).info(" + Pepperoni");
    }

}
