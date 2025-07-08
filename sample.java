import java.util.Scanner;

public class sample{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age:");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the name:");
        String name = sc.nextLine();
        System.out.print("Enter a number:");
        float num=sc.nextFloat();
        sc.nextLine();
        System.out.print("Enter the boolean:");
        Boolean city=sc.nextBoolean();
        System.out.println("Hello "+name+" boolaen ans "+city+" you are "+age+" years old "+"and your favourite number is "+num);
        sc.close();

    }
}