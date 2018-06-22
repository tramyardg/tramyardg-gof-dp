### When to use
- To enforce coding for interface rather than implementation
- To transfer the responsibility of instantiation from the client class to the factory method
- To decouple the implementation from the client program

### Intent
```
Define the interface for creating an object, but let subclasses decide which class to instantiate.
Factory Method lets class defer instantiation to subclasses.
```

### Components
1. An interface or Abstract class (public)
2. Set of implementation subclasses (private)
3. A factory method (public) which a client class access

### UML class diagram
![uml](https://github.com/tramyardg/tramyardg-gof-dp/blob/master/src/main/java/com/tramyardg/dp/creational/factorymethod/img_factory_method_uml.png)

### Main program
```java
	
	VehicleFactory factory = new VehicleFactory();
	try {
	    Vehicle car = factory.getVehicle("car");
	    car.design();
	    car.manufacture();
	    
	    Vehicle motorcycle = factory.getVehicle("motorcycle");
	    motorcycle.design();
	    motorcycle.manufacture();
	    
	    Vehicle truck = factory.getVehicle("truck");
	    truck.design();
	    truck.manufacture();
	    
	    Vehicle bus = factory.getVehicle("bus");
	    bus.design();
	    bus.manufacture();
	} catch (VehicleTypeNotFoundException e) {
	    logger.info(e.getMessage());
	}
	
```

### Benefits
- Loose coupling allows changing the internals without impacting the customer code.
- Factory method provides a single point of entry for multiple products.
- Number of instances and their reusability can be controlled with Singleton or Mutiton.

### Drawbacks
- An extra level of abstraction makes the code more difficult to read.

 

