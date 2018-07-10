package com.tramyardg.dp.behavioral.templatemethod;

import com.tramyardg.util.LoggerSingleton;

public class MeatPizza extends Pizza {

    final int cookingDuration = 15;
    
    @Override
    protected void addToppings() {
	LoggerSingleton.getInstance(this.getClass().getName()).info("adding meat pizza toppings");
    }

    @Override
    protected void addIngredients() {
	LoggerSingleton.getInstance(this.getClass().getName()).info("adding meat ingredients");
    }

    @Override
    protected void cook() {
	LoggerSingleton.getInstance(this.getClass().getName()).info("cook for " + this.cookingDuration);
    }

}
