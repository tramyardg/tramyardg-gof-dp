package com.tramyardg.dp.creational.abstractfactory.examples.engineandtirefactory;

public abstract class AbstractCreator {

    // Singleton Factory objects
    private static AbstractCreator carFactory = null;
    private static AbstractCreator truckFactory = null;

    public abstract IEngine getEngine();

    public abstract ITire getTyre();

    /*
     * This is the factory method exposed to the client. Client requests for a
     * factory instance by passing the type. Client does not need to know about
     * which & how object is created internally.
     *
     * Hides the instantiation of factory in close door behind the client.
     */
    public static AbstractCreator getFactory(String vehicleType) throws UnknownVehicleTypeException {

        if (vehicleType == null) {
            return null;
        }

        AbstractCreator factory;
        if ("car".equals(vehicleType)) {
            if (carFactory == null) {
                carFactory = new ConcreteCreatorCar();
            }
            factory = carFactory;
        } else if ("truck".equals(vehicleType)) {
            if (truckFactory == null) {
                truckFactory = new ConcreteCreatorTruck();
            }
            factory = truckFactory;
        } else {
            throw new UnknownVehicleTypeException();
        }
        return factory;
    }

}
