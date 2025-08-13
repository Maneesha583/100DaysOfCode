package com.week2;

public class ContainerMaxWater {
	
	public static int maxArea(int[] containers) {
        int left = 0;
        int right = containers.length - 1;
        int maxArea = 0;

        while (left < right) {
            int base = right - left;
            int minHeight = Math.min(containers[left], containers[right]);
            int area = base * minHeight;
            maxArea = Math.max(maxArea, area);

            // Move the pointer with the smaller height
            if (containers[left] < containers[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] containers = {3, 2, 1, 1, 4, 2};
        System.out.println("Max Area: " + maxArea(containers));

	}

}
