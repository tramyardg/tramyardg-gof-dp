package com.tramyardg.dp.structural.adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * This old OMS accepts <b>XML</b> file as input.
 * 
 * @author tramyardg
 *
 */
public class LegacyOMS {

    private final Logger logger = Logger.getLogger(LegacyOMS.class.getName());

    List<Item> cart = new ArrayList<>();
    List<Payment> payments = new ArrayList<>();

    public void addItem(Item itemXML) {
	cart.add(itemXML);
	logger.info(itemXML.getName() + " " + itemXML.getPrice());
    }

    public void makePayment(Payment paymentXML) {
	payments.add(paymentXML);
	paymentXML.pay();
    }
}
