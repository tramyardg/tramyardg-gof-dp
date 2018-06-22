### When to use
- To avoid dealing with inconsistent object when the object needs to be created over several steps.
- To avoid too many constructor arguments.
- To construct an object that should be immutable.
- To encapsulate the complete creation logic.

### Intent
```
Separate the construction of a complex object from its representation so that 
the same construction process can create different representations.
```

### Components
- Builder: an interface for creating parts of a product object i.e. house, car, dog, etc.
- ConcreteBuilder: puts together parts of the product by implementing the Builder interface. It defines and keeps track of the representations it creates and provides an interface for saving the product.
- Director: construct the complex object using the Builder interface.
- Product: represents the complex object being built.

### UML class diagram
![uml](https://github.com/tramyardg/tramyardg-gof-dp/blob/master/src/main/java/com/tramyardg/dp/creational/builder/img_builder_uml.png)

### Main program
```java

	// construct a concrete house
	HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
	HouseBuildDirector concreteHouseBuildDirector = new HouseBuildDirector(concreteHouseBuilder);
	String concreteHouse = concreteHouseBuildDirector.construct().toString();
	logger.log(Level.INFO, concreteHouse);
	// prints ()=> INFO: House [floorType=concrete, wallType=concrete, roofType=concrete]
	
	// construct a wooden house
	HouseBuilder woodenHouseBuilder = new WoodenHouseBuilder();
	HouseBuildDirector woodenHouseBuildDirector = new HouseBuildDirector(woodenHouseBuilder);
	String woodenHouse = woodenHouseBuildDirector.construct().toString();
	logger.log(Level.INFO, woodenHouse);
	// prints ()=> INFO: House [floorType=wood, wallType=wood, roofType=wood]
```