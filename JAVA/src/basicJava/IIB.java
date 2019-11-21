package basicJava;

/**
 * 
 Instance Initialization Blocks or IIB are used to initialize instance
 * variables. It executed before constructors. IIBs run each time when object of
 * the class is created. They are typically placed above the constructors within
 * braces.We can also have multiple IIBs in a single class which will execute
 * from top to bottom . The Instance Initialization Block is invoked after the
 * parent class constructor is invoked (i.e. after super() constructor call).
 * inclusion of IIBs in your classes is not necessary.
 *
 */
class IIB extends Parent {

	// IIB - 4 before constructor of Child's Constructor
	{
		System.out.println("Childs Initialization Block -4 ");
	}

	public IIB() {
		super();
		System.out.println("CHILD -Constucture  called for Initialisation");
	}

	// IIB - 5 after constructor of Child's Constructor
	{
		System.out.println("Childs Initialization Block -5 ");
	}

	public static void main(String[] args) {
		IIB sib_IIB = new IIB();
	}

}

class Parent {

	// IIB - 1 but we are printing different value to see order
	{
		System.out.println("Initialization Block -2 ");
	}

	// IIB - 2 but we are printing as 1 to see order
	{
		System.out.println("Initialization Block -1 ");
	}

	// Constructor for class SIB_IIB to initialize object
	public Parent() {
		System.out.println("Parent -Constucture  called for Initialisation");
	}

	// IIB - 3 after constructor to see how it executes
	{
		System.out.println("Initialization Block -3 ");
	}

}
