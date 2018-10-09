package com.tramyardg.dp.creational.factorymethod.examples.knifeshop;

public abstract class KnifeStore {

    public Knife orderKnife(String knifeType) {
	Knife knife;
	knife = createKnife(knifeType);
	knife.sharpen();
	knife.polish();
	knife.shipped();
	return null;
    }

    abstract Knife createKnife(String knifeType);
    
}
