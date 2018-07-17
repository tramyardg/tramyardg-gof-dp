## Decorator

### When to use
- To dynamically change the functionality of an object at runtime without impacting the 
existing functionality of the objects.
- To add functionalities that may be withdrawn later.
- To combine multiple functionalities where it is impractical to create 
a subclass for every possible combination.

### Intent
Attach additional responsibilities to an object dynamically. It provides a flexible
alternative to subclassing for extending functionality.

### Benefits
- It allows us to mix and match features instead of creating concrete implementations 
for all possible combinations.
- Decorator allows us to modify an object in a much more modular and less fundamental
way than inheritance would.
- New functionalities can be easily supported.

### Drawbacks
- Multiple small objects are created in the process of creating an object.
- Complexity is increased.