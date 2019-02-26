package com.tramyardg.dp.behavioral.templatemethod;

import com.tramyardg.util.LoggerSingleton;

public class HawaiianPizza extends Pizza {

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
        int cookingDuration = 10;
        LoggerSingleton.getInstance(this.getClass().getName()).info("cook for " + cookingDuration);
    }

}
