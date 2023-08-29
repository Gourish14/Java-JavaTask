package com.cozentus.JavaTask;

public class Question11 {
	
	public static boolean isSorted(int[] array) {
        return isSortedHelper(array, 0);
    }

    private static boolean isSortedHelper(int[] array, int index) {
        if (index >= array.length - 1) {
            return true;
        }

        if (array[index] > array[index + 1]) {
            return false;
        }

        return isSortedHelper(array, index + 1);
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5};
        int[] unsortedArray = {3, 1, 5, 2, 4};

        System.out.println("Is sortedArray sorted? " + isSorted(sortedArray));
        System.out.println("Is unsortedArray sorted? " + isSorted(unsortedArray));
    }
}