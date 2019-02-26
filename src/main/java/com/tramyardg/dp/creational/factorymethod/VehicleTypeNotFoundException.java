package com.tramyardg.dp.creational.factorymethod;

class VehicleTypeNotFoundException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 4747971760858243889L;

    VehicleTypeNotFoundException() {
        super("Invalid vehicle type");
    }

}
