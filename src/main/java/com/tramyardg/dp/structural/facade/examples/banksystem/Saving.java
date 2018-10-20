package com.tramyardg.dp.structural.facade.examples.banksystem;

public class Saving implements IAccount {

    private double balance;
    private int accountNumber;

    public Saving(double amount) {
	this.balance = amount;
    }

    @Override
    public void deposit(double amount) {
	this.balance += amount;
    }

    @Override
    public void withdraw(double amount) {
	this.balance -= amount;
    }

    @Override
    public void transfer(IAccount toAccount, double amount) {
	toAccount.deposit(amount);
	this.withdraw(amount);
    }

    @Override
    public int getAccountNumber() {
	return accountNumber;
    }

    @Override
    public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
    }

    @Override
    public double getBalance() {
	return balance;
    }

}
