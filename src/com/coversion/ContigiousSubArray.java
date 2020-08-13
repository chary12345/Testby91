package com.coversion;
/**
 * 
 * @author Sridhar
 * Given an array arr of size N and an integer K, the task is to find the maximum for each and every
contiguous subarray of size K.
Example Input &amp; Output:
Input: arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6}, K = 3
Output: 3 3 4 5 5 5 6
Input: arr[] = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13}, K = 4
Output: 10 10 10 15 15 90 90
 *
 */
public class ContigiousSubArray {
	public static void main(String args[]) throws InterruptedException {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int k = 3;
		
		printKMax(arr, arr.length, k);
		
		int arr1[]= {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
		System.out.println();
		Thread t = new Thread();
		t.sleep(5000);
		int k1 = 4 ;
		printAnotherKMax(arr1, arr1.length, k1);
	}

	private static void printAnotherKMax(int[] arr1, int length, int k1) {
		
		int j, max;

		for (int i = 0; i <= length - k1; i++) {

			max = arr1[i];

			for (j = 1; j < k1; j++) {
				if (arr1[i + j] > max)
					max = arr1[i + j];
			}
			System.out.print(max + " ");
		}
		
	}

	private  static void printKMax(int arr[], int n, int k) {
		int j, max;

		for (int i = 0; i <= n - k; i++) {

			max = arr[i];

			for (j = 1; j < k; j++) {
				if (arr[i + j] > max)
					max = arr[i + j];
			}
			System.out.print(max + " ");
		}
	}
}
