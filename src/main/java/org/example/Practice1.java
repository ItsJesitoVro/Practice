package org.example;

public class Practice1 {

    private static int score = 0;
    public static void roll(int pins) {
        score += pins;
    }

    public static int score() {
        return score;
    }
}