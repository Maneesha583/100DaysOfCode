package com.week2;

public class ReverseString {

    static class Solution {
        public void reverseString(char[] s) {
            int i = 0;
            int j = s.length - 1;
            while (i < j) {
                char temp = s[i];
                s[i] = s[j];
                s[j] = temp;
                i++;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        
        System.out.println("Before: " + String.valueOf(s));
        solution.reverseString(s);
        System.out.println("After: " + String.valueOf(s));
    }
}

