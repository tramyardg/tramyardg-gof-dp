package com.tramyardg.dp.creational.factorymethod;

import java.util.logging.Logger;

public class Car implements Vehicle {

    private final Logger logger = Logger.getLogger(Car.class.getName());
    
    @Override
    public void design() {
	logger.info("Designing car");
    }

    @Override
    public void manufacture() {
	logger.info("Manufacturing car");
    }

}
