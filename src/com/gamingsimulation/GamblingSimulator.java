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
         * 4) Putting condition for luckiest and unluckiest day and printing
         */
        GamblingSimulator gamble = new GamblingSimulator();
        double winLoose;
        int totalDays = 30;
        double totalWin = 0, totalloss = 0;
        int endValue = 0;
        int win = 0, loss = 0;
        int amount = STAKE_PER_DAY;
        while (totalDays > endValue) {
            winLoose = gamble.winLoose();
            System.out.println("win or loose : " + winLoose);
            if (winLoose < 0.5) {
                amount = amount + BET_PER_GAME;
                win++;
                totalWin += amount;
                System.out.println("win");
            } else {
                amount = amount - BET_PER_GAME;
                loss++;
                totalloss += amount;
                System.out.println("loss");
            }
            totalDays--;
        }
        System.out.println("Amount = " + amount);
        System.out.println("Wins = " + win + "  Loss = " + loss);
        if (win > loss) {
            System.out.println("won by : " + (totalWin - totalloss));
        } else {
            System.out.println("Lost by : " + (totalloss - totalWin));
        }
        System.out.println("Maximum amount won: " + totalWin + " on day " + win);
        System.out.println("Minimum amount loss: " + totalloss + " on day " + loss);
    }
}
