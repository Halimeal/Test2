package day23iterators_lambda;


import java.util.ArrayList;
import java.util.List;

public class C05Lambda {
    public static void main(String[] args) {
        /*
        1) Lambda is "Functional Programming"
         */
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        printElements(nums);
        System.out.println();
        printElements(nums);
        System.out.println();
        cubeOfUniqueElements(nums);

    }

    // Example 1: Create a method to print all elements on the console in the same line with a space between them.
    //1. Way:

    public static void printElements(List<Integer> list){
        for (Integer w:list
             ) {
            System.out.print(w +" ");

        }
    }
    // 2.Way:

    public static void printElements2(List<Integer>list){
        list.stream().forEach(t-> System.out.print(t+" "));

    }

    //Example 2: Create a method to print even elements on the console in the same line with a space between them


    //2. Way:

    public static void printEvens2(List<Integer> list){

        list.stream().filter(t-> t%2==0).forEach(t-> System.out.println(t+" "));






    }

    //Example 3: Create a method to print the square of odd elements on the console in the same line with a space between them

    public static void printSquareOfOdds(List<Integer>list){


        list.stream().filter(t->t%2!=0).map(t-> t*t).forEach(t-> System.out.println(t+" "));

        //Example 4: Create a method to print the cube of unique even elements on the console in the same line with a space between








    }

    public static void cubeOfUniqueElements(List<Integer>list){

        list.stream().distinct().filter(t-> t%2==0).map(t->t*t*t).forEach(t-> System.out.print(t+ " "));

    }





}
