package com.tramyardg.dp.creational.prototype;

import java.util.logging.Logger;

public class PrototypeClient {

    static final Logger logger = Logger.getLogger(PrototypeClient.class.getName());
    
    public static void main(String[] args) throws CloneNotSupportedException {

	MachineImage linuxVM = new MachineImage("Linux", "Norton");

	// cloning Linux virtual machine
	MachineImage webServer = linuxVM.clone();
	// adding a web server software
	webServer.install(" + Web Server S/W");
	
	// cloning web server
	MachineImage appServer = webServer.clone();
	// adding App server software 
	appServer.install(" + App Server S/W");
	
	// cloning App server
	MachineImage databaseServer = appServer.clone();
	// adding database server component
	databaseServer.install(" + Database Server S/W");
	
	// printing Linux virtual machine with web server software
	logger.info("Web Server configuration: ");
	webServer.printSoftware();
	
	// printing Linux virtual machine with web server and app server software
	logger.info("Web Server configuration + App Server: ");
	appServer.printSoftware();
	
	// printing Linux virtual machine with web server, app server, and database server components.
	logger.info("Linux virtual machine + Norton + Web Server + App Server + Database Server: ");
	databaseServer.printSoftware();
	
    }

}
