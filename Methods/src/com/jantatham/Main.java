package com.jantatham;

/**
 * Created by jan on 01/03/17.
 */
public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int highScore = 0;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " +  highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " +  highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        int position = 1;

        if (score >= 1000) {
            position = 1;
        }
        else if (score >= 500 && score < 1000) {
            position = 2;
        }
        else if (score >= 100 && score < 500) {
            position = 3;
        }
        else {
            position = 4;
        }

        return position;
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }

        return -1;
    }
}
