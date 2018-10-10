package com.tramyardg.dp.creational.abstractfactory.examples.knifeshop;

public class ConcreteProductChefsKnife extends ProductKnife {
    
    @Override
    public void sharpen() {
	System.out.println("Sharpening chefs knife");
    }
    
    @Override
    public void polish() {
	System.out.println("Polishing chefs knife");
    }
    
    @Override
    public void shipped() {
	System.out.println("Shipping chefs knife");
    }
    
    public void test() {
	
    }
    
}
