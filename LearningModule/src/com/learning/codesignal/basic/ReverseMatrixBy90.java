package com.learning.codesignal.basic;

public class ReverseMatrixBy90 {

	/*
	 * try to solve this task in-place (with O(1) additional memory), since this is
	 * what you'll be asked to do during an interview.
	 * 
	 * You are given an n x n 2D matrix that represents an image. Rotate the image
	 * by 90 degrees (clockwise).
	 */

	int[][] solution(int[][] matrix) {
		int row = matrix.length;
		for (int i = 0; i < row; i++) {
			for (int j = i; j < row; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		// reverse each row
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row / 2; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][row - 1 - j];
				matrix[i][row - 1 - j] = temp;
			}
		}

		return matrix;
	}

}
