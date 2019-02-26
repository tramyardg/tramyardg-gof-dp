package com.tramyardg.dp.structural.facade.examples.weddingplanner;

import com.tramyardg.util.LoggerSingleton;

class Restaurant {

    void placeOrder() {
        LoggerSingleton.getInstance(this.getClass().getName()).info("Order food");
    }

}
