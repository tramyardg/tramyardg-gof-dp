package tramyardg.dp.creational.singleton;

public class Demo {

    public static void main(String[] args) {
	
	// make sure that you only have 1 class instance
	// result is the same
	Singleton object1 = Singleton.getInstance();
	object1.printUniqueObjectId();
	
	Singleton object2 = Singleton.getInstance();
	object2.printUniqueObjectId();
	
    }
}
