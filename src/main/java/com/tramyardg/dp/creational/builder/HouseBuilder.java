package com.tramyardg.dp.creational.builder;

/**
 * Contains methods for the step by step construction of
 * the product. It also has a build method for
 * retrieving the product object (House).
 * @author tramyardg
 *
 */
public interface HouseBuilder {

    public HouseBuilder buildFloor();
    public HouseBuilder buildWall();
    public HouseBuilder buildRoof();
    public House build();
    
}
