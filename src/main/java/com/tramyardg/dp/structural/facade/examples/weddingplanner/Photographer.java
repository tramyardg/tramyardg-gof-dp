package com.tramyardg.dp.structural.facade.examples.weddingplanner;

import com.tramyardg.util.LoggerSingleton;

public class Photographer {

    public void book() {
	LoggerSingleton.getInstance(this.getClass().getName()).info("Book photographer");
    }
    
}
