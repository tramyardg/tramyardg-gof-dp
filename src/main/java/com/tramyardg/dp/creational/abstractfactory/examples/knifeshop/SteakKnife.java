package com.tramyardg.dp.creational.abstractfactory.examples.knifeshop;

public class SteakKnife extends Knife {
    
    @Override
    public void sharpen() {
	System.out.println("Sharpening steak knife");
    }

    @Override
    public void polish() {
	System.out.println("Polishing steak knife");
    }

    @Override
    public void shipped() {
	System.out.println("Shipping steak knife");
    }
    
}
