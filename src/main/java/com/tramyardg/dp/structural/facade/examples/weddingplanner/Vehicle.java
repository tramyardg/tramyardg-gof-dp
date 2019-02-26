package com.tramyardg.dp.structural.facade.examples.weddingplanner;

import com.tramyardg.util.LoggerSingleton;

class Vehicle {

    void reserve() {
        LoggerSingleton.getInstance(this.getClass().getName()).info("Reserve vehicle");
    }

}
