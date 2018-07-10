package com.tramyardg.dp.behavioral.templatemethod;

import com.tramyardg.util.LoggerSingleton;

public class HawaiianPizza extends Pizza {

    final int cookingDuration = 10;

    @Override
    protected void addToppings() {
	LoggerSingleton.getInstance(this.getClass().getName()).info("adding hawaiin pizza toppings");
    }

    @Override
    protected void addIngredients() {
	LoggerSingleton.getInstance(this.getClass().getName()).info("adding hawaiian pizza ingredients");
    }

    @Override
    protected void cook() {
	LoggerSingleton.getInstance(this.getClass().getName()).info("cook for " + this.cookingDuration);
    }

}
