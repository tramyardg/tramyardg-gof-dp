package com.tramyardg.dp.creational.abstractfactory.examples.knifeshop;

public abstract class AbstractCreator {

    public ProductKnife orderKnife(String knifeType) {
	ProductKnife knife;
	knife = createKnife(knifeType);
	knife.sharpen();
	knife.polish();
	knife.shipped();
	return null;
    }

    abstract ProductKnife createKnife(String knifeType);
    
}
