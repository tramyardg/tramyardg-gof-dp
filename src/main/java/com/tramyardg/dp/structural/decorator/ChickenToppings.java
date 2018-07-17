package com.tramyardg.dp.structural.decorator;

import com.tramyardg.util.LoggerSingleton;

public class ChickenToppings extends ToppingDecorator {

    public ChickenToppings(Pizza pizza) {
	super(pizza);
    }
    
    @Override
    public void prepare() {
	super.prepare();
	LoggerSingleton.getInstance(this.getClass().getName()).info(" + Chicken");
    }

}
