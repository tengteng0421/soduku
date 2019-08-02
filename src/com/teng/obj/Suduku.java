package com.teng.obj;

public class Suduku {
	private static final int[][] initPattern = { { 0, 4, 0, 1, 6, 0, 5, 0, 0 }, { 0, 0, 0, 0, 2, 5, 0, 0, 9 },
			{ 6, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 7, 0, 0, 3, 0, 0, 0, 5 }, { 8, 5, 0, 4, 0, 2, 0, 3, 7 },
			{ 2, 0, 0, 0, 1, 0, 0, 4, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 2 }, { 9, 0, 0, 3, 8, 0, 0, 0, 0 },
			{ 0, 0, 1, 0, 7, 4, 0, 8, 0 } };

	private static int[][] processPattern = new int[9][9];

	public Suduku() {
		for (int i = 0; i < initPattern.length; i++) {
			for (int j = 0; j < initPattern[i].length; j++) {
				processPattern[i][j] = initPattern[i][j];
			}
		}
	}

	public int[][] getProcessPattern() {
		return processPattern;
	}
}
