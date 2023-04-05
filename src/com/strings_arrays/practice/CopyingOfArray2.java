package com.strings_arrays.practice;

import java.util.Arrays;

public class CopyingOfArray2 {

	public static void main(String[] args) 
	{

		int a[] = {1, 3, 5, 6, 9};
		int b[] = new int[5];
		
		for ( int i = 0; i <a.length; i++)
		{
			b[i]=a[i];
		}
	System.out.println(Arrays.toString(b));
}
}

