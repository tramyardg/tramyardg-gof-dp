package com.tramyardg.dp.creational.singleton;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Singleton {

    private final Logger logger = Logger.getLogger(Singleton.class.getName());
    
    // singleton object
    private static Singleton instance = null;

    // private constructor to avoid
    // external instantiation of this class
    private Singleton() {

    }

    // method to get singleton object
    public static Singleton getInstance() {
	if (instance == null) {
	    instance = new Singleton();
	}
	return instance;
    }
    
    public void printUniqueObjectId() {
	int uniqueObjId = System.identityHashCode(this);
	//logger.log(Level.SEVERE, "Something went wrong: {0} ", message);  // String formatting only applied if needed
	logger.log(Level.INFO, "Unique object id: {0}", uniqueObjId);
    }
}
