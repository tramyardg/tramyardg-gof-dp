package com.tramyardg.dp.creational.factorymethod;

public class VehicleFactory {

    IVehicle getVehicle(String vehicleType) throws VehicleTypeNotFoundException {
        IVehicle vehicle;
        if (vehicleType == null) {
            return null;
        }
        if ("car".equals(vehicleType)) {
            vehicle = new ConcreteVehicleCar();
        } else if ("truck".equals(vehicleType)) {
            vehicle = new ConcreteVehicleTruck();
        } else if ("motorcycle".equals(vehicleType)) {
            vehicle = new ConcreteVehicleMotorcycle();
        } else {
            throw new VehicleTypeNotFoundException();
        }
        return vehicle;
    }
}
