package Practice.D0720;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class C01_Arraylist {
    public static void main(String[] args) {

        //Create an array list, add some colors(strings) and print out the collection.
        ArrayList<String> colors= new ArrayList<>();
        colors.add(0,"Red");
        colors.add(1,"Blue");
        colors.add(2,"Pink");
        colors.add(0,"Yellow");
        colors.add(0,"Brown");
        System.out.println(colors);//[Brown, Yellow, Red, Blue, Pink]

        //Write a Java program to insert an element into the array list at the first position.
        ArrayList<String> s=new ArrayList<>();
        s.add("a");
        s.add("b");
        s.add("c");
        s.add(0, "f");
        s.add(4, "g");
        System.out.println(s);
        //Write a Java Program to iterate through all elements in an array list
        ArrayList<Integer> Num=new ArrayList<>();
        Num.add(2);
        Num.add(5);
        Num.add(6);
        Num.add(3);
        Num.add(1);
        Num.add(9);
        for (Integer p:Num
             ) {
            System.out.println(p);

        }
        //Write a Java program to retrieve an element(at the specified index) from a given array

        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        // Print the list
        System.out.println(list_Strings);
        // Retrieve the first and third element
        String element = list_Strings.get(0);
        System.out.println("First element: "+element);
        element = list_Strings.get(2);
        System.out.println("Third element: "+element);

        //


    }}