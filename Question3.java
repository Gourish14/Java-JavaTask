package com.cozentus.JavaTask;

public class Question3 {
	
    public static void main(String[] args) {
        int[] numbersArray = {1, -2, 5, -4, 3, -6};
        boolean alternates = Alternating(numbersArray);

        System.out.println("Alternates " + alternates);
    }

    public static boolean Alternating(int[] array) {
        if (array.length < 2) {
            return false;
        }

        for (int i = 1; i < array.length; i++) {
            if ((array[i] >= 0 && array[i - 1] >= 0) || (array[i] < 0 && array[i - 1] < 0)) {
                return false;
            }
        }

        return true;
    }
}

