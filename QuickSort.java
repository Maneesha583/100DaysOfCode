package com.techpalle;

public class QuickSort {
	//main quickSort method
	private static void quickSort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		if(low<high) {
			int pi=partition(arr, low, high);
			
			quickSort(arr,low,pi-1);
			quickSort(arr,pi+1 ,high);
		}
		
	}
	
    //Method to perform Partition
	private static int partition(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		int pivot=arr[high]; //Choose last element as pivot
		int i=low-1;         //index for smaller element
		
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {
				i++;
				//swapping 
				int temp =arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		//Place pivot at the right position
		int temp =arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		return i+1; //return pivot index
	}

	//Main method to run the program
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,6,2,3,1,8,4};
		System.out.println("Before Sorting");
		for(int num:arr) {
			System.out.print(num+" ");
		}
		System.out.println();
		quickSort(arr,0,arr.length-1);
		
		System.out.println("After Quick Sort");
		for(int num : arr)
		{
			System.out.print(num+" ");
		}

	}

	

}
