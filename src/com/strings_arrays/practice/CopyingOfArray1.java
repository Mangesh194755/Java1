package com.strings_arrays.practice;

public class CopyingOfArray1 {

	public static void main(String[] args) 
	{

		int a[] = {1, 3, 5, 6, 9};
		int b[] = a;
		//int b[] = {1, 3, 5, 6, 2};
		
		if(b==a) 
		{		
			for (int i=0; i<a.length; i++)
			{
			System.out.println(b[i] +"");
			}			
		}
		else
		{
			System.out.println("Values don't match");
		}

	}
	
}


