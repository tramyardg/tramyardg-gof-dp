package com.tramyardg.dp.creational.factorymethod;

import java.util.logging.Logger;

public class ConcreteVehicleTruck implements IVehicle {

    private final Logger logger = Logger.getLogger(ConcreteVehicleTruck.class.getName());
    
    @Override
    public void design() {
	logger.info("Designing truck");
    }

    @Override
    public void manufacture() {
	logger.info("Manufacturing truck");
    }

}
