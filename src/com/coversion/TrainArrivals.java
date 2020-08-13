package com.coversion;

import java.util.Arrays;
/***
 * 
 * @author Sridhar
 * Given arrival and departure times of all trains that reach a railway station, the task is to find the
minimum number of platforms required for the railway station so that no train waits.
We are given two arrays which represent arrival and departure times of trains that stop.
Example Input &amp; Output:
Input: arr[] = {9:00, 9:40, 9:50, 11:00, 15:00, 18:00}
dep[] = {9:10, 12:00, 11:20, 11:30, 19:00, 20:00}
Output: 3
Input: arr[] = {9:00, 9:40}
dep[] = {9:10, 12:00}
Output: 1
 *
 */
public class TrainArrivals {
	public static void main(String[] args) throws InterruptedException {
		//first case
		 int arr1[] = { 900, 940, 950, 1100, 1500, 1800 }; 
	        int dep1[] = { 910, 1200, 1120, 1130, 1900, 2000 }; 
		int n1=arr1.length;
		System.out.println("Minimum Number of Platforms Required = " + findAnotherPlatform(arr1, dep1, n1));
		Thread t = new Thread();
		t.sleep(50000);
		//second case
	        int arr[] = {900, 940};
	        int dep[]   = {910, 1200};
	        int n = arr.length; 
	        System.out.println("Minimum Number of Platforms Required = " + findPlatform(arr, dep, n)); 
	}
	 static int findPlatform(int arr[], int dep[], int n) 
	    { 
	        // Sort arrival and departure arrays 
	        Arrays.sort(arr); 
	        Arrays.sort(dep); 
	  
	        // plat_needed indicates number of platforms 
	        // needed at a time 
	        int plat_needed = 1, result = 1; 
	        int i = 1, j = 0; 
	  
	        // Similar to merge in merge sort to process 
	        // all events in sorted order 
	        while (i < n && j < n) { 
	  
	            // If next event in sorted order is arrival, 
	            // increment count of platforms needed 
	            if (arr[i] <= dep[j]) { 
	                plat_needed++; 
	                i++; 
	            } 
	  
	            // Else decrement count of platforms needed 
	            else if (arr[i] > dep[j]) { 
	                plat_needed--; 
	                j++; 
	            } 
	  
	            // Update result if needed 
	            if (plat_needed > result) 
	                result = plat_needed; 
	        } 
	  
	        return result; 
}
	 
	 static int findAnotherPlatform(int arr[], int dep[], int n) 
	    { 
	        // Sort arrival and departure arrays 
	        Arrays.sort(arr); 
	        Arrays.sort(dep); 
	  
	        // plat_needed indicates number of platforms 
	        // needed at a time 
	        int plat_needed = 1, result = 1; 
	        int i = 1, j = 0; 
	  
	        // Similar to merge in merge sort to process 
	        // all events in sorted order 
	        while (i < n && j < n) { 
	  
	            // If next event in sorted order is arrival, 
	            // increment count of platforms needed 
	            if (arr[i] <= dep[j]) { 
	                plat_needed++; 
	                i++; 
	            } 
	  
	            // Else decrement count of platforms needed 
	            else if (arr[i] > dep[j]) { 
	                plat_needed--; 
	                j++; 
	            } 
	  
	            // Update result if needed 
	            if (plat_needed > result) 
	                result = plat_needed; 
	        } 
	  
	        return result; 
}
	} 
