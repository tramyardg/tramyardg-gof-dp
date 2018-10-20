package com.tramyardg.dp.structural.facade.examples.banksystem;

public class Customer {

    public static void main(String[] args) {
	BankService bs = new BankService();
	int chequingAc = bs.createAccount2("chequing", 1000.0);
	int savingAc = bs.createAccount2("saving", 20.0);
	bs.transferMoney(savingAc, chequingAc, 200.0);
	System.out.println(chequingAc);

    }

}
