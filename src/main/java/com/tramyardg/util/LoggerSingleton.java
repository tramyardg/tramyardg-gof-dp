package com.tramyardg.util;

import java.util.logging.Logger;

public class LoggerSingleton {

    private static Logger instance = null;
    
    // private constructor to hide the implicit public one.
    private LoggerSingleton() {
	
    }
    
    public static Logger getInstance(String className) {
	if (instance == null) {
	    instance = Logger.getLogger(className);
	}
	return instance;
    }
}
