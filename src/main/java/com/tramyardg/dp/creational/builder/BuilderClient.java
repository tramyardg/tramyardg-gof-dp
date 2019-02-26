package com.tramyardg.dp.creational.builder;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BuilderClient {

    private final static Logger logger = Logger.getLogger(BuilderClient.class.getName());

    public static void main(String[] args) {

        // construct a concrete house
        HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
        HouseBuildDirector concreteHouseBuildDirector = new HouseBuildDirector(concreteHouseBuilder);
        String concreteHouse = concreteHouseBuildDirector.construct().toString();
        logger.log(Level.INFO, concreteHouse);
        // prints ()=> INFO: House [floorType=concrete, wallType=concrete, roofType=concrete]

        // construct a wooden house
        HouseBuilder woodenHouseBuilder = new WoodenHouseBuilder();
        HouseBuildDirector woodenHouseBuildDirector = new HouseBuildDirector(woodenHouseBuilder);
        String woodenHouse = woodenHouseBuildDirector.construct().toString();
        logger.log(Level.INFO, woodenHouse);
        // prints ()=> INFO: House [floorType=wood, wallType=wood, roofType=wood]

    }

}
