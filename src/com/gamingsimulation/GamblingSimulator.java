package com.gamingsimulation;

public class GamblingSimulator {
    /*
     * Initialized stake per day and bet per game which is static and final variable
     */
    public static final int STAKE_PER_DAY = 100;
    public static final int BET_PER_GAME = 1;

    /**
     * This method return random number for win or loose
     */
    public double winLoose() {
        return Math.random();
    }

    /*
     * This is the main method of the program to know total amount after playing a month
     * @param args
     */
    public static void main(String[] args) {
        /*
         * 1) Initialized the variable
         * 2) Putting condition of loose or won in while loop for A month
         * 3) printing the total amount
         */
        GamblingSimulator gamble = new GamblingSimulator();
        double winLoose;
        int totalDays = 30;
        int endValue = 0;
        int amount = STAKE_PER_DAY;
        while (totalDays > endValue) {
            winLoose = gamble.winLoose();
            System.out.println("win or loose : " + winLoose);
            if (winLoose < 0.5) {
                amount = amount + BET_PER_GAME;
            } else {
                amount = amount - BET_PER_GAME;
            }
            totalDays--;
        }
        System.out.println("Total amount in month = " + amount);
    }
}
