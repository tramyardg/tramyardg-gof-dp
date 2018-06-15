### When to use
- To enforce coding for interface rather than implementation
- To transfer the responsibility of instantiation from the client class to the factory method
- To decouple the implementation from the client program

### Intent
```
Define the interface for creating an object, but let subclasses decide which class to instantiate.
Factory Method lets class defer instantiation to subclasses.
```

### UML class diagram

### Benefits
- Loose coupling allows changing the internals without impacting the customer code.
- Factory method provides a single point of entry for multiple products.
- Number of instances and their reusability can be controlled with Singleton or Mutiton.

### Drawbacks
- An extra level of abstraction makes the code more difficult to read.

 

