public class B_Single {
  public static void main (String[] args) {
    // declaring and initializing an array
    String strArray[] = {"C", "C++","Java","Python", "C#"};
    
    // using a for-each loop for printing the array
    for(String i : strArray) {
      System.out.print(i + " ");
    }
    
    // find the length of an array
    System.out.println("\nLength of array: "+strArray.length);
    
  }
}