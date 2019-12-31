package basicJava;

/**
 * Singleton pattern restricts the instantiation of a class and ensures that
 * only one instance of the class exists in the java virtual machine.
 *
 */
public class Singleton {

	// Private static variable of the same class that is the only instance of
	// the class.

	private static Singleton MySingleton = null;

	// Private constructor to restrict instantiation of the class from other
	// classes.

	private Singleton() {
	}

	// Public static method that returns the instance of the class, this is the
	// global access point for outer world to get the instance of the singleton
	// class.

	public static Singleton getSingleton() {
		if (MySingleton != null)
			return MySingleton;
		else
			return new Singleton();
	}

}
