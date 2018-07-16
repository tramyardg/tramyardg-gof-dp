package com.tramyardg.dp.structural.facade;

import com.tramyardg.util.LoggerSingleton;

public class Client {

    public static void main(String[] args) {
	LoggerSingleton.getInstance("Client").info("Wedding planning activities:");
	WeddingPlanner planner = new WeddingPlanner();
	planner.organize();
    }
    
}
