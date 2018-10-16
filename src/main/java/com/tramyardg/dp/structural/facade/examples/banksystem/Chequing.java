package com.tramyardg.dp.structural.facade.examples.banksystem;

import java.math.BigDecimal;

public class Chequing implements IAccount {

    private BigDecimal amount;

    public Chequing(BigDecimal initAmount) {
	this.amount = initAmount;
    }

    @Override
    public void deposit(BigDecimal amount) {

    }

    @Override
    public void withdraw(BigDecimal amount) {

    }

    @Override
    public void transfer(BigDecimal amount) {

    }

    @Override
    public void getAccountNumber() {

    }

}
