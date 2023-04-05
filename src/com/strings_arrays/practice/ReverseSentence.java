package com.strings_arrays.practice;

import java.util.Arrays;
import java.util.Collections;

public class ReverseSentence {

	public static void main(String[] args) {
		
		String s = "i love programming very much";
		
		String text[] = s.split(" ");
		
		Collections.reverse(Arrays.asList(text));
		
		System.out.println(String.join(" ", text));

		
	}

}
