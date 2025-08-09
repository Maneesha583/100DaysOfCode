package com.techpalle;

import java.util.Scanner;

public class InsertElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Example array
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;

        // Take input
        System.out.print("Enter element to insert: ");
        int x = sc.nextInt();

        System.out.print("Enter index to insert at: ");
        int y = sc.nextInt();
        sc.close();

        // New array with +1 size
        int[] newArr = new int[n + 1];

        // Copy elements before index y
        for (int i = 0; i < y; i++) {
            newArr[i] = arr[i];
        }

        // Insert element at index y
        newArr[y] = x;

        // Copy remaining elements after y
        for (int i = y; i < n; i++) {
            newArr[i + 1] = arr[i];
        }

        // Print result
        System.out.println("Array after insertion:");
        for (int num : newArr) {
            System.out.print(num + " ");
        }

	}

}
