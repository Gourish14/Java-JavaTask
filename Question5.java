package com.cozentus.JavaTask;

public class Question5 {
    public static void main(String[] args) {
    	
        String input = "Gourish";
        boolean containsVowels = hasVowels(input);
        
        if (containsVowels) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static boolean hasVowels(String input) {
        String vowels = "AEIOUaeiou";
        
        for (char c : input.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                return true;
            }
        }
        
        return false;
    }
}

