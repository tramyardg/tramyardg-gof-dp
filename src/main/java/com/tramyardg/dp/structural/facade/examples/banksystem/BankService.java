package com.tramyardg.dp.structural.facade.examples.banksystem;

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

    /**
     *
     * @param type
     *            of account
     * @param initAmount
     *            initial amount
     * @return account number after it was created
     */
    public IAccount createAccount(String type, double amount) {
	IAccount newAccount = null;
	switch (type) {
	case "chequing":
	    newAccount = new Chequing(amount);
	    // generate and set account number
	    break;
	case "saving":
	    newAccount = new Saving(amount);
	    break;
	default:
	    System.out.println("Invalid account type");
	}
	return newAccount;
    }

    /**
     * 
     * @param to
     *            transfer amount to
     * @param from
     *            transfer amount from
     * @param amount
     *            to be transferred
     */
    public void transferMoney(int to, int from, double amount) {
	IAccount toAccount = this.bankAccounts.get(to);
	IAccount fromAccount = this.bankAccounts.get(from);
	fromAccount.transfer(toAccount, amount);
    }

}
