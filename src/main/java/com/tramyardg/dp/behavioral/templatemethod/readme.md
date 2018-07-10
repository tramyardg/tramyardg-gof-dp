## Template Method

### When to use
To define an **skeleton of an algorithm or an operation**. Allow subclasses to redefine part of the logic.

### Intent
Define the skeleton of an algorithm in an operation, deferring some steps
to subclasses. Template method lets subclasses redefine certain steps of
an algorithm without changing the algorithm's structure.

### Components
- An abstract class that defines the template methods (public final)
- Concrete implementations of the steps (methods) defined in the abstract class

### UML Class Diagram

### Main program (Client)

```java

	Pizza cheesePizza = new CheesePizza();
	LoggerSingleton.getInstance("Client").info("Preparing a cheese pizza");
	cheesePizza.preparePizza();
	
	Pizza meatPizza = new MeatPizza();
	LoggerSingleton.getInstance("Client").info("Preparing a meat pizza");
	meatPizza.preparePizza();
	
	Pizza hawaiianPizza = new HawaiianPizza();
	LoggerSingleton.getInstance("Client").info("Preparing a hawaiin pizza");
	hawaiianPizza.preparePizza();

```
