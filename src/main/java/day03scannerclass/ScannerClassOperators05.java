package day03scannerclass;

public class ScannerClassOperators05 {


    public static void main(String[] args) {

        // "=" ==> Assignment Operator
        //"==" ==> Equality Operator ==> Checks if the value on the left is the same with the value on the right
        // 2+3 == 5 ==> true   2+4 == 3 ==> false so "==" ih Java returns "boolean
        // 'a' == 65 ==> returns true If you use char with any mathematical operation Java uses the ASCII value of char

        System.out.println('A'+ 'a'); // Java used the ASCII value of the char

        // find ASCII value of "!" by typing code

        System.out.println('!'*1);//33

        //"!" ==> Not Operator ==> !true=false  !false = true  !!true = true
        // "!=" ==> Not equals operator
        // "<", ">", "<=", ">=" return boolean

        /* "==" means equal with strings
        Every String has two main things i) Value ii) Address (in heap memory)
         */
        String s1 = "Tom";
        String s2 = "Hanks";
        String s3 = "Tom";

        System.out.println(s1==s2);//false
        System.out.println(s1==s3);//true
        String s4 = new String( "Tom");

        System.out.println( s1==s4);//false

        System.out.println(s1.equals(s4)); // true
        // If you use == sign Java will check Address and Value
        //If you use equals method java will check just the value, developers work with values, we don't need address
        //In coding when we compare two strings we use equals method!!!

    }

}
