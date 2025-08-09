package com.techpalle;

import java.util.Scanner;

public class DeleteElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;

        System.out.print("Enter index to delete: ");
        int i = sc.nextInt();
        
        sc.close();

        if (i < 0 || i >= n) {
            System.out.println("Invalid index!");
            return;
        }

        int[] newArr = new int[n - 1];

        for (int j = 0; j < i; j++) {
            newArr[j] = arr[j];
        }

        for (int j = i + 1; j < n; j++) {
            newArr[j - 1] = arr[j];
        }

        System.out.println("Array after deletion:");
        for (int val : newArr) {
            System.out.print(val + " ");
        }

	}

}
