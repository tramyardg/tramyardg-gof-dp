package com.tramyardg.dp.creational.factorymethod;

import java.util.logging.Logger;

import org.junit.Test;

import junit.framework.TestCase;

public class FactoryMethodTest extends TestCase {

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
	    assertEquals("Invalid vehicle type", e.getMessage());
	}

    }

}
