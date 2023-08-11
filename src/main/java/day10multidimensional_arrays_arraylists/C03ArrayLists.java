package day10multidimensional_arrays_arraylists;

import java.util.ArrayList;

public class C03ArrayLists {
    public static void main(String[] args) {
        /*

        1) It is impossible to create an Array without declaring the number of elements in it.
        This is not good, because it is impossible to decide number of elements you will put into an array at the beginning.

        Arrays are fixed in length, this creates issues in implementation, that is why Java created another structure which is
        flexible. Its  name is "Arraylist".

        Arrays use "primitive" and references in data types but ArrayLists use just non-primitives

        Why didn't Java remove Arrays after creating ArrayLists?
        Because i)Arrays are very fast ii)Arrays use memory less

        ArrayLists are for storing multiple data in the same data type with flexible length.
        Arraylists do not accept primitive data types in elements, you have to use non-primitive data types



         */
        //How to create an Arraylist

        ArrayList<Integer> m= new ArrayList<>();

        //How to print ArrayLists
        System.out.println(m);//[]

        // How to add elements into an ArrayList(list)
        m.add(12);
        m.add(5);
        m.add(9);// Add method adds the elements to the add.

        //If you want to put an element to a specific index use "add(given index, element)"
        m.add(1,3);//[12, 3, 5, 9]
        m.add(3,10);

        System.out.println(m);//[12, 5, 9]

        ArrayList<Integer> n = new ArrayList<>();
        n.add(99);
        n.add(88);
        n.add(77);
        System.out.println(n);//[99, 88, 77]

        m.addAll(n);
        System.out.println();

        m.addAll(2,n);


        System.out.println(m);//[12, 3, 5, 10, 9, 99, 88, 77]

        //Example 1: Create an Integer Arraylist and change the odd numbers to 11

        ArrayList<Integer> p=new ArrayList<>();
        p.add(23);
        p.add(24);
        p.add(12);
        p.add(9);
        p.add(3);
        System.out.println(p);

        for(Integer w: p){
            if(w%2!=0){
                p.set(p.indexOf(w),11);/*Returns the index of the first occurrence of the specified element in this list,
                or -1 if this list does not contain the element.*/
            }
        }
        System.out.println(p);

        //Example 2: Create a String ArrayList and remove the elements contain "a"

        ArrayList<String> r = new ArrayList<>();

        r.add("Miami");
        r.add("New York");
        r.add("Tampa");
        r.add("Virginia");
        System.out.println(r);//[Miami, New York, Tampa, Virginia]

        for(int i=0; i<r.size();i++){
            String city= r.get(i);

            if(city.contains("a")){

                r.remove(city);// Removes the first occurrence of the specified element from this list, if it is present
                               //If the list does not contain the element, it is unchanged
                //r.remove(i);//Removes the element at the specified position in this list.
                            // Shifts any subsequent elements to the left (subtracts one from their indices).

                i--;
            }

        }
        System.out.println(r);//[New York]










    }
}
