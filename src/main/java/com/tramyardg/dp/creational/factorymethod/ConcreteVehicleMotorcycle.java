package com.tramyardg.dp.creational.factorymethod;

import java.util.logging.Logger;

public class ConcreteVehicleMotorcycle implements IVehicle {

    private final Logger logger = Logger.getLogger(ConcreteVehicleMotorcycle.class.getName());
    
    @Override
    public void design() {
	logger.info("Designing motorcycle");
    }

    @Override
    public void manufacture() {
	logger.info("Manufacturing motorcycle");
    }

}
