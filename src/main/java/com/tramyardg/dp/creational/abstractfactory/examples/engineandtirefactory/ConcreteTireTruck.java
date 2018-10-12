package com.tramyardg.dp.creational.abstractfactory.examples.engineandtirefactory;

import java.util.logging.Logger;

public class ConcreteTireTruck implements ITire {

    private final Logger logger = Logger.getLogger(ConcreteTireTruck.class.getName());
    
    @Override
    public void design() {
	logger.info("designing truck tyre");
    }

    @Override
    public void manufacture() {
	logger.info("manufacturing truck tyre");
    }

}
