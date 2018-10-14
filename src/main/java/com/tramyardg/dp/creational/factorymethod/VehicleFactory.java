package com.tramyardg.dp.creational.factorymethod;

public class VehicleFactory {

    /**
     * 
     * @param vehicleType
     * @return concrete vehicle based on the vehicle type
     * @throws VehicleTypeNotFoundException
     */
    public IVehicle getVehicle(String vehicleType) throws VehicleTypeNotFoundException {

	IVehicle vehicle = null;

	if (vehicleType == null) {
	    return null;
	}

	switch (vehicleType) {
	case "car":
	    vehicle = new ConcreteVehicleCar();
	    break;
	case "truck":
	    vehicle = new ConcreteVehicleTruck();
	    break;
	case "motorcycle":
	    vehicle = new ConcreteVehicleMotorcycle();
	    break;
	default:
	    throw new VehicleTypeNotFoundException();
	}

	return vehicle;
    }
}
