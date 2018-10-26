package com.tramyardg.dp.structural.decorator;

public class Client {

    public static void main(String[] args) {
	
	IComponentPizza[] orders = {
		new ConcreteDecoratorPepperoni(new ConcreteComponentPlainPizza()),
		new ConcreteDecoratorMushroom(new ConcreteDecoratorChicken(new ConcreteComponentPlainPizza())),
		new ConcreteDecoratorChicken(new ConcreteComponentPlainPizza())
	};
	
	for (IComponentPizza pizza : orders) {
	    pizza.prepare();
	}
	
	// since PlainPizza is a Pizza it can be used as a parameter of a concrete decorators
	// i.e. PepperoniToppings, ChickenToppings, MushroomToppings
	
    }

}
