package com.tramyardg.dp.creational.abstractfactory;

import com.tramyardg.dp.creational.abstractfactory.examples.engineandtirefactory.AbstractCreator;
import com.tramyardg.dp.creational.abstractfactory.examples.engineandtirefactory.IEngine;
import com.tramyardg.dp.creational.abstractfactory.examples.engineandtirefactory.UnknownVehicleTypeException;
import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.assertNotEquals;

public class AbstractFactoryTest {

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
            Assert.assertEquals(e.getMessage(), "Unknown vehicle type! Only car and truck supported.");
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
            Assert.assertEquals(car.getVehicleType(), "car");

            factory = AbstractCreator.getFactory("truck");
            IEngine truck = factory.getEngine();
            Assert.assertEquals(truck.getVehicleType(), "truck");
        } catch (UnknownVehicleTypeException e) {
            logger.warning(e.getMessage());
        }
    }

}
