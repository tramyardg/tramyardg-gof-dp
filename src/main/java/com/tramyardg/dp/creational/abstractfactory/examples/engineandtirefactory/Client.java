package com.tramyardg.dp.creational.abstractfactory.examples.engineandtirefactory;

import java.util.Scanner;
import java.util.logging.Logger;

public class Client {

    static final Logger logger = Logger.getLogger(Client.class.getName());

    public static void main(String[] args) {

	Scanner in = new Scanner(System.in);
	String vehicleType = in.nextLine().toLowerCase();

	Factory factory;
	try {
	    // will return the factory based on the vehicle type provided
	    // just like a Singleton
	    factory = Factory.getFactory(vehicleType);

	    // this factory also provide the engine in either Car engine or
	    // Truck engine but not both
	    Engine engine = factory.getEngine();
	    engine.design();
	    engine.manufacture();
	    engine.test();

	    // this factory also provide the tyre
	    // Factory has two abstract methods Tire:getTyre() and
	    // Engine:getEngine()
	    Tyre tyre = factory.getTyre();
	    tyre.design();
	    tyre.manufacture();

	} catch (UnknownVehicleTypeException e) {
	    logger.warning(e.getMessage());
	}
	in.close();
    }

}
