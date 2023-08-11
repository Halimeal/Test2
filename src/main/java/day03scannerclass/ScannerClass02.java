package day03scannerclass;

import java.util.Scanner;

public class ScannerClass02 {

    public static void main(String[] args) {

        //1. step:Create a Scanner class object

        Scanner input = new Scanner(System.in);


        //2. Step: Give the Message to the user

        System.out.println("Enter the width and the length of a rectangle...");

        //3. Step: Create proper containers for the user input

        double width;
        width = input.nextDouble();

        double length;
        length= input.nextDouble();

        System.out.println("The perimeter is:" + (2*width+ 2*length));



    }


}
