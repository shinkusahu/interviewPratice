package com.learning.codesignal.basic;

import java.util.HashSet;
import java.util.Set;

public class ValidSuduko {

	/*
	 * Sudoku is a number-placement puzzle. The objective is to fill a 9 × 9 grid
	 * with numbers in such a way that each column, each row, and each of the nine 3
	 * × 3 sub-grids that compose the grid all contain all of the numbers from 1 to
	 * 9 one time.
	 * 
	 * Implement an algorithm that will check whether the given grid of numbers
	 * represents a valid Sudoku puzzle according to the layout rules described
	 * above. Note that the puzzle represented by grid does not have to be solvable
	 * 
	 * For
	 * 
	 * grid = [['.', '.', '.', '1', '4', '.', '.', '2', '.'], ['.', '.', '6', '.',
	 * '.', '.', '.', '.', '.'], ['.', '.', '.', '.', '.', '.', '.', '.', '.'],
	 * ['.', '.', '1', '.', '.', '.', '.', '.', '.'], ['.', '6', '7', '.', '.', '.',
	 * '.', '.', '9'], ['.', '.', '.', '.', '.', '.', '8', '1', '.'], ['.', '3',
	 * '.', '.', '.', '.', '.', '.', '6'], ['.', '.', '.', '.', '.', '7', '.', '.',
	 * '.'], ['.', '.', '.', '5', '.', '.', '.', '7', '.']] the output should be
	 * solution(grid) = true;
	 */

	boolean solution(char[][] grid) {
		int n = grid.length;

		Set<String> set = new HashSet<String>();

		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				if (grid[row][col] != '.' && !set.add(grid[row][col] + " in row " + row))
					return false;
				if (grid[row][col] != '.' && !set.add(grid[row][col] + " in col " + col))
					return false;
				if (grid[row][col] != '.' && !set.add(grid[row][col] + " in square " + row / 3 + " " + col / 3))
					return false;
			}
		}

		return true;
	}

}
