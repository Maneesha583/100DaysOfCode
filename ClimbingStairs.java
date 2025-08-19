package com.week3;

import java.util.Scanner;

public class ClimbingStairs {

	public static void main(String[] args) {
		// Read n (number of steps)
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // e.g., 5 -> output 8

        // Base cases:
        // n = 0 -> 1 way (stay put)
        // n = 1 -> 1 way (1 step)
        if (n <= 1) {
            System.out.println(1);
            return;
        }

        // Iterative Fibonacci: ways = Fib(n+1)
        long prev = 1; // ways for 0 steps
        long curr = 1; // ways for 1 step
        for (int i = 2; i <= n; i++) {
            long next = prev + curr;
            prev = curr;
            curr = next;
        }

        System.out.println(curr);
	}

}
