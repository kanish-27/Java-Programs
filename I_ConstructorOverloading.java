class I_ConstructorOverloading{
	int id = 102;	
	String name = "KANISH";
	int age = 20;
	// This is a default constructor.
	// It initializes the data members with default values.
	I_ConstructorOverloading(){
		System.out.println("Default constructor called.");
	}
	// This is a parameterized constructor.
	// It initializes the data members with the given 2 parameters.
	I_ConstructorOverloading(int id,String name){
		this.id = id;
		this.name = name;
	}
	// This is another parameterized constructor.
	// It initializes the data members with the given 3 parameters.
	I_ConstructorOverloading(int i,String n,int a){
		this.id = i;
		this.name = n;
		this.age = a;
	}
	void display(){
		System.out.println(id + " " + name + " " + age);	
	}
	public static void main(String args[]){
		I_ConstructorOverloading s = new I_ConstructorOverloading();
		I_ConstructorOverloading s1 = new I_ConstructorOverloading (95,"JEFF");
		I_ConstructorOverloading s2 = new I_ConstructorOverloading(107,"KARUNESH",18);
		s.display();
		s1.display();
		s2.display();
	}
}