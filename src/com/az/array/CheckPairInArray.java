package com.az.array;

import java.util.Arrays;
import java.util.HashSet;

/*Write a C program that, given an array A[] of n numbers and another number x,
determines whether or not there exist two elements in S whose sum is exactly x.*/

public class CheckPairInArray {

	GenerateArray gr=new GenerateArray();
	
	
	public boolean usingHash(int[] ar,int x)
	{
		HashSet<Integer> hash=new HashSet<>();
		
		for(int i=0;i<ar.length;i++)
		{
			
			if(hash.contains(x-ar[i]))
				return true;
			
			hash.add(ar[i]);
			
		}
		
		
		return false;
	}
	
	public boolean usingBinarySearch(int[] ar,int x)
	{
		Arrays.sort(ar);
	
		for(int i=0;i<ar.length;i++)
		{
			if(Arrays.binarySearch(ar, x-ar[i])>=0)
			{
				return true;
			}
			
			
		}
		
		return false;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int x=15;
		int[] ar=new int[n];
		CheckPairInArray cpa=new CheckPairInArray();
		ar=cpa.gr.generate(n,0,10);
		System.out.println(cpa.usingBinarySearch(ar, x));
		
	   //System.out.println(cpa.usingHash(ar, x));
		
		for(int i=0;i<n;i++)
		{
			System.out.println(ar[i]);
		}
		

	}

}
