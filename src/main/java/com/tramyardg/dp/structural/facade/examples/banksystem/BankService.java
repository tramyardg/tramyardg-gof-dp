package com.tramyardg.dp.structural.facade.examples.banksystem;

import java.math.BigDecimal;
import java.util.Hashtable;

/**
 * This is the facade class that shows no hint of underlying implementation of
 * other classes. It also prevents the client class from seeing how other
 * objects behave.
 * 
 * @author RAYMARTHINKPAD
 *
 */
public class BankService {
    private Hashtable<Integer, IAccount> bankAccounts;
    
    public BankService() {
	this.bankAccounts = new Hashtable<Integer, IAccount>();
    }
    
    public int createAccount(String type, BigDecimal initAmount) {
	IAccount newAccount = null;
	switch (type) {
	case "checking":
	    newAccount = new Chequing(initAmount);
	    break;
	case "saving":
	    newAccount = new Saving(initAmount);
	    break;
	}
	return 0;
	
    }
}
