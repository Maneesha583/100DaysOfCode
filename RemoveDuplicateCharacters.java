package com.week2;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		String input = "programming";
        String result = removeDuplicates(input);
        System.out.println("Original: " + input);
        System.out.println("Without duplicates: " + result);
    }

    public static String removeDuplicates(String str) {
        boolean[] seen = new boolean[256]; // ASCII size
        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (!seen[ch]) { // First time seeing this char
                seen[ch] = true;
                sb.append(ch);
            }
        }

        return sb.toString();

	}

}
