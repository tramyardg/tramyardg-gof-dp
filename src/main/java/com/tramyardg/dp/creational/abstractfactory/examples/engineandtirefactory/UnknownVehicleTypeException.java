package com.tramyardg.dp.creational.abstractfactory.examples.engineandtirefactory;

public class UnknownVehicleTypeException extends Exception {

    private static final long serialVersionUID = -3570080732989593450L;

    UnknownVehicleTypeException() {
        super("Unknown vehicle type! Only car and truck supported.");
    }

}
