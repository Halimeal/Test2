package Practice.old;
import java.util.Scanner;

public class ScannerPractice1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        float shoeSize;

        System.out.println("Please enter your name: ");
        name = scanner.nextLine();

        System.out.println( "Please enter your age: " );

        age = scanner.nextInt();

        System.out.println( "Please enter your shoe size: ");

        shoeSize = scanner.nextFloat();

        System.out.println( "Your Name is:" + name);
        System.out.println( "Your Age is:" + age);
        System.out.println( "Your Shoe-size is:" + shoeSize);


        System.out.println("Please enter the length of the side of square ");
       double num1 = scanner.nextDouble();
        System.out.println(4*num1);
        System.out.println(num1*num1);











    }
}
