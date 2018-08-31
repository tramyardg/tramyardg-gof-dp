package com.tramyardg.dp.behavioral.chainofresponsibility;

public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);

    void dispense(Currency currency);

}
