package com.week2;

public class MergeSortedArrays {

	public static void main(String[] args) {
		int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        int[] merged = merge(arr1, arr2);

        // Print merged array
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }

    static int[] merge(int[] arr1, int[] arr2) {
        int i = 0, j = 0, k = 0;
        int[] result = new int[arr1.length + arr2.length];

        // Compare and merge
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        // Copy leftovers from arr1
        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }

        // Copy leftovers from arr2
        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }

        return result;

	}

}
