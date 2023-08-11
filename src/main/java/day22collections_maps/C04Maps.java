package day22collections_maps;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class C04Maps {
    /*
    HashMap: 1)It does not put the entries in any order. that is why it is very fast
    2) Hashmap allows you to use "null" is Keys and in Values
    3) HashMap is not "thread-safe" and not "synchronized."

    HashTable: 1) it does not put the entries in any order, it is fast, but it is slower than HashMap
    2) HashTable is "Thread-safe" and "synchronized"
    3)HashTable does not allow you to use "null" in Keys and in values
    TreeMap: 1) it puts the entries in natural order, that is why it is so slow.
    2)TreeMap does not allow you to use "null" in Keys, but it is allowed in Values.
    3) TreeMap is not "Threadsafe" and not "synchronized."


     */

    public static void main(String[] args) {
        //Homework: Create a method to display the number of occurrences of letters in a sentence
       //           Java, Java, I love Java. ==> J=3, a=6, v=4, I=1, l=1, o=1, e=1

        Hashtable<Integer, String> define = new Hashtable<>();
        define.put(1,"Baby");
        define.put(15,"Teenage");
        define.put (67,"Senior");
        System.out.println(define);//{15=Teenage, 67=Senior, 1=Baby}

     TreeMap<String, Integer> countries = new TreeMap<>();
     countries.put ("Albania",3);
     countries.put ("Germany",83);
     countries.put ("USA",400);
     countries.put ("Belgium",12);
     //countries.put (null,120), //Null pointer exception
        // System.out.println(countries);//{Albania=3, Belgium=12, Germany=83, USA=400}

        String letters= "Java, Java, I love Java.";
        String sentence= letters.replaceAll("[^a-zA-Z]","");
        String ch= sentence.toLowerCase();


        HashMap<Character, Integer> count= new HashMap<>();

        for (char letter:ch.toCharArray()
             ) { if(count.containsKey(letter)){
                 count.put(letter, count.get(letter)+1 );


        }else{
                 count.put(letter,1);
        }

        }
        for (char letter: count.keySet()
             ) {
            System.out.println(letter+ ":" + count.get(letter));

        }




    }
}
