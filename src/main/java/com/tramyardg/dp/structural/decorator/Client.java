package com.tramyardg.dp.structural.decorator;

public class Client {

    public static void main(String[] args) {
	
	Pizza[] orders = {
		new PepperoniToppings(new PlainPizza()),
		new MushroomToppings(new ChickenToppings(new PlainPizza())),
		new ChickenToppings(new PlainPizza())
	};
	
	for (Pizza pizza : orders) {
	    pizza.prepare();
	}
	
	// since PlainPizza is a Pizza it can be used as a parameter of a concrete decorators
	// i.e. PepperoniToppings, ChickenToppings, MushroomToppings
	
    }

}
