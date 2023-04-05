package com.strings_arrays.practice;


public class String4 {

	public static void main(String[] args) {

		StringBuffer sb=new StringBuffer("Hello ");  
		sb.append("Java");
		System.out.println(sb);
		
		System.out.println("===========================");
		
		sb.insert(1,"Java");
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
