package com.tramyardg.dp.creational.abstractfactory.examples.engineandtirefactory;

import java.util.logging.Logger;

public class ConcreteEngineTruck implements IEngine {

    private final Logger logger = Logger.getLogger(ConcreteEngineTruck.class.getName());
    
    @Override
    public void design() {
	logger.info("designing truck engine");
    }

    @Override
    public void manufacture() {
	logger.info("manufacturing truck engine");
    }

    @Override
    public void test() {
	logger.info("testing truck engine");
    }
    
    @Override
    public String getVehicleType() {
	return "truck";
    }

}
