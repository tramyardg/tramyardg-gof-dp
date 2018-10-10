package com.tramyardg.dp.creational.abstractfactory.examples.knifeshop;

public abstract class ProductKnife {

    protected void sharpen() {
	System.out.println("sharpening knife");
    }

    protected void polish() {
	System.out.println("polishing knife");
    }

    protected void shipped() {
	System.out.println("packaging knife");
    }

}
