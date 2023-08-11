package Practice.old;

import java.lang.reflect.Array;
import java.util.Scanner;

public class D0713practiceLoops {
    public static void main(String[] args) {


        for( int i=0; i<11;i++){

        System.out.print(i +" ");}


        int[] numArray = new int[]{5, 6, 0, 3, 2, 5, 6, 2, 21, 1, 3, 5, 6, 7, 5};

        for(int w:numArray) {}

        System.out.println(numArray[10]);
        System.out.println();

         numArray[5] =35;
        System.out.println(numArray[5]);

        String [] daysOfTheWeek = {"Sunday", "Monday", "Tuesday","Wednesday", "Thursday","Friday"};

        for (String day : daysOfTheWeek){
            System.out.println(day);
        }

        int sum=0;
        for(int i=0; i<11; i++){
         sum= sum+i;
        }
        System.out.println(sum);

        Scanner input= new Scanner(System.in);
        System.out.println("Please enter a positive integer: ");
        int num= input.nextInt();
        int fact=1;
        for(int i=1; i<=num; i++ ){

            fact *=i;







        }System.out.println(fact);

        Scanner number1= new Scanner(System.in);
        System.out.println("Please enter a number");
        int base= number1.nextInt();

        Scanner number2= new Scanner(System.in);
        System.out.println("Please enter a second number");
        int power= number2.nextInt();
        int result=1;


        for(int i=1;i<=power;i++) {

            result *=base;
        }
        System.out.println("Result: "+ result);







    }
}
