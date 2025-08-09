package com.techpalle;

import java.util.Scanner;

public class RightRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;

        // Take number of rotations
        System.out.print("Enter number of right rotations: ");
        int r = sc.nextInt();
        sc.close();
        // Reduce rotations if greater than array length
        r = r % n;

        // Perform rotation r times
        for (int i = 0; i < r; i++) {
        	//last element
            int last = arr[n - 1];
             // Shift all elements to right
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }

            // Place last element at first position
            arr[0] = last;
        }

        // Print rotated array
        System.out.println("Array after right rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
	}

}
