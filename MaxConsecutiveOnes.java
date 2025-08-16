package com.week2;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		int[] arr = {1, 1, 0, 1, 1, 1, 0, 0};
        int count = 0;
        int maxCount = 0;

        for (int item : arr) {
            if (item == 1) {
                count++;
                maxCount = Math.max(count, maxCount);
            } else {
                count = 0;
            }
        }

        System.out.println("Max Consecutive times: " + maxCount);

	}

}
