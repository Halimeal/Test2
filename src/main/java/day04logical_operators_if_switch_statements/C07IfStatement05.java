package day04logical_operators_if_switch_statements;

import java.util.Scanner;

public class C07IfStatement05 {
    public static void main(String[] args) {


        //Nested If Statement
        //Example 6: If a number is even then check if it is divisible by 3 or not. If it is divisible by 3 the output will be
        // "Perfect even number" otherwise, the output will be "Good even number."
        // If the number is odd then check if it is divisible by 3 or not. If it is divisible by 3 the output will be
        // "Perfect odd number" otherwise, the output will be "Good odd number."

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer");
        int num = input.nextInt();

        if(num%2==0){
            if(num%3==0){
                System.out.println("Perfect Even Number");
            }else {
                System.out.println("Good Even Number");
            }

        }else{
            if(num%3==0){
                System.out.println("Perfect Odd Number");}
            else {
                System.out.println("Good Odd Number");
            }

        }


       //Nested Structures need more time to be executed
        //we don't prefer to use nested structures in Java
        //If something needs more time to be executed, "It has time complexity."

    }
}
