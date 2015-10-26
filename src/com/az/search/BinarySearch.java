package com.az.search;

import java.util.Arrays;

public class BinarySearch {

	public static boolean iteration(int[] arr, int k, int f, int l) {

		while (f <= l) {
			int m = (f + l) / 2;
			if (arr[m] == k)
				return true;
			else if (arr[m] < k) {
				f = m + 1;

			} else {
				l = m - 1;
				;
			}

		}

		return false;
	}

	public static boolean recursion(int[] arr, int k, int f, int l) {

		int m = (f + l) / 2;

		if (f>l)
			return false;

		if (arr[m] == k)
			return true;
		else if (arr[m] < k) {
			return recursion(arr, k, m + 1, l);
		} else {
			return recursion(arr, k, f, m - 1);
		}

	}
	
	
	
	public static int firstOccurence(int[] arr,int k,int f,int l)
	{
		int min=0;
		
		int m=(f+l)/2;
		
		if(f>l)
			return -1;
		
		if(arr[m]==k)
		{
			l=m-1;
			min= firstOccurence(arr, k, f, l);
			if(min==-1)
			min=m;
			
			return min;
			
		}else if(arr[m]<k){
			
			min= firstOccurence(arr, k, m+1, l);
		}else{
			min= firstOccurence(arr, k, f, m-1);
		}
		

		return min;
	}
	
	public static int lastOccurance(int[] arr,int k,int f,int l)
	{
		int max=0;
		
		int m=(f+l)/2;
		
		if(f>l)
			return -1;
		
		if(arr[m]==k)
		{
			f=m+1;
			max= lastOccurance(arr, k, f, l);
			if(max==-1)
			max=m;
			
			return max;
			
		}else if(arr[m]<k){
			
			max= firstOccurence(arr, k, m+1, l);
		}else{
			max= firstOccurence(arr, k, f, m-1);
		}
		

		return max;
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 1, 2, 7, 3, 3, 9, 5 };
		int k = 3;

		Arrays.sort(arr);

		if (recursion(arr, k, 0, arr.length - 1)) {
			System.out.println("Found");
		} else {
			System.out.println("Not found");
		}
		
		
		int min=firstOccurence(arr, k, 0, arr.length-1);
		
		if(min==-1)
			System.out.println("Not found");
		else{
			System.out.println("Found at "+min);
		}
		
		int max=lastOccurance(arr, k, 0, arr.length-1);
		
		if(max==-1)
			System.out.println("Not found");
		else{
			System.out.println("Found at "+max);
		}
			

	}

}
