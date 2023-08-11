package practices_dt.practice03;

import java.time.LocalTime;
import java.util.Scanner;

public class Q04_DateTime_DiceSecond {

/*
        Write a method that rolls two dice and compares the result with the score of the computer.

        By multiplying the result with 2 or 5 according to the second it was.
        When the dice is rolled, if the second is a multiple of 5, the number of dice will be multiplied by 5
        and added to the score.
        When the dice is rolled, if the second is a multiple of 2, the number of dice will be multiplied
        by 2 and added to the score.
        When the dice is rolled, if the second is an odd number, the number of dice will be added to the score.*/

    public static void main(String[] args) {
       // System.out.println((int)(Math.random()*6)+1);

    }
    static int playerDice;
    static int playerSecond;
    static int playerScore;
    
    public static void rollDice() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter R to roll the dice");
        String start = scan.next();

        if (start.equalsIgnoreCase("r")) {
            int playerDice = (int) (Math.random() * 6) + 1;
            System.out.println("playerDice =" + playerDice);
            //to calculate the second when the dice is rolled

            playerSecond = LocalTime.now().getSecond();
            System.out.println("playerSecond = " + playerSecond);

            //condition
            if (playerSecond % 5 == 0) {
                playerScore += playerDice * 5;
            } else if (playerSecond % 2 == 0) {
                playerScore += playerDice * 2;


            } else {
                playerScore += playerDice;


            }
            System.out.println("playerScore = " + playerScore);

        }
    }}