package com.tramyardg.dp.structural.adapter.examples.oms;

public class Item {

    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }
}
