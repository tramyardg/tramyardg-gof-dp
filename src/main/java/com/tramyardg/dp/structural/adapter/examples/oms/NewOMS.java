package com.tramyardg.dp.structural.adapter.examples.oms;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * The new OMS accepts JSON format as input.
 * @author tramyardg
 *
 */
public class NewOMS {

    private final Logger logger = Logger.getLogger(NewOMS.class.getName());
    
    List<Item> cart = new ArrayList<>();
    List<Payment> payments = new ArrayList<>();
 
    public void addToBasket(Item itemJSON) {
	cart.add(itemJSON);
	logger.info(itemJSON.getName() + " " + itemJSON.getPrice());
    }
    
    public void pay(Payment paymentJSON) {
	payments.add(paymentJSON);
	paymentJSON.pay();
    }
}
