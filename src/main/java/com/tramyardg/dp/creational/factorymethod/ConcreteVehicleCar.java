package com.tramyardg.dp.creational.factorymethod;

import java.util.logging.Logger;

public class ConcreteVehicleCar implements IVehicle {

    private final Logger logger = Logger.getLogger(ConcreteVehicleCar.class.getName());

    @Override
    public void design() {
        logger.info("Designing car");
    }

    @Override
    public void manufacture() {
        logger.info("Manufacturing car");
    }

}