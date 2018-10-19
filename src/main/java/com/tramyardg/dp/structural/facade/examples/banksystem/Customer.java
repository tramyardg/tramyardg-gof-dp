package com.tramyardg.dp.structural.facade.examples.banksystem;

public class Customer {

    public static void main(String[] args) {
	BankService bs = new BankService();
	// IAccount chequing = bs.createAccount("chequing", 200.0);
	// chequing.withdraw(20.0);
	// System.out.println(chequing.getBalance());

	// int checquingAc = bs.createAccount2("chequing", 1000.0);
	// int savingAc = bs.createAccount2("saving", 20.0);
	// bs.transferMoney(savingAc, checquingAc, 100.0);
	//
	System.out.println((bs.generateRand5Num()));

    }

}
