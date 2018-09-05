## State Design Pattern

### Intent
State is a behavioral design pattern that allows an object to alter its behavior when its internal state changes. The object will appear to change its class.

### UML Class Diagram
![State](https://github.com/tramyardg/tramyardg-gof-dp/blob/master/src/main/java/com/tramyardg/dp/behavioral/state/state_uml_img.png)

### Main Program
```

	// TVStartState and TVStopState are both State
	// therefore, we can have two
	State startState = new TVStartState();
	State stopState = new TVStopState();
	
	TVContext context = new TVContext();
	
	// start state
	context.setState(startState);
	context.doAction();
	
	// stop state
	context.setState(stopState);
	context.doAction();
	
	// Output
	Sep 04, 2018 8:36:22 PM com.tramyardg.dp.behavioral.state.TVStartState doAction
	INFO: TV is turned ON!
	Sep 04, 2018 8:36:22 PM com.tramyardg.dp.behavioral.state.TVStopState doAction
	INFO: TV is turned OFF!
	
```


