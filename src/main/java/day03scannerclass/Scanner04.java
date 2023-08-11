package day03scannerclass;

import java.util.Scanner;

public class Scanner04 {

    public static void main(String[] args) {

        //Example:ask user to enter a 5 digits number
        // print the sum of first two and the last two digits

   Scanner input = new Scanner (System.in);
        System.out.println("Please enter a 5 digit number");
        int num = input.nextInt();
                int firstTwo = num/1000;
        System.out.println(firstTwo);

        //modulus operator: returns the remainder of a division operation
        // Modular operator is the %
        int lastTwo = num%100;
        System.out.println(lastTwo);

        System.out.println( "The sum is:" + firstTwo+lastTwo);
    }
}
