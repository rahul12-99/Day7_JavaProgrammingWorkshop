package com.gamingsimulation;

public class GamblingSimulator {
    /*
     * Method for gambler 50% of stack resign for the day
     * @param args
     */

    public static void main(String[] args) {
        /*
         * 1) initialize the variable
         * 2) initialize the loop till 50% of stack
         * 3) condition for the win and loose and printing the amount
         */

        /*
         1) initialize the variable
         */
        int stake_per_game = 100/2;
        int bet_per_game = 1;
        int winLoose = 0;

        /*
         2) initialize the loop till 50% of stack
         */
        for (int winAmount = 0; winAmount <= stake_per_game; winAmount++) {
            winLoose = (int) (Math.floor(Math.random() * 2));

            /*
              3) condition for the win and loose and printing the amount
             */
            if (winLoose == 1) {
                System.out.println(winLoose + " You win the bet");
                winLoose = winLoose + bet_per_game;

            } else {
                System.out.println(winLoose + " You loose the bet");
                winLoose = winLoose - bet_per_game;

            }
        }
        System.out.println("After resign 50% of total stack amount is : " + winLoose);
    }
}
