package day13_Stringbuilder_stringbuffer_accmod;

public class C01StringBuilder {
    public static void main(String[] args) {
        /*
        There are 3 classes to store strings.
        String, StringBuilder, StringBuffer

        Why did Java create 3 classes to create Strings?
        1) String Class is "immutable", but StringBuilder is "mutable
        When you update a String class object Java creates a new container for it and puts the updated value in it
        When you update a string, Java does not change the original value(Unless you reassign the updated to the same container).
        This is called "immutability
        When we do any update in StringBuilder, Java updates original value. This is called "mutability".

        2) StringBuilder and StringBuffer are both "mutable" so what is the difference between String builder and StringBuffer?
                a) StringBuilder is faster than StringBuffer
                b) StringBuffer is "threadsafe" and it is "synchronized"
        3) Is there any other immutable classes in Java?

        Yes, all wrapper classes are immutable.
        4)StringBuilder and StringBuffer are "mutable" so what is the difference between stringBuilder and StringBuffer
        i)StringBuilder is faster than StringBuffer
        ii)StringBuffer is "thread-safe" and "synchronized" , but stringBuilder is not.
        Being
        Thread-safe"means to be able to do multiple tasks at the same time
        Being synchronized means to be able to order the threads to save time.

         */
        String s= "Java";
        String t="Java";

        String u= "Apex";

        s=s+"!"; //Java!
        // concat() method is used in String class to add some characters to the String

        System.out.println(s);//Java!
        System.out.println(t);//Java

        String y= new String("Apex");//by this way I am telling to Java to create a "new" container for the y container value.
        // If I do not want Java to check String pool, I want Java to create new container every time.

        //String x= new String("Java");

        StringBuilder v= new StringBuilder("Python");
        System.out.println(v);
        v.append("!");//is like concat()--> append() adds characters to the end of the StringBuilder object
        System.out.println(v);

        StringBuilder x= new StringBuilder("Ruby");
        System.out.println(x);

        StringBuilder sb= new StringBuilder();
        System.out.println(sb);

        sb.append("Hi!").append("Java...");
        System.out.println(sb);

        System.out.println(sb.capacity());//16
        System.out.println(sb.length());//10
        StringBuffer f= new StringBuffer("Rubby");
        System.out.println(f);

        StringBuilder stateAbbr= new StringBuilder(2);//If we define some more characters to be added
                                                              // that is having a greater number
                                                              //New Capacity --> Existing/Identified Cap Num*2+2;


        stateAbbr.append("FL").append("How").append("Jack");
        System.out.println(stateAbbr);
        System.out.println(stateAbbr.capacity());
        System.out.println(stateAbbr.length());

        sb.reverse();
        System.out.println(sb);//...avaJ!iH

        sb.replace(0,4,"*");
        System.out.println(sb);//*vaJ!iH

        sb.insert(5,"123");
        System.out.println(sb);//*vaJ!123iH

        sb.delete(5,8);
        System.out.println(sb);//*vaJ!iH

        sb.deleteCharAt(6);
        System.out.println(sb);//*vaJ!i

        StringBuilder a= new StringBuilder( "Java");
        StringBuilder b= new StringBuilder("Kava");

        int r= a.compareTo(b);//compareTo() compares the first characters of the given container values.
        //If the compared container's first char is before the second given container's first characters
        // in alphabetical order you will receive negative values. This method compares the SB objects lexicographically.
        System.out.println(r);//-1
        a.setCharAt(2, 'n');//Jana
        System.out.println(a);

        //Methods in StringBuffer

        StringBuffer sbf =new StringBuffer("Python");

        System.out.println(sbf.subSequence(2,4));





    }
}
