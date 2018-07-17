package com.tramyardg.dp.structural.decorator;

import com.tramyardg.util.LoggerSingleton;

/**
 * PlainPizza is the based class of Pizza interface.
 * 
 * @author RAYMARTHINKPAD
 *
 */
public class PlainPizza implements Pizza {

    @Override
    public void prepare() {
	LoggerSingleton.getInstance(this.getClass().getName()).info("Pizza");
    }

}
