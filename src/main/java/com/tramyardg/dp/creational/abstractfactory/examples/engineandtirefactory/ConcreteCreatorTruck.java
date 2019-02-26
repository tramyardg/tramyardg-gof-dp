package com.tramyardg.dp.creational.abstractfactory.examples.engineandtirefactory;

public class ConcreteCreatorTruck extends AbstractCreator {

    @Override
    public IEngine getEngine() {
        return new ConcreteEngineTruck();
    }

    @Override
    public ITire getTyre() {
        return new ConcreteTireTruck();
    }

}
