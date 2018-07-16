package com.tramyardg.dp.structural.facade;

import com.tramyardg.util.LoggerSingleton;

public class Vehicle {

    public void reserve() {
	LoggerSingleton.getInstance(this.getClass().getName()).info("Reserve vehicle");
    }
    
}
