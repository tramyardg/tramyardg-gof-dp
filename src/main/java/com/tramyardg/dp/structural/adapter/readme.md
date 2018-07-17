### When to use
- To wrap an existing class with a new interface.
- To perform impedance matching.

### Intent
Convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.


### Components
1. Target - defines the domain-specific interface that client uses.
2. Adapter - adapts the interface Adaptee to the Target interface.
3. Adaptee - defines an existing interface that needs adapting.
4. Client - collaborates with objects conforming to the Target interface.

### Implementation
This example illustrates an e-commerce which uses a **Legacy Order Management System (OMS)**. 
Due to the degraded performance of the legacy OMS software, you have decided to use a cheap and 
efficient OMS software which is available in the market. However, you realize that the new software implemented
a *different* interface and it requires a lot of code modification in the existing application.

Adapter pattern applies in these situations. Instead of modifying the existing application to
use the new interfaces, we can write a *wrapper* class that acts as a bridge between the current 
application and the **new OMS software**. With this approach, the e-commerce application can still
use the old interface.

### UML class diagram
#### Before adapter
![Adapter UML diagram before](https://github.com/tramyardg/tramyardg-gof-dp/blob/master/src/main/java/com/tramyardg/dp/structural/adapter/img_adapter_before_uml.png)
#### Using the adapter with new OMS
![Adapter UML diagram after](https://github.com/tramyardg/tramyardg-gof-dp/blob/master/src/main/java/com/tramyardg/dp/structural/adapter/img_adapter_after_uml.png)

### Main program (Client)
Old LegacyOMS
```java

	LegacyOMS oldOMS = new LegacyOMS();
	oldOMS.addItem(new Item("Medium Pizza", 13.99));
	oldOMS.addItem(new Item("Wine", 12.89));
	oldOMS.addItem(new Item("Beer", 6.99));
	
	oldOMS.makePayment(new Payment("CASH", 20.00));
	oldOMS.makePayment(new Payment("CREDIT", 15.00));
	oldOMS.makePayment(new Payment("DEBIT", 10.00));

	// prints
	INFO: Medium Pizza 13.99
	INFO: Wine 12.89
	INFO: Beer 6.99
	INFO: CASH 20.0$
	INFO: CREDIT 15.0$
	INFO: DEBIT 10.0$

```
New OMS using the adapter
```java

	OMSAdapter omsAdapter = new OMSAdapter();
	omsAdapter.addItem(new Item("Medium Pizza", 13.99));
	omsAdapter.addItem(new Item("Wine", 12.89));
	omsAdapter.addItem(new Item("Beer", 6.99));
	
	omsAdapter.makePayment(new Payment("CASH", 20.00));
	omsAdapter.makePayment(new Payment("CREDIT", 15.00));
	omsAdapter.makePayment(new Payment("DEBIT", 10.00));

	// prints
	INFO: Converted from XML to JSON
	INFO: Medium Pizza 13.99
	INFO: Converted from XML to JSON
	INFO: Wine 12.89
	INFO: Converted from XML to JSON
	INFO: Beer 6.99
	INFO: Converted from XML to JSON
	INFO: CASH 20.0$
	INFO: Converted from XML to JSON
	INFO: CREDIT 15.0$
	INFO: Converted from XML to JSON
	INFO: DEBIT 10.0$
		
```

### Benefits
- Class adapter can override adaptee's behaviour.
- Object adapter allows a single adapter to work with many adaptees.
- Helps achieve reusability and flexibility.
- Client class is not complicated by having to use a different interface and can use
polymorphism to swap between different implementations of adapters.
