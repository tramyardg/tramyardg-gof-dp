package com.tramyardg.dp.creational.abstractfactory.examples.engineandtirefactory;

public class ConcreteCreatorCar extends AbstractCreator {

    @Override
    public IEngine getEngine() {
        return new ConcreteEngineCar();
    }

    @Override
    public ITire getTyre() {
        return new ConcreteTireCar();
    }

}
