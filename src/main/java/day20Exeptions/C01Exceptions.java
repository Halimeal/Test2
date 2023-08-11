package day20Exeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01Exceptions {

    /* 1) FileNotFoundException: Java throws FileNotFoundException when the address of the file is wrong or
    the file is deleted (the address doesn't exist)
            2) IOException: Java throws IOException for all issues related to the input or output of the files
       3) IOException is the parent exception class for FileNotFoundException
       4) IOException and FileNotFoundException are the "Compile Time Exceptions" because it throws exception while
    we are compiling it (before clicking on the run button)
       5) We need to perform some actions that are a must for the system (e.g. cut the connection from database)
    under every condition, for that purpose we use "finally block"

            6) "try block" cannot be used alone
           "try block" can be used as: "try block + single catch", "try block + multiple catch" or
           "try block + single catch + finally block"  or "try block + multiple catch + finally block"
            */

    public static void main(String[] args) {

    }
    //Create a method to read the text from a file
    public static void readTheTextFromFile(){

        try {
            //To access the file
            FileInputStream fis= new FileInputStream("day20Exceptions/myFile.txt");
            //To read the file

            int k=0;

            while((k= fis.read()) != -1){
                System.out.println((char) k);

            }
        } catch (FileNotFoundException e) {
            System.out.println("The path is wrong or the file is deleted");
        } catch (IOException e) {
            System.out.println("The text of the file could not be read");
        } finally {
            System.out.println("Cut the connection from DB");
        }


    }
}
