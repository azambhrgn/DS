package com.az.array;

public class MajorityElement {
	GenerateArray gr = new GenerateArray();

	public int majority(int[] ar)
	{
		int maj=0;
		int count=1;
		for(int i=1;i<ar.length;i++)
		{
			
			if(ar[maj]==ar[i])
			{
				count++;
				System.out.println("c"+count);
			}
			else
			{
				
				count--;
				
				System.out.println("d"+count);
			}
			if(count==0)
			{
				System.out.println("o"+i);
				maj=i;
				count=1;
			}
			
			
			
		}
		System.out.println(count);
		if(count > 0)
		return ar[maj];
		else
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int[] ar = { 2, 23, 3, 4, 2 };
		MajorityElement obj = new MajorityElement();
		// ar=obj.gr.generate(n,0,10);

		System.out.println("MAjority element is " + obj.majority(ar));

	}

}
