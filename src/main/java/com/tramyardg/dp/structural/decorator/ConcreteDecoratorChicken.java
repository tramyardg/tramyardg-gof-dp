package com.tramyardg.dp.structural.decorator;

import com.tramyardg.util.LoggerSingleton;

public class ConcreteDecoratorChicken extends AbstractDecorator {

    public ConcreteDecoratorChicken(IComponentPizza pizza) {
        super(pizza);
    }

    @Override
    public void prepare() {
        super.prepare();
        LoggerSingleton.getInstance(this.getClass().getName()).info(" + Chicken");
    }

}
