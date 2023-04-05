package com.strings_arrays.practice;

import java.util.Arrays;

public class CopyingOfArray6 {

	public static void main(String[] args) 
	{

		int a[] [] = {{1, 2, 3, 4}, 
					 {5, 6}, 
					 {0, 2, 42, -4, 5}};
		
		int b [] [] = new int [a.length][];
		
		for (int i=0; i<a.length; i++)
		{
			b[i] = new int [a[i].length];
			
			System.arraycopy(a, 0, b, 0, 3);
		}
		System.out.println(Arrays.deepToString(b));
}
}

