package com.az.array;

import java.util.Random;


public class GenerateArray {
	
	Random random =new Random();
	public int[] generate(int n,int lower,int upper)
	{
		int[] ar=new int[n];
		
		System.out.println("Hello");
		
		for(int i=0;i<n;i++)
		{
			int k=random.nextInt((upper-lower)+1)+lower;
			ar[i]=k;
			
		}
		
		
		return ar;
	}

}
