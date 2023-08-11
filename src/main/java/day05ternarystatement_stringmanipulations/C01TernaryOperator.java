package day05ternarystatement_stringmanipulations;

public class C01TernaryOperator {

    public static void main(String[] args) {
//Example 1: Type code to check if an integer is even or odd

        int a= 12;

      String Result1 =  a % 2 == 0 ? "Even" : "Odd";
        System.out.println(Result1);
        //Example 2: Type code to check if an integer has 3 digits or not

        int b= 4352;

         String result2 = b>99 && b<1000 ? "The integer has 3 digits" : "The integer does not have 3 digits";

        System.out.println(result2);

        //Example 3: Type code to calculate absolute value of a number
        // 5==>5    0 ==>0   -3 ==> 3 -3*-1=3

        double c= - 23;

        double Result3 = c<0 ? c* -1 : c ;

        System.out.println(Result3);

        //Example 4: Type code to find the of two integers if the signs are same.(positive sign or negative sign)
        // Give a message like " I do not know how to multiply" if the signs are different.

        int d= -5;
        int e= 0;

       Object result4 = (d<0 && e<0) || (d>0 && e>0)? d*e: "I do not know how to multiply";
        System.out.println(result4);
    }
}
