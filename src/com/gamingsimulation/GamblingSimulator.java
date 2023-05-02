package com.gamingsimulation;

public class GamblingSimulator {
    /*
     * Method for gambler either win or loose the game
     * @param args
     */

    public static void main(String[] args) {
        /*
         * 1) Initialize the variable
         * 2) Taking random variable for check either win or loose the game
         * 3) Putting the condition if won or else loose and printing
         */

        /*
         1) Initialize the variable
         */
        int stake_per_day = 100;
        int bet_per_game = 1;

        /*
         2) Taking random variable for check either win or loose the game
         */
        int winLoose = (int) Math.floor(Math.random() * 2);

        /*
         3) Putting the condition if won or else loose and printing
         */
        if (winLoose == 1) {
            System.out.println("You won the game");
            System.out.println("Your stack is " + (stake_per_day + bet_per_game));
        } else {
            System.out.println("You loose the game");
            System.out.println("Your stack is " + (stake_per_day - bet_per_game));
        }
    }
}
