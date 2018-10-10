package com.tramyardg.dp.creational.abstractfactory.examples.knifeshop;

/**
 * Delegates what type to create.
 * 
 * @author RAYMARTHINKPAD
 *
 */
public class ConcreteCreator extends AbstractCreator {

    @Override
    ProductKnife createKnife(String knifeType) {
	if (knifeType == "chefs") {
	    return new ConcreteProductChefsKnife();
	} else if (knifeType == "steak") {
	    return new ConcreteProductSteakKnife();
	} else {
	    return null;
	}
    }

}
