package com.tramyardg.dp.creational.singleton;

import org.junit.Test;

import com.tramyardg.dp.creational.singleton.Singleton;

import junit.framework.TestCase;

public class SingletonTest extends TestCase {

    @Test
    public void test() {
	Singleton object1 = Singleton.getInstance();	
	Singleton object2 = Singleton.getInstance();
	assertEquals(object1, object2);
    }

}
