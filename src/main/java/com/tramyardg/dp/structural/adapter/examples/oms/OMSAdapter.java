package com.tramyardg.dp.structural.adapter.examples.oms;

import java.util.logging.Logger;

/**
 * An adapter is needed to make the existing
 * application work with the new OMS.
 *
 * @author RAYMARTHINKPAD
 */
public class OMSAdapter {

    private final Logger logger = Logger.getLogger(OMSAdapter.class.getName());
    private NewOMS newOMS;

    public OMSAdapter() {
        // by default the adapter uses the new OMS
        newOMS = new NewOMS();
    }

    // the new OMS accepts only JSON format input
    // Convert the client requests from XML to JSON
    private void convertXMLtoJSON(Object obj) {
        logger.info("Converted from XML to JSON");
    }

    void addItem(Item item) {
        convertXMLtoJSON(item); // first convert to JSON then
        newOMS.addToBasket(item); // add to basket
    }

    void makePayment(Payment payment) {
        convertXMLtoJSON(payment);
        newOMS.pay(payment);
    }
}
