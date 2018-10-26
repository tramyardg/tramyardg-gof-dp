package com.tramyardg.dp.structural.decorator;

import com.tramyardg.util.LoggerSingleton;

/**
 * PlainPizza is the based class of Pizza interface.
 * 
 * @author RAYMARTHINKPAD
 *
 */
public class ConcreteComponentPlainPizza implements IComponentPizza {

    @Override
    public void prepare() {
	LoggerSingleton.getInstance(this.getClass().getName()).info("Pizza");
    }

}
