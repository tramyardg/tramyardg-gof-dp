package com.tramyardg.dp.creational.factorymethod;

import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

public class FactoryMethodTest {

    private final Logger logger = Logger.getLogger(FactoryMethodTest.class.getName());

    @Test
    public void testVehicleType() {
        VehicleFactory factory = new VehicleFactory();
        IVehicle bus;
        try {
            bus = factory.getVehicle("bus");
            bus.design();
            bus.manufacture();
        } catch (VehicleTypeNotFoundException e) {
            logger.warning(e.getMessage());
            Assert.assertEquals("Invalid vehicle type", e.getMessage());
        }

    }

}
