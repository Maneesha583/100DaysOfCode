package com.week2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] nums = {0, 0, 1, 1, 2, 2, 3, 4};

        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                j++;
                nums[j] = nums[i];
            }
        }

        int newLength = j + 1;

        // Print result
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
	}

}