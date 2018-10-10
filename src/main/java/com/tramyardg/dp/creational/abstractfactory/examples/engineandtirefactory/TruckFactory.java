package com.tramyardg.dp.creational.abstractfactory.examples.engineandtirefactory;

public class TruckFactory extends Factory {

    @Override
    public Engine getEngine() {
	return new TruckEngine();
    }

    @Override
    public Tyre getTyre() {
	return new TruckTyre();
    }

}
