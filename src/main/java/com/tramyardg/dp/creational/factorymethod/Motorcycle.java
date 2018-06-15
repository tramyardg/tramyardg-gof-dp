package com.tramyardg.dp.creational.factorymethod;

import java.util.logging.Logger;

public class Motorcycle implements Vehicle {

    private final Logger logger = Logger.getLogger(Motorcycle.class.getName());
    
    @Override
    public void design() {
	logger.info("Designing motorcycle");
    }

    @Override
    public void manufacture() {
	logger.info("Manufacturing motorcycle");
    }

}
