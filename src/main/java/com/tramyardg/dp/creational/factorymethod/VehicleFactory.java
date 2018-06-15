package com.tramyardg.dp.creational.factorymethod;

public class VehicleFactory {

    public Vehicle getVehicle(String vehicleType) throws VehicleTypeNotFoundException {
	
	Vehicle vehicle = null;
	
	if (vehicleType == null) {
	    return null;
	}

	switch (vehicleType) {
	case "car":
	    vehicle = new Car();
	    break;
	case "truck":
	    vehicle = new Truck();
	    break;
	case "motorcycle":
	    vehicle = new Motorcycle();
	    break;
	default:
	    throw new VehicleTypeNotFoundException();
	}

	return vehicle;
    }
}
