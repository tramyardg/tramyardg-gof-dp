package com.tramyardg.dp.structural.facade.examples.banksystem;

import java.math.BigDecimal;

public class Saving implements IAccount {
    private BigDecimal amount;

    public Saving(BigDecimal amount) {
	this.amount = amount;
    }

    @Override
    public void deposit(BigDecimal amount) {

    }

    @Override
    public void withdraw(BigDecimal amount) {

    }

    @Override
    public void transfer(IAccount toAccount, BigDecimal amount) {

    }

    @Override
    public int getAccountNumber() {
	return 0;
    }

}
