## Facade

### When to use
- To provide a simplified interface to the overall functionality of a complex subsystem.
- To promote subsystem independence and portability.

### Intent
Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes a subsystem easier to use.

### UML class diagram
Wedding Planner <br/>
![Facade](https://github.com/tramyardg/tramyardg-gof-dp/blob/master/src/main/java/com/tramyardg/dp/structural/facade/examples/weddingplanner/img_facade_uml.png)
<br/> 
Bank System <br/>
![Facade](https://github.com/tramyardg/tramyardg-gof-dp/blob/master/src/main/java/com/tramyardg/dp/structural/facade/examples/banksystem/bank-system.png)


### Benefits
- Number of objects the client interact with is minimal which reduces the compilation complexity.
- Promotes **loose coupling**
- Allows the client to use the subsystem interfaces.

### Drawback(s)
- One more layer is introduced in the system which may impact the performance.



