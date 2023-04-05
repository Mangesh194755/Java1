package com.strings_arrays.practice;

public class FreqOfArrayElement1 {

	public static void main(String[] args) {
		
		int a[] = new int[] {1, 2, 8, 3, 2, 2, 2, 5, 1};
		
		int b[] = new int [a.length];
		
		int freq = 1;
		
		for (int i=0; i<a.length; i++) 
		{
			int count = 1;
			for (int j=0; j<a.length; j++)
			{
				if (a[i] == b[j])
				{
					count ++;
				}
				freq = a[i];
				
			}
			System.out.println(i);
		}
			
	}

}
