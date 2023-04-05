package com.learning.prac1;

public class MaxOccuranceArray {

	public static void main(String[] args) {

		int[] arr = { 3, 7, 2, 2, 2, 5, 5, 5, 5, 4, 4, 4, 4, 4 };
		int n = arr.length;

		int maxcount = 0;
		int element_having_max_freq = 0;
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}

			if (count > maxcount) {
				maxcount = count;
				element_having_max_freq = arr[i];
				// System.out.println(arr[i]);
			}
		}
		System.out.println(element_having_max_freq);
	}
}
