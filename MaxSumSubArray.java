package com.week2;

public class MaxSumSubArray {

	public static void main(String[] args) {
		 int[] arr = {10, 20, 30, 0, -10, 40};
	        int k = 3;
	        System.out.println(maxSumSubarray(arr, k));
	    }

	    public static int maxSumSubarray(int[] arr, int k) {
	        int windowSum = 0;
	        int maxSum = Integer.MIN_VALUE;

	        // Calculate the sum of the first window
	        for (int i = 0; i < k; i++) {
	            windowSum += arr[i];
	        }

	        maxSum = windowSum;

	        // Slide the window and update the sum
	        for (int i = k; i < arr.length; i++) {
	            windowSum = windowSum + (arr[i] - arr[i - k]);
	            maxSum = Math.max(windowSum, maxSum);
	        }

	        return (int)maxSum;

	}

}
