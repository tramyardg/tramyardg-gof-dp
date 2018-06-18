### When to use
- To support families of related or dependent objects.
- To encapsulate platform dependencies to make an application portable.
- To prevent client code from using the *new* operator.
- To easily swap the underlying platform with minimal changes.

### Intent
Provide an interface for creating families of related or dependent objects without specifying their concrete classes.

### Components
1. An Abstract Factory class (public)
2. Factory implementations for various families (protected)
3. Interfaces for various products (public)
4. Set of products implementation for various families (protected)

### UML class diagram
![Abstract Factory](https://github.com/tramyardg/tramyardg-gof-dp/blob/master/src/main/java/com/tramyardg/dp/creational/abstractfactory/img_abstract_factory_uml.png)

### Benefits
- Loosely coupled code.
- Abstract Factory provides a single point of entry for all products in a family.
- New product family can be easily supported.

### Drawbacks
- More layers of abstraction increases complexity.
- If there are any changes to any underlying detail of one factory, the interface might need to be modified for all the factories.