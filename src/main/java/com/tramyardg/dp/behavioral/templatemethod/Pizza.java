package com.tramyardg.dp.behavioral.templatemethod;

import com.tramyardg.util.LoggerSingleton;

public abstract class Pizza {

    // this will be called in client program
    // and it executes the method in the order given
    final void preparePizza() {
        addIngredients();
        addToppings();
        cook();
    }

    protected abstract void addToppings();

    protected abstract void addIngredients();

    protected void cook() {
        LoggerSingleton.getInstance(this.getClass().getName()).info("Cook for 5 minutes");
    }

}
