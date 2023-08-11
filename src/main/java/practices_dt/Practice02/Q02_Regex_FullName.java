package practices_dt.Practice02;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q02_Regex_FullName {
    /*Divide the 2-word name and surname you will receive from the user into separate words.
    Print the name and surname on the screen separately.
            EXAMPLE:
    INPUT: John Doe
    OUTPUT:
    First name: John
    Surname: Doe

     */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter your first name and lastname with a space between");
        String fullName= scan.nextLine().replaceAll("\\s+"," ").replaceAll("[^a-zA-Z ]","").trim();
        String firstName= fullName.split(" ")[0].substring(0,1).toUpperCase()+fullName.split(" ")[0].substring(1).toLowerCase() ;
        String surname= fullName.split(" ")[1].substring(0,1).toUpperCase()+fullName.split(" ")[1].substring(1).toLowerCase();

        System.out.println("First Name:"+ firstName + "\nSurname: "+ surname);


    }
}