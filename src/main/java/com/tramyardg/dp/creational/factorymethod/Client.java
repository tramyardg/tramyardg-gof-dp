package com.tramyardg.dp.creational.factorymethod;

import java.util.logging.Logger;

/**
 * The whole point of Factory method is to avoid
 * using new keyword (instantiating a class). Client requests for
 * an object by passing the type and factory method provides the object
 * requested for them. Client does not need to know about how the object
 * is created internally.
 * @author RAYMARTHINKPAD
 *
 */
public class Client {

    private final static Logger logger = Logger.getLogger(Client.class.getName());
    
    public static void main(String[] args) {
	
	VehicleFactory factory = new VehicleFactory();
	try {
	    
	    Vehicle car = factory.getVehicle("car");
	    car.design();
	    car.manufacture();
	    
	    Vehicle motorcycle = factory.getVehicle("motorcycle");
	    motorcycle.design();
	    motorcycle.manufacture();
	    
	    Vehicle truck = factory.getVehicle("truck");
	    truck.design();
	    truck.manufacture();
	    
	    Vehicle notSupported = factory.getVehicle("bus");
	    notSupported.design();
	    notSupported.manufacture();
	    
	} catch (VehicleTypeNotFoundException e) {
	    logger.info(e.getMessage());
	}
    }
}
