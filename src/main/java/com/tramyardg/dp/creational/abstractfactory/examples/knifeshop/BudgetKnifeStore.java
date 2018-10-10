package com.tramyardg.dp.creational.abstractfactory.examples.knifeshop;

public class BudgetKnifeStore extends KnifeStore {

    @Override
    Knife createKnife(String knifeType) {
	if (knifeType == "chefs") {
	    return new ChefsKnife();
	} else if (knifeType == "steak") {
	    return new SteakKnife();
	} else {
	    return null;   
	}
    }

}
