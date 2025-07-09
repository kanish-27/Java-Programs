public class G_CopyConstructor {
	int id;
	String name;
	int age;

	// Copy constructor
	G_CopyConstructor(G_CopyConstructor obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.age = obj.age;
	}

	// Parameterized constructor
	G_CopyConstructor(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	void display() {
		System.out.println(id + " " + name + " " + age);
	}

	public static void main(String args[]) {
		G_CopyConstructor s1 = new G_CopyConstructor(102, "KANISH", 18);
		G_CopyConstructor s2 = new G_CopyConstructor(s1);
		s1.display();
		s2.display();
	}
}
