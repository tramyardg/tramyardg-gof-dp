package com.tramyardg.dp.creational.abstractfactory.examples.engineandtirefactory;

import java.util.logging.Logger;

public class CarTyre implements Tyre {

    private final Logger logger = Logger.getLogger(CarTyre.class.getName());
    
    @Override
    public void design() {
	logger.info("designing car tyre");
    }

    @Override
    public void manufacture() {
	logger.info("manufacturing car tyre");
    }

}
