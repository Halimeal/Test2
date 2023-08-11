package day21collections;

import java.util.LinkedList;

public class C02LinkedList {
    public static void main(String[] args) {
        LinkedList<String> countries =new LinkedList<>();
        countries.add("France");
        countries.add("Italy");
        countries.add("Turkey");
        countries.add("Germany");
        countries.add("United Kingdom");
        System.out.println(countries);//[France, Italy, Turkey, Germany, United Kingdom]

        //pop() and peek()

        String firstCountry= countries.peek();//Retrieves, but does not remove, the head (first element) of this list.
        System.out.println(firstCountry);//France
        System.out.println(countries);//[France, Italy, Turkey, Germany, United Kingdom]

        String country1= countries.element();//Retrieves, but does not remove, the head (first element) of this list.
        System.out.println(country1);//France
        System.out.println(countries);//[France, Italy, Turkey, Germany, United Kingdom]

        LinkedList<String> names= new LinkedList<>();
        System.out.println(names.peek());//null
        //System.out.println(names.element());//throws NoSuchElementException




        //pop() method and poll() method retrieve the first element from the list and remove them
        //Pop method throws NoSuchElementException when run on an empty list
        //poll() method returns null when run on an empty list
        String s= countries.pop();//Pops an element from the stack represented by this list. In other words, removes and returns the first element of this list.
        //This method is equivalent to removeFirst().
        System.out.println(s);//France
        System.out.println(countries);//[Italy, Turkey, Germany, United Kingdom], the first country is removed
        String n = countries.poll();//Retrieves and removes the head (first element) of this list.
        System.out.println(n);//Italy
        System.out.println(countries);//[Turkey, Germany, United Kingdom]
        //System.out.println(names.pop());//NoSuchElementException

        System.out.println(names.poll());//null

    }
}
