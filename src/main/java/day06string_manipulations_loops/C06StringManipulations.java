package day06string_manipulations_loops;

public class C06StringManipulations {
    public static void main(String[] args) {
        //Other Methods

        String s= "Java is Java";

        //Other Methods
        boolean r1= s.contains("v");
        System.out.println(r1);//true

        boolean r2= s.contains("x");
        System.out.println(r2);//true

        boolean r3 = s.startsWith("J");
        System.out.println(r3);// true

        boolean r4 = s.startsWith("j");
        System.out.println(r4);

        boolean r5= s.endsWith("a");
        System.out.println(r5);

        char r6 = s.charAt(2);// if you want to get "a single character" "in char data type" use charAt()
        System.out.println(r6);

        String r7= s.repeat(3);
        System.out.println(r7);









    }
}
