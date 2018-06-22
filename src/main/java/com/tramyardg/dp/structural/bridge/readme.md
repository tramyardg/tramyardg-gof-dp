### When to use
- When run-time binding of the implementation is required.
- To support a proliferation of classes resulting from a coupled interface and numerous implementations.
- To share an implementation among multiple objects and to map orthogonal class hierarchies.

### Intent
Decouple an abstraction from its implementation so that the two can vary independently.

### Example explanation
The bridge pattern is an application of the old advice, "prefer composition over inheritance".
Say we are implementing a colored shapes. You would subclass Shape with Rectangle, Circle, and
Square. But you wouldn't want to subclass Rectangle with RedRectangle, or with BlueRectangle, or
GreenRectangle. It is preferable to implement a hierarchy of color. This means you would have
a Color interface that comprises of red, green, and blue color. 

### UML class diagram
![Bridge Design Pattern](https://github.com/tramyardg/tramyardg-gof-dp/blob/master/src/main/java/com/tramyardg/dp/structural/bridge/img_bridge_pattern_uml.png)

### Benefits
- Decoupling allows us to choose the implementation at runtime.
- Compile-time dependencies on the implementation are eliminated.
- Improved extensibility and flexibility.

### Drawbacks
- The delegation from the Entities to the Behaviors can degrade performance.