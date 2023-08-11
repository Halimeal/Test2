package day22collections_maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C02Maps {
    public static void main(String[] args) {
        //How to create Hashmap

        HashMap<String,Integer> stdAges= new HashMap<>();
        //How to create "Entries" into a HashMap

        stdAges.put("Tom",76);
        stdAges.put("Angelina",55);
        stdAges.put("Brad",61);
        stdAges.put("Leo",43);
        stdAges.put("Linda",23);
        stdAges.put("Brad",34); //If you use the same key, the value will be "overwritten'

        System.out.println(stdAges);//{Tom=76, Angelina=55, Leo=43, Brad=61, Linda=23}, random order

        //How to work with just keys
        //Example 1: Get the total number of characters in student names.

        Set<String> keys= stdAges.keySet();
        System.out.println(keys);//[Tom, Angelina, Leo, Brad, Linda]

        int numOfChars= 0;
        for (String w:keys) {
            numOfChars= numOfChars+ w.length();

        }
        System.out.println(numOfChars);//23

        //How to work with just values
        //Example 2: Find the average age of the students

        Collection<Integer> ages= stdAges.values();

        System.out.println(ages);//[76, 55, 43, 43, 23]

        double sumOfAges=0;

        for (Integer w: ages) {

            sumOfAges= sumOfAges+w;

        }
        System.out.println("Average age is " + sumOfAges/ages.size());// 46.2

        //How to loop with entries
        //Example 3: Find the sum of the number of characters and the age for every entry.

        Set<Map.Entry<String,Integer>>entries= stdAges.entrySet();
        for (Map.Entry<String,Integer> w:entries
             ) {
            int sum= w.getKey().length()+w.getValue();
            System.out.println("For "+ w.getKey() + ":" +sum);


        }
        int age1= stdAges.get("Angelina");
        System.out.println(age1);//55

        stdAges.putIfAbsent("Angelina",67);
        stdAges.putIfAbsent("Carl",16);
        System.out.println(stdAges);//{Tom=76, Angelina=55, Leo=43, Carl=16, Brad=34, Linda=23}

        stdAges.replace("Angelina",67);// To update values by using keys use replace method not put method
        System.out.println(stdAges);//{Tom=76, Angelina=67, Leo=43, Carl=16, Brad=34, Linda=23}

        stdAges.replace("Angelina",67,100);
        System.out.println(stdAges);//{Tom=76, Angelina=100, Leo=43, Carl=16, Brad=34, Linda=23}
        boolean r1= stdAges.containsKey("Brad");
        System.out.println(r1);






    }
}
