## Decorator
Allows additional behaviours or responsibilities to be dynamically attached to an object, through the use of aggregation to combine behaviours at runtime. Aggregation is a design principle used to represent a "has-a" relationship between objects.

### When to use
- To dynamically change the functionality of an object at runtime without impacting the 
existing functionality of the objects.
- To add functionalities that may be withdrawn later.
- To combine multiple functionalities where it is impractical to create 
a subclass for every possible combination.

### Intent
Attach additional responsibilities to an object dynamically. It provides a flexible
alternative to subclassing for extending functionality.

### UML class diagram
Typical decorator design pattern<br />
![Decorator UML](https://github.com/tramyardg/tramyardg-gof-dp/blob/master/src/main/java/com/tramyardg/dp/structural/decorator/decorator_UML.png) <br />
Pizza decorator example<br />
![Decorator](https://github.com/tramyardg/tramyardg-gof-dp/blob/master/src/main/java/com/tramyardg/dp/structural/decorator/pizza_decorator_UML.png)


### Benefits
- It allows us to mix and match features instead of creating concrete implementations 
for all possible combinations.
- Decorator allows us to modify an object in a much more modular and less fundamental
way than inheritance would.
- New functionalities can be easily supported.

### Drawbacks
- Multiple small objects are created in the process of creating an object.
- Complexity is increased.