package com.tramyardg.dp.creational.abstractfactory.examples.knifeshop;

public class Client {
    public static void main(String[] args) {
	// since BudgetKnifeStore extends KnifeStore
	ConcreteCreator bks = new ConcreteCreator(); 
	bks.orderKnife("chefs");
    }
}
