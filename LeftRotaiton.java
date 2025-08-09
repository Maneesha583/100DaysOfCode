package com.techpalle;

import java.util.Scanner;

public class LeftRotaiton {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;

        // Take number of rotations
        System.out.print("Enter number of left rotations: ");
        int r = sc.nextInt();
        sc.close();

        // Reduce rotations if greater than array length
        r = r % n;

        // Perform rotation r times
        for (int i = 0; i < r; i++) {
            // first element
            int first = arr[0];

            // Shift all elements to left
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }

            // Place first element at last position
            arr[n - 1] = first;
        }

        // Print rotated array
        System.out.println("Array after left rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
	}

}
