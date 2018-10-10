package com.tramyardg.dp.creational.abstractfactory.examples.engineandtirefactory;

import java.util.logging.Logger;

public class CarEngine implements Engine {

    private final Logger logger = Logger.getLogger(CarEngine.class.getName());
    
    @Override
    public void design() {
	logger.info("designing car engine");
    }

    @Override
    public void manufacture() {
	logger.info("manufacturing car engine");
    }

    @Override
    public void test() {
	logger.info("testing car engine");
    }
    
    @Override
    public String getVehicleType() {
	return "car";
    }

}
