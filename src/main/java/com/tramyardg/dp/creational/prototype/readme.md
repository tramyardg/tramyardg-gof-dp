### When to use 
- To improve the performance when object creation is costly and time consuming
- To simplify and optimize multiple objects creation that will have mostly the same data

### Intent
Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.

### Components 
- A class that implements Cloneable interface (public)
- A client program

### UML class diagram
![UML](https://github.com/tramyardg/tramyardg-gof-dp/blob/master/src/main/java/com/tramyardg/dp/creational/prototype/img_prototype_uml.png)

### Main program
```java

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

```
