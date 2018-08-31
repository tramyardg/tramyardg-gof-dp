package com.tramyardg.dp.behavioral.chainofresponsibility;

public class InitDispenser {
    
    private DispenseChain dispenseChain;

    public DispenseChain getDispenseChain() {
        return dispenseChain;
    }

    // initialize the chain
    public InitDispenser() {
	// start at 50$
	this.dispenseChain = new Dispenser50();
	
	DispenseChain c2 = new Dispenser20();
	DispenseChain c3 = new Dispenser10();
	
	dispenseChain.setNextChain(c2);
	c2.setNextChain(c3);
    }
}
