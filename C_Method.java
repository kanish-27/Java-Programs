class Method {
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Instance method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }
}
public class C_Method {
  
  // Main method
  public static void main(String[] args) {
	  Method.myStaticMethod(); // Call the static method
    // myPublicMethod(); // This would compile an error

		Method myObj = new Method(); // Create an object of Method
		myObj.myPublicMethod(); // Call the public method on the object
  }
}