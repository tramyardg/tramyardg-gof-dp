## Facade
---
### When to use
- To provide a simplified interface to the overall functionality of a complex subsystem.
- To promote subsystem independence and portability.

### Intent
Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes a subsystem easier to use.

### Main program (Client)

```java
	
	LoggerSingleton.getInstance("Client").info("Wedding planning activities:");
	WeddingPlanner planner = new WeddingPlanner();
	planner.organize();
	
	// prints
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
