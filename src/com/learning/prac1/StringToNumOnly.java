package com.learning.prac1;

public class StringToNumOnly {

	public static void main(String[] args) 
	{
	
		String s = new String();
		
		s= "This is 123 a statement 654 with numbers 789 in between";
				
		int value;
		try {
			value = Integer.parseInt(s.replaceAll("[^0-9]", " "));
			
			System.out.println("Only numeric values are extracted from given string "+value);
			
			System.out.println("After trim "+value);
			
		} catch (Exception e) {
			
			System.out.println("Exception is "+ e);
		}
		
		
		
		
	}

}
