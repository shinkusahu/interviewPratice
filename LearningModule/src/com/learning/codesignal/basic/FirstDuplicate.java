package com.learning.codesignal.basic;

import java.util.LinkedHashSet;

public class FirstDuplicate {

	public static int firstDuplicateFirstTry(int[] a) {
		LinkedHashSet<Integer> map = new LinkedHashSet<>();
		for (int number : a) {
			// duplicate found, return its number
			if (map.contains(number))
				return number;
			// otherwise, add this number to the HashSet
			else
				map.add(number);
		}
		// no duplicate found
		return -1;
	}

	private static int firstDuplicateSecondTry(int[] a) {
		for (int i : a) {
			if (a[Math.abs(i) - 1] < 0)
				return Math.abs(i);
			a[Math.abs(i) - 1] *= -1;
		}
		return -1;
	}

}
