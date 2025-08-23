package com.week2;


public class ValidPalindrome {

    static class Solution {

        public boolean isPalindrome(String s) {
            int left = 0, right = s.length() - 1;

            while (left < right) {
                // Skip non-alphanumeric characters from the left
                while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                    left++;
                }
                // Skip non-alphanumeric characters from the right
                while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                    right--;
                }
                // Compare ignoring case
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String test1 = "A man, a plan, a canal: Panama";
        String test2 = "race a car";

        System.out.println(test1 + " -> " + solution.isPalindrome(test1)); // true
        System.out.println(test2 + " -> " + solution.isPalindrome(test2)); // false
    }
}

