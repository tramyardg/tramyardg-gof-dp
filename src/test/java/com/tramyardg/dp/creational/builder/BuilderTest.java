package com.tramyardg.dp.creational.builder;

import org.junit.Assert;
import org.junit.Test;

public class BuilderTest {

    @Test
    public void test() {
        HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
        HouseBuildDirector concreteHouseBuildDirector = new HouseBuildDirector(concreteHouseBuilder);
        Assert.assertEquals("concrete", concreteHouseBuildDirector.construct().getFloorType());

        HouseBuilder woodenHouseBuilder = new WoodenHouseBuilder();
        HouseBuildDirector woodenHouseBuildDirector = new HouseBuildDirector(woodenHouseBuilder);
        Assert.assertEquals("wood", woodenHouseBuildDirector.construct().getWallType());

        Assert.assertNotSame(concreteHouseBuildDirector.construct(), woodenHouseBuildDirector.construct().getWallType());
    }

}
