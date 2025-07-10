public class A_Array {
    public static void main (String[] args) {
        // Declaration of Array
        // Syntax: dataType[] arrayName; or dataType arrayName[];
        // Preferred style is dataType[] arrayName;
        int[] numbers;         // Preferred style
        String fruits[];      // Also valid

        // Allocation
        numbers = new int[5];  // Creates array with 5 integers (default 0)

        // Initialization
        numbers[0] = 10;
        numbers[1] = 20;

        // Combined Declaration + Initialization
        int[] marks = {85, 90, 78, 92};

        // Accessing Elements
        System.out.println("Value at Index 3: " + marks[3]);  // Output: 92
        // Printing all elements of the array
        System.out.print("Marks: ");
        for(int i : marks) {
            System.out.print(i + " ");
        }
    }

}
