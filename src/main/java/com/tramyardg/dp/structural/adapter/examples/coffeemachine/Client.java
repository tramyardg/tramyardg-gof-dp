package com.tramyardg.dp.structural.adapter.examples.coffeemachine;

public class Client {
    public static void main(String[] args) {
	CoffeeTouchscreenAdapter adapter = new CoffeeTouchscreenAdapter();
	adapter.chooseFirstSelection();
	adapter.chooseSecondSelection();
    }
}
