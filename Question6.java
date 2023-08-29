package com.cozentus.JavaTask;

import java.util.Scanner;

public class Question6 {
	
	public static boolean Duplicate(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }

        return false;
    }
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        boolean hasDuplicates = Duplicate(numbers);

        if (hasDuplicates) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    
}

