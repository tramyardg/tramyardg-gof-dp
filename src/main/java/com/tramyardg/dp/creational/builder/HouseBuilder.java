package com.tramyardg.dp.creational.builder;

/**
 * Contains methods for the step by step construction of
 * the product. It also has a build method for
 * retrieving the product object (House).
 *
 * @author tramyardg
 */
public interface HouseBuilder {

    HouseBuilder buildFloor();

    HouseBuilder buildWall();

    HouseBuilder buildRoof();

    House build();

}
