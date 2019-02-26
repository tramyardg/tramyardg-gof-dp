package com.tramyardg.dp.structural.facade.examples.banksystem;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 * This is the facade class that shows no hint of underlying implementation of
 * other classes. It also prevents the client class from seeing how other
 * objects behave.
 *
 * @author RAYMARTHINKPAD
 */
public class BankService {
    private Hashtable<Integer, IAccount> bankAccounts;

    public Hashtable<Integer, IAccount> getBankAccounts() {
        return bankAccounts;
    }

    BankService() {
        this.bankAccounts = new Hashtable<Integer, IAccount>();
    }

    IAccount createAccount(String type, double amount) {
        IAccount newAccount = null;
        if ("chequing".equals(type)) {
            newAccount = new Chequing(amount);
            newAccount.setAccountNumber(this.generateRand5Num());
        } else if ("saving".equals(type)) {
            newAccount = new Saving(amount);
        } else {
            System.out.println("Invalid account type");
        }
        return newAccount;
    }

    int createAccount2(String type, double amount) {
        IAccount newAccount = null;
        if ("chequing".equals(type)) {
            newAccount = new Chequing(amount);
            // generate and set account number
            newAccount.setAccountNumber(this.generateRand5Num());
        } else if ("saving".equals(type)) {
            newAccount = new Saving(amount);
        } else {
            System.out.println("Invalid account type");
        }
        if (newAccount != null) {
            this.bankAccounts.put(newAccount.getAccountNumber(), newAccount);
            return newAccount.getAccountNumber();
        }
        return -1;
    }

    /**
     * @param to     transfer amount to
     * @param from   transfer amount from
     * @param amount to be transferred
     */
    void transferMoney(int to, int from, double amount) {
        IAccount toAccount = this.bankAccounts.get(to);
        IAccount fromAccount = this.bankAccounts.get(from);
        fromAccount.transfer(toAccount, amount);
    }

    private int generateRand5Num() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            list.add((int) Math.floor(Math.random() * 10));
        }
        return Integer.parseInt(StringUtils.join(list.toArray()));
    }

}
