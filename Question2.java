package com.cozentus.JavaTask;

public class Question2 {
    public static void main(String[] args) {
        int[] numbersArray = {1, 2, 3, -4, 3, -6};
        boolean isNegativeDominant = checkNegativeDominance(numbersArray);

        System.out.println("Negative Dominance: " + isNegativeDominant);
    }

    public static boolean checkNegativeDominance(int[] array) {
        int negativeCount = 0;
        int positiveCount = 0;

        for (int num : array) {
            if (num < 0) {
                negativeCount++;
            } else if (num > 0) {
                positiveCount++;
            }
        }
        return negativeCount > positiveCount;
    }
}

