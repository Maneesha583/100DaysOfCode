package com.week2;

public class RemoveDuplicatesWithoutExtraSpace {

	public static void main(String[] args) {
		String input = "programming";
        System.out.println(removeDuplicates(input));
    }

    public static String removeDuplicates(String str) {
        char[] arr = str.toCharArray();
        int write = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = 0; j < write; j++) {
                if (arr[i] == arr[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                arr[write] = arr[i];
                write++;
            }
        }
        return new String(arr, 0, write);

	}

}
