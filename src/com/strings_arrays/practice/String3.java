package com.strings_arrays.practice;

import java.util.Arrays;

public class String3 {

	public static void main(String[] args) {

		String s1 = "This is a string example";
		System.out.println(s1.substring(8));
		
		System.out.println(s1.substring(8, 16));
		
		String[] s2 = s1.split("\\. ");
		System.out.println(Arrays.toString(s2));
		
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1.trim());
		
		System.out.println(s1.startsWith("Thi"));

		System.out.println(s1.startsWith("hi"));
		
		System.out.println(s1.endsWith("le"));
				
		System.out.println(s1.endsWith("el"));
		
		System.out.println(s1.charAt(5));
		
		System.out.println(s1.length());
		
		int a = 23;
		String s3 = String.valueOf(a);
		System.out.println(s3+67);
		
		System.out.println(s1.replace("This", "That"));
		

	}

}
