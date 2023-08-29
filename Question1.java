package com.cozentus.JavaTask;

public class Question1 {
    public static void main(String[] args) {
        char[] lettersArray = {'a', 'c', 'd', 'e'};
        char missingLetter = Missing(lettersArray);
        System.out.println("The missing letter is: " + missingLetter);
    }

    public static char Missing(char[] array) {
        char missing = '\0';

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] - array[i] > 1) {
                missing = (char) (array[i] + 1);
                break;
            }
        }
        return missing;
    }
}

