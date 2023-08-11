package day07Loops;

import org.w3c.dom.ls.LSOutput;

public class C01ForLoops {
    public static void main(String[] args) {
        for (int i = 5; i < 17; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }


        // Homework: Type code to print integers from 15 to 6 on the console


        System.out.println();
        //Example 2: type code to print integers from 5 to 8 except 7 on the console

        for (int i = 5; i < 9; i++) {
            if (i != 7) {
                System.out.print(i + " ");
            }

        }
        //2.Way:
        for (int i = 5; i < 17; i++) {
            if (i == 7) {
                continue;//"Continue" keyword is used to skip some values in a loop
                //"Continue" keyword takes you "increment/decrement" part in the loop directly

            }
            System.out.print(i + " ");
        }

        System.out.println(" ");

        //Example 3: Print String characters one by one on the console if you see "x" stop writing.
        //           "I like extra effort" ==>

        String s = "I like extra effort";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'x') {
                break;// "break" keyword stops looping and takes us to the outside of the loop
            }
            System.out.print(s.charAt(i));

        }
        // Note: The last index of string "s" is "s.length()-1"


        // Homework: Type code to print integers from 15 to 6 on the console


        for (int i = 15; i >6 ; i--) System.out.println(i);

    }
}



