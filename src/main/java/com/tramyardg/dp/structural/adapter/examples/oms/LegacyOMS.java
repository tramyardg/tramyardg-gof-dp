package com.tramyardg.dp.structural.adapter.examples.oms;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * This old OMS accepts <b>XML</b> file as input.
 *
 * @author tramyardg
 */
class LegacyOMS {

    private final Logger logger = Logger.getLogger(LegacyOMS.class.getName());

    private List<Item> cart = new ArrayList<Item>();
    private List<Payment> payments = new ArrayList<Payment>();

    void addItem(Item itemXML) {
        cart.add(itemXML);
        logger.info(itemXML.getName() + " " + itemXML.getPrice());
    }

    void makePayment(Payment paymentXML) {
        payments.add(paymentXML);
        paymentXML.pay();
    }
}
