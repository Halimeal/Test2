package day21collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class C03Sets {
    public static void main(String[] args) {
        /*
        1) Sets are used to store multiple but unique data
        2) Hashing technique is used in Sets to make data unique
        3)There are 3 types of Sets:
                          a)HashSet:
                              i) HashSet is used for storing unique data
                              ii) HashSets puts the elements in random order
                              iii)HashSets works faster because of random order of elements
                              iV)HashSet accepts null as value
                          b) LinkedHashSet:
                               i) LinkedHashSet is used for storing unique data
                               ii) LinkedHashSet puts the elements in "insertion order"

                          c) TreeSet:
                             i) TreeSet is used for storing unique data
                             ii) TreeSets does not accept null as a value
                             iii) TreeSets put the elements in "natural order" (for String, it follows alphabetical order,
                             //for numbers, it is an ascending order)
                             iv) TreeSet works so slowly because it has to perform extra work while putting the elements in the natural order

         */

        HashSet<String> emails= new HashSet<>();
        emails.add("xy@gmail.com");
        emails.add("ab@gmail.com");
        emails.add("lm@gmail.com");
        emails.add("st@gmail.com");
        emails.add("fd@gmail.com");
        emails.add(null);
        emails.add(null);
        emails.add(null);
        System.out.println(emails);//[ab@gmail.com, xy@gmail.com, st@gmail.com, lm@gmail.com, fd@gmail.com]



        LinkedHashSet<String> ids= new LinkedHashSet<>();
        ids.add("xy@gmail.com");
        ids.add("ab@gmail.com");
        ids.add("lm@gmail.com");
        ids.add("st@gmail.com");
        ids.add("fd@gmail.com");
        ids.add(null);
        ids.add(null);
        ids.add(null);
        System.out.println(ids);

       TreeSet<String> ssn= new TreeSet<>();
        ssn.add("xy@gmail.com");
        ssn.add("ab@gmail.com");
        ssn.add("lm@gmail.com");
        ssn.add("st@gmail.com");
        ssn.add("fd@gmail.com");
        ssn.add(null);//NullPointerException
        ssn.add(null);
       ssn.add(null);
        System.out.println(ssn);


    }
}

