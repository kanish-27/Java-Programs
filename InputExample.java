import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age:");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the name:");
        String name = sc.nextLine();
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the city:");
        String city=sc.nextLine();
        System.out.println("Hello "+name+" from "+city+" you are "+age+" years old "+"and your favourite number is "+num);
        sc.close();

    }
}
