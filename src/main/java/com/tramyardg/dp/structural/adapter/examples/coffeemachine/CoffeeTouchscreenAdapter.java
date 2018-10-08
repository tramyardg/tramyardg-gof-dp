package com.tramyardg.dp.structural.adapter.examples.coffeemachine;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

    private OldCoffeeMachine oldVendingMachine;

    public CoffeeTouchscreenAdapter() {
	oldVendingMachine = new OldCoffeeMachine();
    }

    @Override
    public void chooseFirstSelection() {
	oldVendingMachine.selectA();
    }

    @Override
    public void chooseSecondSelection() {
	oldVendingMachine.selectB();
    }

}
