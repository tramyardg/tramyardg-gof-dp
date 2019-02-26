package com.tramyardg.dp.creational.abstractfactory.examples.knifeshop;

public abstract class AbstractCreator {

    void orderKnife(String knifeType) {
        ProductKnife knife;
        knife = createKnife(knifeType);
        knife.sharpen();
        knife.polish();
        knife.shipped();
    }

    abstract ProductKnife createKnife(String knifeType);

}
