package Practice.D0721;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C01_W3sourceArraylists {
    public static void main(String[] args) {
        //Write a Java program to insert an element into the Array list at the first position
        List<String> col1= new ArrayList<>();
        col1.add("Brown");
        col1.add("Violet");
        col1.add("Grey");
        col1.add("Black");
        col1.add("Beige");
        System.out.println(col1);

        col1.add(0,"Pink");
        System.out.println(col1);
        //Write a Java program to retrieve an element (at a specified index) from a given array list.

        String p= col1.get(3);

        System.out.println(p);

        //Write a Java program to update an array element by the given element

        String t= col1.set(0,"Blue");
        System.out.println(col1);
        //Write a Java program to remove the third element from an array list.

        String x= col1.remove(2);
        System.out.println(col1);
        // Write a Java program to search for an element in an array list.

        if(col1.contains("Blue")){
            System.out.println("I found it!");
        } else{
            System.out.println("Could not find!");
        }
        //Write a Java program to sort a given array list.
        List<Integer> Num= new ArrayList<>();
        Num.add(10);
        Num.add(12);
        Num.add(4);
        Num.add(7);


        Collections.sort(Num);
        System.out.println(Num);
        //Write a Java program to copy one array list into another.

        List<Integer> Num1 = new ArrayList<>();
        Num1.add(15);
        Num1.add(7);
        Num1.add(5);
        Num1.add(1);

        Collections.copy(Num1,Num);

        System.out.println(Num1);
        System.out.println(Num);
        //Write a Java program to shuffle elements in an array list.

      Collections.shuffle(Num1);
        System.out.println(Num1);
        //Write a Java program to reverse elements in an array list.

        Collections.sort(Num1);
        Collections.reverse(Num1);
        System.out.println(Num1);

        //Write a Java program to compare two array lists.
        List<Integer> Num3 =new ArrayList<>();
        Num3.add(6);
        Num3.add(9);
        Num3.add(17);
        Num3.add(3);

        




    }
}
