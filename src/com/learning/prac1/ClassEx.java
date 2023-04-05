package com.learning.prac1;

public class ClassEx {

	 static int x=90;
	 int y=111;
	
	public static void main(String[] args) 
	
	{
		ClassEx obj1 = new ClassEx();
		obj1.sum();
		System.out.println(obj1.x);
		System.out.println(obj1.y);
		
		System.out.println("In main " +x);
		//System.out.println(y);
		
	}
	
	public void sum()
	{
		int a = 34;
		int b = 100;
		int c = a + b;
		System.out.println("Sum "+c);
		

		System.out.println(x);
		System.out.println(y);
	}

}
