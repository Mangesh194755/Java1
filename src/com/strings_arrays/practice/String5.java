package com.strings_arrays.practice;


public class String5 {

	public static void main(String[] args) {

		StringBuilder sb=new StringBuilder("Hello ");  
		sb.append("Java");//now original string is changed  
		System.out.println(sb);
		
		System.out.println("===========================");
		
		sb.insert(1,"Java");//now original string is changed  
		System.out.println(sb);
		
		System.out.println("===========================");
		
		sb.replace(1,3,"Java");  
		System.out.println(sb);
		
		System.out.println("===========================");
		
		sb.delete(1,3);  
		System.out.println(sb);
		
		System.out.println("===========================");
		
		sb.reverse();  
		System.out.println(sb);

	}

}
