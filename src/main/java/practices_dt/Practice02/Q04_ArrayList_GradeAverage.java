package practices_dt.Practice02;

import java.util.ArrayList;
import java.util.Scanner;

/*
Get as many grades as a teacher wants to enter and find the number of students passes the average
 */
public class Q04_ArrayList_GradeAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> examGradesList = new ArrayList<>();


        do {
            System.out.println("Enter the grade");
            int grades = scan.nextInt();
            examGradesList.add(grades);
            System.out.println("examGradesList = " + examGradesList);
            System.out.println("Continue: Y/N");
            String condition = scan.next();
            if (condition.equalsIgnoreCase("n")) {
                break;}}


            while (true) ; //Infinite loop
            System.out.println("examGradesList = " + examGradesList);
            //Calculate the average
            double sum = 0;
            for (int w : examGradesList) {
                sum += w;
            }
            double average = sum / examGradesList.size();
            System.out.println("average =" + average);
            //Calculate the number of the above average students

            int numOfStdAboveAvg = 0;
            for (int w : examGradesList) {
                if (w > average) {
                    numOfStdAboveAvg++;
                }
            }
            System.out.println("numOfStdAboveAvg = " + numOfStdAboveAvg);
        }


    }
