package com.tramyardg.dp.structural.adapter.examples.oms;

public class AdapterClient {

    public static void main(String[] args) {

        OMSAdapter omsAdapter = new OMSAdapter();
        omsAdapter.addItem(new Item("Medium Pizza", 13.99));
        omsAdapter.addItem(new Item("Wine", 12.89));
        omsAdapter.addItem(new Item("Beer", 6.99));

        omsAdapter.makePayment(new Payment("CASH", 20.00));
        omsAdapter.makePayment(new Payment("CREDIT", 15.00));
        omsAdapter.makePayment(new Payment("DEBIT", 10.00));

    }

}
