package com.strings_arrays.practice;

import java.util.Arrays;

public class CopyingOfArray4 {

	public static void main(String[] args) 
	{

		int a[] = {1, 3, 5, 6, 9};
		
		int b[] = Arrays.copyOfRange(a, 0, a.length);
		
		System.out.println(Arrays.toString(b));
		
		int c[] = Arrays.copyOfRange(a, 1, 3);
		
		System.out.println(Arrays.toString(c));
		
		
}
}

