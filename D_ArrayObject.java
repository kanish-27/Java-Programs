class Student {
  Student(int id, String name) {
    System.out.println("Student ID: "+ id + "\nName: "+ name );
  }
}

public class D_ArrayObject {
  public static void main (String[] args) {
    // declaring an array of Object
    // lazy initialization: -  array is declared first, objects added later
    Student obj[] = new Student[3];
    
    obj[0] = new Student(96,"Jenitha");
    obj[1] = new Student(112,"Kavipriya");
    obj[2] = new Student(119,"Kowsalya");
  }
}