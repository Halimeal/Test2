package day03scannerclass;

public class ScannerClassIncrementDecrement06 {


    public static void main(String[] args) {


        //Increment means to increase value of a variable

        int age = 13;


        //1.Way:
        age = age+2;//15

        //2. Way:

        age += 2; //17
        System.out.println(age);

        // Increment can be done by multiplication as well
        //1. Way:
        age = age*2;
        System.out.println(age);//34

        //2. Way:
        age *= 2;
        System.out.println(age);//68
        //Syntax used just to increase by 1:

        age++;
        System.out.println(age);
        //Decrement means to decrease value of a variable

        age = age -2;
        System.out.println(age);//67

        age -=2;
        System.out.println(age);//65

        age = age/2;
        System.out.println(age);//32

        age /=2;
        System.out.println(age);//16
        //Syntax used just to decrease by 1:

        age--;
        System.out.println(age);//15


    }
}
