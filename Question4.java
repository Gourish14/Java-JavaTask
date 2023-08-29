package com.cozentus.JavaTask;

public class Question4 {
	
	public static void Triplets(int[] nums, int targetSum) {
        int n = nums.length;
        boolean found = false;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == targetSum) {
                        System.out.println(+nums[i] + " " + nums[j] + " " + nums[k]);
                        found = true;
                    }
                }
            }
        }

        if (!found) {
            System.out.println("No triplets found with the given sum.");
        }
    }
	
    public static void main(String[] args) {
        int[] nums = {1, 6, 3, 0, 8, 4, 1, 7};
        int targetSum = 7;

        Triplets(nums, targetSum);
    }

    
}

