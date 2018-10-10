package com.tramyardg.dp.creational.abstractfactory.examples.knifeshop;

public class Client {
    public static void main(String[] args) {
	ConcreteCreator cc = new ConcreteCreator(); 
	cc.orderKnife("chefs");
    }
}
