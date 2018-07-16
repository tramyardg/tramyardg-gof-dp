## Facade
---
### When to use
- To provide a simplified interface to the overall functionality of a complex subsystem.
- To promote subsystem independence and portability.

### Intent
Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes a subsystem easier to use.

### UML class diagram
![Facade](https://github.com/tramyardg/tramyardg-gof-dp/blob/master/src/main/java/com/tramyardg/dp/structural/facade/img_facade_uml.png)

### Main program (Client)

```java
	
	LoggerSingleton.getInstance("Client").info("Wedding planning activities:");
	WeddingPlanner planner = new WeddingPlanner();
	planner.organize();
	
	// explanation:
	// WeddingPlanner hides the complexity of a large subsystem.
	// It basically does reservations, ordering, and organizes everything for you.
	
	/*
	* com.tramyardg.dp.structural.facade.Client main
	* INFO: Wedding planning activities:
	* com.tramyardg.dp.structural.facade.Hall book
	* INFO: Book marriage hall
	* com.tramyardg.dp.structural.facade.Restaurant placeOrder
	* INFO: Order food
	* com.tramyardg.dp.structural.facade.Photographer book
	* INFO: Book photographer
	* com.tramyardg.dp.structural.facade.Vehicle reserve
	* INFO: Reserve vehicle
	*/
	
```

### Benefits
- Number of objects the client interact with is minimal which reduces the compilation complexity.
- Promotes **loose coupling**
- Allows the client to use the subsystem interfaces.

### Drawback(s)
- One more layer is introduced in the system which may impact the performance.



