package com.tramyardg.dp.behavioral.state;

public class Client {

    public static void main(String[] args) {

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
	
    }

}
