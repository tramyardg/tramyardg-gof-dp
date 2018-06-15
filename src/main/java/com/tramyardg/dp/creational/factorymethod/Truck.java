package com.tramyardg.dp.creational.factorymethod;

import java.util.logging.Logger;

public class Truck implements Vehicle {

    private final Logger logger = Logger.getLogger(Truck.class.getName());
    
    @Override
    public void design() {
	logger.info("Designing truck");
    }

    @Override
    public void manufacture() {
	logger.info("Manufacturing truck");
    }

}
