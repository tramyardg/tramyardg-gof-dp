package com.tramyardg.dp.structural.facade.examples.banksystem;

public interface IAccount {
    public void deposit(double amount);
    public void withdraw(double amount);
    public void transfer(IAccount toAccount, double amount);
    public int getAccountNumber();
    public double getBalance();
    public void setAccountNumber(int accountNumber);
}
