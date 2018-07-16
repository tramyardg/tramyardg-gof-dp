package com.tramyardg.dp.structural.facade;

import com.tramyardg.util.LoggerSingleton;

public class Hall {

    public void book() {
	LoggerSingleton.getInstance(this.getClass().getName()).info("Book marriage hall");
    }
    
}
