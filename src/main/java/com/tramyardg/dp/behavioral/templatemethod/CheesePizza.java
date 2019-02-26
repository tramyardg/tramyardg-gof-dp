package com.tramyardg.dp.behavioral.templatemethod;

import com.tramyardg.util.LoggerSingleton;

public class CheesePizza extends Pizza {

    @Override
    protected void addToppings() {
        LoggerSingleton.getInstance(this.getClass().getName()).info("adding cheese pizza toppings");
    }

    @Override
    protected void addIngredients() {
        LoggerSingleton.getInstance(this.getClass().getName()).info("adding cheese ingredients");
    }

    @Override
    protected void cook() {
        int cookingDuration = 10;
        LoggerSingleton.getInstance(this.getClass().getName()).info("cook for " + cookingDuration);
    }

}
