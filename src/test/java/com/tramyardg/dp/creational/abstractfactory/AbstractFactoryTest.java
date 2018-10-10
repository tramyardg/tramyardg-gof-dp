package com.tramyardg.dp.creational.abstractfactory;

import static org.junit.Assert.*;

import java.util.logging.Logger;

import org.junit.Test;

import com.tramyardg.dp.creational.abstractfactory.examples.engineandtirefactory.Engine;
import com.tramyardg.dp.creational.abstractfactory.examples.engineandtirefactory.Factory;
import com.tramyardg.dp.creational.abstractfactory.examples.engineandtirefactory.UnknownVehicleTypeException;

import junit.framework.TestCase;

public class AbstractFactoryTest extends TestCase {

    private final Logger logger = Logger.getLogger(AbstractFactoryTest.class.getName());
    
    @Test
    public void testUnknownVehicleTypeException() {
	Factory factory; 
	try {
	    factory = Factory.getFactory("bicycle");
	   
	    Engine bicycle = factory.getEngine();
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
	Factory factory;
	try {
	    factory = Factory.getFactory("bicycle");
	    Engine engine = factory.getEngine();
	    assertNotEquals(engine.getVehicleType(), "bicycle");
	    
	    factory = Factory.getFactory("car");
	    Engine car = factory.getEngine();
	    assertEquals(car.getVehicleType(), "car");
	    
	    factory = Factory.getFactory("truck");
	    Engine truck = factory.getEngine();
	    assertEquals(truck.getVehicleType(), "truck");
	} catch (UnknownVehicleTypeException e) {
	    logger.warning(e.getMessage());
	}
    }

}
