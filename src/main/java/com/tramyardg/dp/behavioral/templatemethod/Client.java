package com.tramyardg.dp.behavioral.templatemethod;

import com.tramyardg.util.LoggerSingleton;

public class Client {

    public static void main(String[] args) {
        Pizza cheesePizza = new CheesePizza();
        LoggerSingleton.getInstance("Client").info("Preparing a cheese pizza");
        cheesePizza.preparePizza();

        Pizza meatPizza = new MeatPizza();
        LoggerSingleton.getInstance("Client").info("Preparing a meat pizza");
        meatPizza.preparePizza();

        Pizza hawaiianPizza = new HawaiianPizza();
        LoggerSingleton.getInstance("Client").info("Preparing a hawaiin pizza");
        hawaiianPizza.preparePizza();
    }

}
