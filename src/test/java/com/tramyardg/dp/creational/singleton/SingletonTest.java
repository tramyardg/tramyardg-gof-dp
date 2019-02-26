package com.tramyardg.dp.creational.singleton;

import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {

    @Test
    public void test() {
        Singleton object1 = Singleton.getInstance();
        Singleton object2 = Singleton.getInstance();
        Assert.assertEquals(object1, object2);
    }

}
