package com.tramyardg.dp.structural.facade.examples.banksystem;

public class Customer {

    public static void main(String[] args) {
        BankService bs = new BankService();
        int chequingAc = bs.createAccount2("chequing", 1000.0);
        int savingAc = bs.createAccount2("saving", 20.0);
        bs.transferMoney(savingAc, chequingAc, 200.0);
        System.out.println(chequingAc);

        // this part is not facade since createAccount is exposed to the client
        IAccount chequing = bs.createAccount("chequing", 2000.0);
        chequing.withdraw(20.0);
        System.out.println(chequing.getBalance());
        System.out.println(chequing.getAccountNumber());
        IAccount savings = bs.createAccount("saving", 100.0);
        chequing.transfer(savings, 20.0);
        System.out.println(savings.getBalance());
        System.out.println("chequing balance: " + chequing.getBalance());

    }

}
