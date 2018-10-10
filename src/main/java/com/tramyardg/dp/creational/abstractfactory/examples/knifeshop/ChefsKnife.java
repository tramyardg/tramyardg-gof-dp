package com.tramyardg.dp.creational.abstractfactory.examples.knifeshop;

public class ChefsKnife extends Knife {
    
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
    
}
