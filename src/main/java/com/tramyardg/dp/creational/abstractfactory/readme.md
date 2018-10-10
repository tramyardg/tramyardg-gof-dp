### When to use
- To support families of related or dependent objects.
- To encapsulate platform dependencies to make an application portable.
- To prevent client code from using the *new* operator.
- To easily swap the underlying platform with minimal changes.

### Intent
Provide an interface for creating families of related or dependent objects without specifying their concrete classes.

### Components
1. Creator (abstract) - factory method defined here
2. Concrete creator
3. Product (abstract)
4. Concrete products

### UML Class Diagrams
1. Engine and Tire manufacturer
![Engine and Tire Factory](https://github.com/tramyardg/tramyardg-gof-dp/blob/master/src/main/java/com/tramyardg/dp/creational/abstractfactory/examples/engineandtirefactory/img_abstract_factory_uml.png)
2. Knife store
![Knife store](https://github.com/tramyardg/tramyardg-gof-dp/blob/master/src/main/java/com/tramyardg/dp/creational/abstractfactory/examples/knifeshop/knifes_shop_uml_img.png)

### Benefits
- Loosely coupled code.
- Abstract Factory provides a single point of entry for all products in a family.
- New product family can be easily supported.

### Drawbacks
- More layers of abstraction increases complexity.
- If there are any changes to any underlying detail of one factory, the interface might need to be modified for all the factories.