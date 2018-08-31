package com.tramyardg.dp.behavioral.chainofresponsibility;

import com.tramyardg.util.LoggerSingleton;

public class Dispenser20 implements DispenseChain {

    private DispenseChain dispenseChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
	this.dispenseChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
	if (currency.getAmount() >= 20) {
	    int numberOf20s = currency.getAmount() / 20;
	    int remainder = currency.getAmount() % 20;
	    String out = "Dispensing " + numberOf20s + " 20$ note(s)";
	    LoggerSingleton.getInstance(Dispenser20.class.getName()).info(out);
	    if (remainder != 0) {
		this.dispenseChain.dispense(new Currency(remainder));
	    }
	} else {
	    this.dispenseChain.dispense(currency);
	}
    }

}
