package com.tramyardg.dp.creational.factorymethod.examples.knifeshop;

public abstract class Knife {

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
