package com.tramyardg.dp.structural.adapter;

import java.util.logging.Logger;

public class Payment {

    private final Logger logger = Logger.getLogger(Payment.class.getName());
    
    private String type;
    private double amount;
    
    public Payment(String type, double amount) {
	super();
	this.type = type;
	this.amount = amount;
    }
    
    public void pay() {
	String out = type + " " + amount + "$";
	logger.info(out);
    }
}
