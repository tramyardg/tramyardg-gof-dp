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
![uml](https://github.com/tramyardg/tramyardg-gof-dp/blob/master/src/main/java/com/tramyardg/dp/creational/factorymethod/img_factory_method_uml.png)

### Benefits
- Loose coupling allows changing the internals without impacting the customer code.
- Factory method provides a single point of entry for multiple products.

### Drawbacks
- An extra level of abstraction makes the code more difficult to read.

 

