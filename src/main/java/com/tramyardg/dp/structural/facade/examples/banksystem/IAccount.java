package com.tramyardg.dp.structural.facade.examples.banksystem;

public interface IAccount {
    void deposit(double amount);

    void withdraw(double amount);

    void transfer(IAccount toAccount, double amount);

    int getAccountNumber();

    double getBalance();

    void setAccountNumber(int accountNumber);
}
