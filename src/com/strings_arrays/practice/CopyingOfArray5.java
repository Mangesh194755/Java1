package com.strings_arrays.practice;

import java.util.Arrays;

public class CopyingOfArray5 {

	public static void main(String[] args) 
	{

		int a[] [] = {{1, 2, 3, 4}, 
					 {5, 6}, 
					 {0, 2, 42, -4, 5}};
		
		int b [] [] = new int [a.length][];
		
		System.out.println(a.length);
		System.out.println("==============================");
		System.out.println(b.length);
		System.out.println("==============================");
		
		for (int i=0; i<b.length; i++)
		{
			b[i] = new int [a[i].length];
			
			for(int j=0; j<b[i].length; j++)
			{
				b[i][j] = a[i][j];
			}
		}
		System.out.println(Arrays.deepToString(b));
		
}
}

