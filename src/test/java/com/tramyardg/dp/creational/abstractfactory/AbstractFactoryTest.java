package com.tramyardg.dp.creational.abstractfactory;

import static org.junit.Assert.*;

import java.util.logging.Logger;

import org.junit.Test;

import com.tramyardg.dp.creational.abstractfactory.examples.engineandtirefactory.IEngine;
import com.tramyardg.dp.creational.abstractfactory.examples.engineandtirefactory.AbstractCreator;
import com.tramyardg.dp.creational.abstractfactory.examples.engineandtirefactory.UnknownVehicleTypeException;

import junit.framework.TestCase;

public class AbstractFactoryTest extends TestCase {

    private final Logger logger = Logger.getLogger(AbstractFactoryTest.class.getName());
    
    @Test
    public void testUnknownVehicleTypeException() {
	AbstractCreator factory; 
	try {
	    factory = AbstractCreator.getFactory("bicycle");
	   
	    IEngine bicycle = factory.getEngine();
	    bicycle.design();
	    bicycle.manufacture();
	    bicycle.test();
	  	    
	} catch (UnknownVehicleTypeException e) {
	    logger.warning(e.getMessage());
	    assertEquals(e.getMessage(), "Unknown vehicle type! Only car and truck supported.");
	}
    }
    
    @Test
    public void testGetVehicleType() {
	AbstractCreator factory;
	try {
	    factory = AbstractCreator.getFactory("bicycle");
	    IEngine engine = factory.getEngine();
	    assertNotEquals(engine.getVehicleType(), "bicycle");
	    
	    factory = AbstractCreator.getFactory("car");
	    IEngine car = factory.getEngine();
	    assertEquals(car.getVehicleType(), "car");
	    
	    factory = AbstractCreator.getFactory("truck");
	    IEngine truck = factory.getEngine();
	    assertEquals(truck.getVehicleType(), "truck");
	} catch (UnknownVehicleTypeException e) {
	    logger.warning(e.getMessage());
	}
    }

}
