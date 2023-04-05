package com.strings_arrays.practice;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class String2 {

	public static void main(String[] args) {

		String s1 = "Mukesh";
		s1.concat("Otwani");
		System.out.println(s1);
		
		System.out.println();
		
		String s2 = "Sachin";
		s2 =s2.concat("Otwani");
		System.out.println(s2);
		
		System.out.println();
		
		String s3 = "Savro";
		String s4 = "Savro";
		System.out.println(s3.equals(s4));
		
		System.out.println();
		
		String s5 = "Savro";
		String s6 = "savro";
		System.out.println(s5.equalsIgnoreCase(s6));
		
		System.out.println();
		
		String s7 = "Savro";
		String s8 = "savro";
		System.out.println(s7.equals(s8));
		
		System.out.println();
		
		String s9 = "Test1";
		String s10 = "Test1";
		System.out.println(s9==s10);
		
		System.out.println();
		
		String s11 = "Test12";
		String s12 = "Test12";
		String s13 = "Test2";
		System.out.println(s11.compareTo(s11));
		System.out.println(s11.compareTo(s13));
		System.out.println(s13.compareTo(s12));
		
		System.out.println();
		
		String s14 = "Mukesh " + "Otwani";
		System.out.println(s14);
		
		System.out.println();
		
		String s15 = "Mukesh ";
		String s16 = "Otwani ";
		System.out.println(s16.concat(s15));
		
		System.out.println();
		
		String s17 = 5 + 50 + 500 +" Mukesh " + 100 + 23;
		System.out.println(s17);
		
		System.out.println();
		
		StringBuilder s18 = new StringBuilder("Test1 ");
		StringBuilder s19 = new StringBuilder("Test2 ");
		StringBuilder s20 = s18.append(s19);
		System.out.println(s20);
		
		System.out.println();
		
		String s21 = new String("Test1 ");
		String s22 = new String("Test2 ");
		String s23 = String.join("",s21, s22);
		System.out.println(s23);
		
		System.out.println();
		
		
		StringJoiner s24 = new StringJoiner(", ");
		s24.add("Test1 ");
		s24.add("Test3 ");
		System.out.println(s24.toString());
		
		System.out.println();
		
		List<String> s25 = Arrays.asList("abc", "pqr", "xyz");
		String s26 = s25.stream().collect(Collectors.joining(", "));
		System.out.println(s26.toString());
		

	}

}
