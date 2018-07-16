package com.tramyardg.dp.structural.facade;

import com.tramyardg.util.LoggerSingleton;

public class Restaurant {

    public void placeOrder() {
	LoggerSingleton.getInstance(this.getClass().getName()).info("Order food");
    }
    
}
