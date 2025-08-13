package com.week2;



public class MoveZeros {
	public static void main(String[] args) {
int[] arr = {0, 1, 0, 3, 12};
        
        int j = 0; // index to place next non-zero
        
        // Move all non-zero numbers forward
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        
        // Print result
        for (int num : arr) {
            System.out.print(num + " ");
        }

	}

}
