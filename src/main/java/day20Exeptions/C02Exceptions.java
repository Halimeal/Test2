package day20Exeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
1) "throw" keyword is used inside the method body, while "throws" used inside the method signature
2) "throw" can be used to throw single exception inside the method body, "throws" is used to throw multiple
exceptions in the method name
3) "throw" is used to throw specific exceptions, "throws" is used for more generic exceptions(Compile Time Exceptions)
4)  "throw" is used after creating object from the Exception class, while "throws" can be used directly from the class
5)  After "throw", we can use single exception, while after "throws", we can add as many exceptions classes as we need.
 */

public class C02Exceptions {
    public static void main(String[] args) {
        printAge(35);
        printAge(-35);
    }
    //Create a method that prints user's age

    public static void printAge(int age) {

        if (age >= 0) {
            System.out.println(age);
        } else {
            throw new IllegalArgumentException("Age cannot be negative!");
        }

    }
    //Create a method to read the text from a file
    public static void readTheTextFromFile() throws IOException, FileNotFoundException{


        //To access the file
        FileInputStream fis = new FileInputStream("day20Exceptions/myFile.txt");
        //To read the file

        int k = 0;

        while ((k = fis.read()) != -1) {
            System.out.println((char) k);

        }


    }}