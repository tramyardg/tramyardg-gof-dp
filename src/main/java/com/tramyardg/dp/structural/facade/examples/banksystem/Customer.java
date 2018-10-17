package com.tramyardg.dp.structural.facade.examples.banksystem;

import java.math.BigDecimal;

public class Customer {

    public static void main(String[] args) {
	BankService bs = new BankService();
	int myChequing = bs.createAccount("chequing", new BigDecimal(2000.00));
    }
    
}
