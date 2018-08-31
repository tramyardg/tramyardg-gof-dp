package com.tramyardg.dp.behavioral.chainofresponsibility;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

	// InitDispenser default constructor was called to initialize dispenser
	InitDispenser init = new InitDispenser();

	while (true) {
	    int amount = 0;
	    System.out.println("Enter amount to dispense below");
	    Scanner input = new Scanner(System.in);
	    amount = input.nextInt();

	    if (amount % 10 != 0) {
		System.out.println("Amount should be in multiple of 10s.");
		System.out.println("Exiting...");
		System.out.println("Done.");
		return;
	    }

	    init.getDispenseChain().dispense(new Currency(amount));
	}

    }

}
