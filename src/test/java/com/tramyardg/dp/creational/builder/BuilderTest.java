package com.tramyardg.dp.creational.builder;

import org.junit.Test;

import junit.framework.TestCase;

public class BuilderTest extends TestCase {

    @Test
    public void test() {
	HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
	HouseBuildDirector concreteHouseBuildDirector = new HouseBuildDirector(concreteHouseBuilder);
	assertEquals("concrete", concreteHouseBuildDirector.construct().getFloorType());
	
	HouseBuilder woodenHouseBuilder = new WoodenHouseBuilder();
	HouseBuildDirector woodenHouseBuildDirector = new HouseBuildDirector(woodenHouseBuilder);
	assertEquals("wood", woodenHouseBuildDirector.construct().getWallType());
	
	assertNotSame(concreteHouseBuildDirector.construct(), woodenHouseBuildDirector.construct().getWallType());
    }

}
