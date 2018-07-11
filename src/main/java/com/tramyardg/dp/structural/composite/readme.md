## Composite

### When to use
- To have a hierarchical collection of primitive and composite entities.
- To create a structure in a way that the objects in the structure can be treated the same way.

### Intent
Composite objects into three structures to represent part-whole hierarchies. Composite lets
clients treat individual objects and compositions of objects uniformly.

### Components
- Component: an interface for accessing and managing its child components
- Composite: defines behaviour for components having children, stores child components
- Leaf: represents leaf objects in the composition, has no children

### UML Class Diagram
![Composite](https://github.com/tramyardg/tramyardg-gof-dp/blob/master/src/main/java/com/tramyardg/dp/structural/composite/img_composite.png)

### Main Program (Client)

```java

	Employee employee1 = new Developer("Gavin Joyce", "Information Technology and Engineering", 55624);
	Employee employee2 = new Developer("Jenette Caldwell", "Information Technology and Engineering", 60323);
	Employee manager1 = new Manager("Jonas Alexander", "Information Technology and Engineering", 74128);
	manager1.add(employee2);
	manager1.add(employee1);
	
	Employee manager2 = new Manager("Michael Bruce", "Information Technology and Engineering", 80172);
	Manager manager3 = new Manager("Thor Walton", "Information Technology and Engineering", 98283);
	manager3.add(manager2);
	manager3.add(manager1);
	manager3.print();
	
```