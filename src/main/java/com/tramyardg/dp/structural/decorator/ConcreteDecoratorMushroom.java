package com.tramyardg.dp.structural.decorator;

import com.tramyardg.util.LoggerSingleton;

public class ConcreteDecoratorMushroom extends AbstractDecorator {

    public ConcreteDecoratorMushroom(IComponentPizza pizza) {
	super(pizza);
    }
    
    @Override
    public void prepare() {
	super.prepare();
	LoggerSingleton.getInstance(this.getClass().getName()).info(" + Mushrooms");
    }

}
