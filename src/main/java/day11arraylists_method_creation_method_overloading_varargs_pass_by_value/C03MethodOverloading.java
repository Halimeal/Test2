package day11arraylists_method_creation_method_overloading_varargs_pass_by_value;

public class C03MethodOverloading {
    public static void main(String[] args) {

        add(3,5,7);
    }



      //Create a method adds two integers
public static int add(int a , int b){
    return a+b;
        }

        //Create a method adds three integers

    public static int add(int a, int b, int c){
    return a+b+c;

    }
    //Create a method adds one integer and one double

    public static double add(int a, double b){
    return a + b;

    }
    //Create a method adds one double and one integer

    public static double add(double a, int b){
    return a+b;
    }
     //Note:You can create "many methods with the same name" in a class, but method parameters must be different
    //Note: If you create "many methods with the same name" in a class, it is called "Method Overloading"
    //      To make them different you have three ways;
     //      i) Change the number of parameters
    //       ii)Change the data types of the parameters
    //       iii)Change the places of parameters, if the data types of the parameters are different
    //  Note 4: You can use any access modifier in method overloading
    //  Note 5: "static" or "non-static" methods can be overloaded. Being static or non-static does not affect "Method Overloading"
    //  Note 6: "Method Names" and "Method Parameters" are essentials in Methods
    //           "Method Names" and "Method Parameters" are called "Method Signature"
    //          If you want to check if two methods are same or not, look at just "Method Names" and "Method Parameters"
    //          "Access Modifiers", "return Types", "Static Keyword" cannot make methods different from eachother.
    // Note 7:   Java is an "Object-Oriented Programming Language"(OOP)
    //           OOp has 4 principles; i)Inheritance
    //                                 ii)Polymorphism= Method Overloading+ Method Overriding
    //                                 iii) Encapsulation
    //                                 iv)Abstraction

        }

