package com.tramyardg.dp.creational.builder;

/**
 * A concrete builder is responsible for creating and assembling
 * a product object.
 *
 * @author tramyardg
 */
public class ConcreteHouseBuilder implements HouseBuilder {

    private House house;

    // building a concrete house 
    public ConcreteHouseBuilder() {
        house = new House();
    }

    @Override
    public HouseBuilder buildFloor() {
        house.setFloorType("concrete");
        return this;
    }

    @Override
    public HouseBuilder buildWall() {
        house.setWallType("concrete");
        return this;
    }

    @Override
    public HouseBuilder buildRoof() {
        house.setRoofType("concrete");
        return this;
    }

    @Override
    public House build() {
        return house;
    }

}
