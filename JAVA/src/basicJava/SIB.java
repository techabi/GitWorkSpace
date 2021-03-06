package basicJava;

/**
 * SIB(Static Initialization Block) executes when the class gets loaded and
 * executes only once in entire execution no matter how many objects of that
 * type you create. A class can have any number of SIB like IIB are, and can be
 * placed anywhere in the class body. A SIB is enclosed in braces, { }, and
 * preceded by the static keyword. A static initialization block resembles a
 * method with no name, no arguments, and no return type. It doesn't need a
 * name, because there is no need to refer to it from outside the class
 * definition. A static initialization block cannot contain a return statement
 * like a constructor. Static initialization block doesn't have an argument
 * list.
 * 
 * In case of both SIB & IIB in a Class SIB initialized first coz they load at
 * class loading time while IIb load at object creation time.
 */
public class SIB extends Parent2 {
	// IIB - 4 before constructor of Child's Constructor
	{
		System.out.println("IIB-Childs Initialization Block -4 ");
	}

	// IIB - 5 after constructor of Child's Constructor
	static {
		System.out.println("SIB-Childs Initialization Block -5 ");
	}

	public SIB() {
		super();
		System.out.println("CHILD -Constucture  called for Initialisation");
	}

	// IIB - 6 after constructor of Child's Constructor
	{
		System.out.println("IIB-Childs Initialization Block -6 ");
	}

	// IIB - 7 after constructor of Child's Constructor
	static {
		System.out.println("SIB-Childs Initialization Block -6 ");
	}

	public static void main(String[] args) {
		SIB sib_IIB = new SIB();
	}

}

class Parent2 {

	// IIB - 2 but we are printing as 1 to see order
	{
		System.out.println("IIB-Initialization Block -1 ");
	}

	// SIB - 1 but we are printing different value to see order
	static {
		System.out.println("SIB-Initialization Block -2 ");
	}

	// Constructor for class SIB_IIB to initialize object
	public Parent2() {
		System.out.println("Parent -Constucture  called for Initialisation");
	}

	// SIB - 3 after constructor to see how it executes
	static {
		System.out.println("SIB-Initialization Block -3 ");
	}
}
