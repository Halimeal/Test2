package Practice.old;

import java.util.Scanner;

public class C01ForWhileDoWhileLoops {
    public static void main(String[] args) {


        for(int i=1 ;i<11;i++ ){
            System.out.print(i);
        }
        System.out.println();

        int sum =0;

        for(int a=1 ; a<11; a++){
            sum+=a;

        }
        System.out.println("Sum:" +sum);
        System.out.println();

        Scanner input= new Scanner(System.in);
        System.out.println("Enter a positive integer please:");

        int num= input.nextInt();
        System.out.println("Multiplication Table of " + num);

        for(int p=1; p<11;p++){


            System.out.println( num+ "x" + p + " = " + (num*p));
        }
        System.out.println();
        Scanner num1=new Scanner(System.in);
        System.out.println("Enter a positive number please:");
        int num2=num1.nextInt();
        int fact=1;


        for(int t=1;t<=num2;t++ ){

            fact *=t;


        }System.out.println("Factorial Value of " + fact);



    }
}
