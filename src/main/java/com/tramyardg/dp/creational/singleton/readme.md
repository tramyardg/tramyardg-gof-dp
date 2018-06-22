### When to use
- Application needs "only one instance" of a class.
- To have complete control over the instance creation.

### Intent
```
Ensure a class has only one instance, and provide a global point of access to it.
```

### UML class diagram
![uml](https://github.com/tramyardg/tramyardg-gof-dp/blob/master/src/main/java/com/tramyardg/dp/creational/singleton/img_singleton_uml.png)

### Main program
```java

	// make sure that you only have 1 class instance
	// result is the same
	Singleton object1 = Singleton.getInstance();
	object1.printUniqueObjectId();
	
	Singleton object2 = Singleton.getInstance();
	object2.printUniqueObjectId();
	
	/*
	Jun 22, 2018 4:44:31 PM com.tramyardg.dp.creational.singleton.Singleton printUniqueObjectId
	INFO: Unique object id: 1,550,089,733
	Jun 22, 2018 4:44:31 PM com.tramyardg.dp.creational.singleton.Singleton printUniqueObjectId
	INFO: Unique object id: 1,550,089,733
	*/

```
