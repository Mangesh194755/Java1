package com.strings_arrays.practice;

public class SumAverageOfArray {
	
	public static void main(String[] args)
	{
		int numbers [] = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
		
		int sum = 0;
		
		double average = 0;
		
		int arrLen = numbers.length;
		
		for (int n : numbers)
		{
			sum += n;
		}
		System.out.println("Sum of array elements is : "+ sum);
		
		System.out.println("Length of mentioned array is : "+arrLen);
		
		average = (double)sum/(double)arrLen;
		
		System.out.println("Average of array elements is :"+ average );
		
	}

}
