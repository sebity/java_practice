package com.jantatham;

/**
 * Created by jan on 06/03/17.
 */
public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("Jan", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        double cm = calcFeetAndInchesToCentimeters(6,6);
        if (cm <= 0.0) {
            System.out.println("Invalid parameters");
        }
        else {
            System.out.println("5ft6 is " + cm + "cm");
        }

        double cm2 = calcFeetAndInchesToCentimeters(100);
        if (cm2 <= 0.0) {
            System.out.println("Invalid parameters");
        }
        else {
            System.out.println("27 inches is " + cm2 + "cm");
        }
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet >= 0) || (inches >= 0 && inches <= 12)) {
            // Convert feet to inches
            double totalInches = (feet * 12) +  inches;
            double centimeters = totalInches * 2.54;
            return centimeters;
        }
        else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            // Convert feet to inches
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }
        else {
            return -1;
        }
    }
}
