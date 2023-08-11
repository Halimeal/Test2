package day04logical_operators_if_switch_statements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C0IfStatement03 {
    public static void main(String[] args) {

        //Example 4: Type code to decide a day name is week day name or weekend day name
        // Monday==>Week Day Saturday==>Weekend Day

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a day name...");
        String dayName = input.next();
        boolean isWeekendDay =dayName.equalsIgnoreCase("Saturday")
                || dayName.equalsIgnoreCase("Sunday");
        boolean isweekDay = dayName.equalsIgnoreCase("Monday")
                ||dayName.equalsIgnoreCase("Tuesday")
                ||dayName.equalsIgnoreCase("Wednesday")
                ||dayName.equalsIgnoreCase("Thursday")
                || dayName.equalsIgnoreCase("Friday");


        if ( dayName.equalsIgnoreCase("Saturday")
                || dayName.equalsIgnoreCase("Sunday"))
        {
            System.out.println("Weekend");
        }
        else if (dayName.equalsIgnoreCase("Monday")
                ||dayName.equalsIgnoreCase("Tuesday")
                ||dayName.equalsIgnoreCase("Wednesday")
                ||dayName.equalsIgnoreCase("Thursday")
                || dayName.equalsIgnoreCase("Friday"))
        {
            System.out.println("Week Day");

        }else {
            System.out.println("Invalid day name...");}






    }
}
