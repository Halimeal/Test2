package day06string_manipulations_loops;

public class C03StringManipulations {
    public static void main(String[] args) {

       /* Example 4:Check if a password has the following conditions
        i)It should not be empty
        ii)It should not be just a single space
        iii)It should not have spaces at the beginning and at the end
        iv)'i' should be a character in the password and first occurrence of 'i' should be at index 4
        v)'K' should be a character in the password and last occurrence of 'K' should be at index 5 */

        String pwd = " A 12?iKm";

        //i)It should not be empty
        boolean first = pwd.isEmpty();
        System.out.println(first);
        //ii)It should not be just space

        boolean second = pwd.isBlank();// isBlank() returns true if all characters are space in a string otherwise it returns false
                                       // Note: isBlank() returns true for empty String as well

        System.out.println(second);

        //iii) It should not have spaces at the beginning and at the end
       boolean third = pwd.trim().equals(pwd);
        System.out.println(third);

        //iv)'i' should be a character in the password and first occurrence of 'i' should be at index 4
        boolean fourth = pwd.indexOf("i") == 4;
        System.out.println(fourth);


        //v)'K' should be a character in the password and last occurrence of 'K' should be at index 5

        boolean fifth = pwd.lastIndexOf("K")==5;

        //1. Way to give message to the user
        System.out.println(fifth);

        if(!first &&!second&&third &&fourth &&fifth){
            System.out.println("The Password is valid");}else{
            System.out.println("The Password is invalid");

            //2. Way to give message to user
            if (first){
                System.out.println("Empty password is not accepted");}
            if(second){
                System.out.println("Password needs visible characters");
            }

            if(!third){
                System.out.println("Do not use space at the beginning and at the end");
            }
            if (!fourth){
                System.out.println("fifth character should be i");}
            if(!fifth){
                System.out.println("Sixth character should be K");
            }
        }
    }
}
