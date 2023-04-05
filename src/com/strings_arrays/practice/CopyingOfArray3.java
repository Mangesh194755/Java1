package com.strings_arrays.practice;

import java.util.Arrays;

public class CopyingOfArray3 {

	public static void main(String[] args) 
	{

		int a[] = {1, 3, 5, 6, 9};
		int b[] = new int[a.length];
		int c[] = new int[5];
		
		System.arraycopy(a, 0, b, 0, 5);
		
		System.out.println(Arrays.toString(b));
		
		System.out.println("=============================");
		
		System.arraycopy(a, 2, c, 1, 3);
		
		System.out.println(Arrays.toString(c));
		
		
}
}

