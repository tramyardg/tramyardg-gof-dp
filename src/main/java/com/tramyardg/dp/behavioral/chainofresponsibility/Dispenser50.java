package com.tramyardg.dp.behavioral.chainofresponsibility;

import com.tramyardg.util.LoggerSingleton;

public class Dispenser50 implements DispenseChain {

    private DispenseChain dispenseChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.dispenseChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 50) {
            // i.e. 510 / 50 = 10, not 10.2 since this is an integer
            int numberOf50s = currency.getAmount() / 50;
            // i.e. 520 % 50 = 20
            int remainder = currency.getAmount() % 50;
            String out = "Dispensing " + numberOf50s + " 50$ note(s)";
            LoggerSingleton.getInstance(Dispenser50.class.getName()).info(out);
            if (remainder != 0) {
                this.dispenseChain.dispense(new Currency(remainder));
            }
        } else {
            this.dispenseChain.dispense(currency);
        }
    }

}
