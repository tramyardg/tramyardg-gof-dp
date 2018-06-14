package com.tramyardg.dp.creational.builder;

/**
 * A director object is responsible for constructing a product. It
 * does via the Builder interface to a Concrete Builder.
 * @author tramyardg
 *
 */
public class HouseBuildDirector {

    private HouseBuilder builder;
    
    public HouseBuildDirector(final HouseBuilder builder) {
	this.builder = builder;
    }
    
    public House construct() {
	return builder.buildFloor().buildWall().buildRoof().build();
    }
    
}
