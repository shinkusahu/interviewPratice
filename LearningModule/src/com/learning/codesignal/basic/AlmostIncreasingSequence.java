package com.learning.codesignal.basic;

public class AlmostIncreasingSequence {

	/*
	 * Given a sequence of integers as an array, determine whether it is possible to
	 * obtain a strictly increasing sequence by removing no more than one element
	 * from the array.
	 * 
	 * Note: sequence a0, a1, ..., an is considered to be a strictly increasing if
	 * a0 < a1 < ... < an. Sequence containing only one element is also considered
	 * to be strictly increasing.
	 * 
	 * For sequence = [1, 3, 2, 1], the output should be solution(sequence) = false.
	 * 
	 * There is no one element in this array that can be removed in order to get a
	 * strictly increasing sequence.
	 * 
	 * For sequence = [1, 3, 2], the output should be solution(sequence) = true.
	 * 
	 * You can remove 3 from the array to get the strictly increasing sequence [1,
	 * 2]. Alternately, you can remove 2 to get the strictly increasing sequence [1,
	 * 3].
	 */

	boolean solution(int[] sequence) {
		int numErr = 0;
		for (int i = 0; i < sequence.length - 1; i++) {
			if (sequence[i] - sequence[i + 1] >= 0) {
				numErr += 1;
				if (i - 1 >= 0 && i + 2 <= sequence.length - 1 && sequence[i] - sequence[i + 2] >= 0
						&& sequence[i - 1] - sequence[i + 1] >= 0) {
					return false;
				}
			}
		}
		return numErr <= 1;

	}

}
