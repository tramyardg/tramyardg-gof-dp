package com.tramyardg.dp.structural.decorator;

import com.tramyardg.util.LoggerSingleton;

public class MushroomToppings extends ToppingDecorator {

    public MushroomToppings(Pizza pizza) {
	super(pizza);
    }
    
    @Override
    public void prepare() {
	super.prepare();
	LoggerSingleton.getInstance(this.getClass().getName()).info(" + Mushrooms");
    }

}
