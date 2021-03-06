package com.tramyardg.dp.creational.factorymethod;

import java.util.logging.Logger;

/**
 * The whole point of Factory method is to avoid
 * using new keyword (instantiating a class). Client requests for
 * an object by passing the type and factory method provides the object
 * requested for them. Client does not need to know about how the object
 * is created internally.
 *
 * @author RAYMARTHINKPAD
 */
public class Client {

    private static Logger logger = Logger.getLogger(Client.class.getName());

    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();
        try {
            IVehicle car = factory.getVehicle("car");
            car.design(); // prints Designing car
            car.manufacture(); // prints Manufacturing car
            // similarly, motorcycle and truck would be the same
            IVehicle notSupported = factory.getVehicle("bus");
            notSupported.design();
            notSupported.manufacture();
        } catch (VehicleTypeNotFoundException e) {
            logger.info(e.getMessage());
        }
    }
}
