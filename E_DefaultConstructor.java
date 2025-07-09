public class E_DefaultConstructor {
	String name;
	int id;
	/** 
	 * Default Constructor will assign default values to the data members.
	 * In Java, if no constructor is defined, a default constructor 
	 * is automatically provided.
	 * Default constructor initializes the data members
	 * with default values.
	*/
	E_DefaultConstructor() { 
		System.out.println("Default constructor");
	}

	public static void main(String[] args)
	{
		E_DefaultConstructor hello = new E_DefaultConstructor();
		System.out.println("Name: " + hello.name + " and ID: " + hello.id);
	}
}
