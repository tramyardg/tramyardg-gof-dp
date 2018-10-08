package com.tramyardg.dp.structural.adapter.examples.oms;

public class Client {

    public static void main(String[] args) {
	
	LegacyOMS oldOMS = new LegacyOMS();
	oldOMS.addItem(new Item("Medium Pizza", 13.99));
	oldOMS.addItem(new Item("Wine", 12.89));
	oldOMS.addItem(new Item("Beer", 6.99));
	
	oldOMS.makePayment(new Payment("CASH", 20.00));
	oldOMS.makePayment(new Payment("CREDIT", 15.00));
	oldOMS.makePayment(new Payment("DEBIT", 10.00));
	
    }
    
}
