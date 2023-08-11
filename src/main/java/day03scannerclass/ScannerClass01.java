package day03scannerclass;

import java.util.Scanner;

public class ScannerClass01 {
    public static void main(String[] args) {

        //Example 1: Ask user to enter two numbers then do addition and multiplication

        //1 Step: Create a Scanner Class object
        Scanner input = new Scanner(System.in);

        // 2. Step: Give a message to the user
        System.out.println(" Enter the first number...");

        //3. Step: Select proper method and get the data from the user

      double Num1 = input.nextDouble();
        System.out.println( "Enter the second number...");
        double Num2;
        Num2 = input.nextDouble();
        System.out.println("The sum is:" + (Num1 + Num2));
        System.out.println(Num1 + "*" + Num2 + "=" + Num1*Num2);

        System.out.println( "The multiplication is:" + (Num1*Num2));



        /* Concatination means: Joining strings with each other or with other data types
        To do concatination we have 2 options
        1: Use "+" sign ---> It can be used with all data types
        2: We use concat() method to join data just for string values

        Java follows math operation priority rules when we deal with addition, multiplication, division, subtractions
         */



    }


}
