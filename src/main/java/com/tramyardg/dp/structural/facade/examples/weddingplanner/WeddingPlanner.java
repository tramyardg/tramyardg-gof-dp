package com.tramyardg.dp.structural.facade.examples.weddingplanner;

public class WeddingPlanner {

    private Hall hall;
    private Restaurant restaurant;
    private Photographer photographer;
    private Vehicle vehicle;

    public WeddingPlanner() {
        hall = new Hall();
        restaurant = new Restaurant();
        photographer = new Photographer();
        vehicle = new Vehicle();
    }

    void organize() {
        hall.book();
        restaurant.placeOrder();
        photographer.book();
        vehicle.reserve();
    }

}
