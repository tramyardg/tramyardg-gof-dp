package com.tramyardg.dp.behavioral.chainofresponsibility;

import com.tramyardg.util.LoggerSingleton;

public class Dispenser10 implements DispenseChain {

    private DispenseChain dispenseChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
	this.dispenseChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
	if (currency.getAmount() >= 10) {
	    int numberOf10s = currency.getAmount() / 10;
	    int remainder = currency.getAmount() % 10;
	    String out = "Dispensing " + numberOf10s + " 10$ note(s)";
	    LoggerSingleton.getInstance(Dispenser10.class.getName()).info(out);
	    if (remainder != 0) {
		this.dispenseChain.dispense(new Currency(remainder));
	    }
	} else {
	    this.dispenseChain.dispense(currency);
	}
    }

}
