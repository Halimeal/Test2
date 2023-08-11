package day02_datatypes;


import java.util.Scanner;

public class C05ScannerClass02 {
    public static void main(String[] args) {

        //Get User's name

        //1. Step Scanner Class Object
        Scanner input = new Scanner(System.in);

        //2. Step:Give a Massage to the user

        System.out.println("Enter your Name Please...");

        //3. Step: Get the data from User

        String userName = input.nextLine();
        System.out.println(userName);
        System.out.println("Enter your parent's first name...");
        String parentFirstName = input.next();
        System.out.println(parentFirstName);





    }


}
