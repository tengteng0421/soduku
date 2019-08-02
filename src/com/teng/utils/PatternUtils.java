package com.teng.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PatternUtils {
	// 返回某数字可填入位置
	public static List<String> getNumberPos(int number, int[][] sudo) {
		List<String> result = new ArrayList<>();
		// 检查所在行,检查所在列,检查所在区
		Set<Integer> rowNum = new HashSet<>();
		Set<Integer> colNum = new HashSet<>();
		Set<Integer> areaNum = new HashSet<>();
		for (int i = 0; i < sudo.length; i++) {
			for (int j = 0; j < sudo[i].length; j++) {
				if (sudo[i][j] == number) {
					rowNum.add(i);
					colNum.add(j);
					areaNum.add(getArea(i, j));
				}
			}
		}
		// 检验位置是否合理, 合理添加到结果集
		for (int i = 0; i < sudo.length; i++) {
			for (int j = 0; j < sudo[i].length; j++) {
				if (sudo[i][j] > 0) {
					continue;
				}
				if (rowNum.contains(i)) {
					continue;
				}
				if (colNum.contains(j)) {
					continue;
				}
				if (areaNum.contains(getArea(i, j))) {
					continue;
				}
				result.add(i + "." + j);
			}
		}

		return result;
	}

	// 打印
	public static void printResult(int[][] sodu) {
		for (int i = 0; i < sodu.length; i++) {
			if (i == 0 || i == 3 || i == 6) {
				System.out.println("-------------------------");
			}
			for (int j = 0; j < sodu[i].length; j++) {
				if (j == 0 || j == 3 || j == 6) {
					System.out.print("| ");
				}
				if (sodu[i][j] == 0) {
					System.out.print("  ");
				} else {
					System.out.print(sodu[i][j] + " ");
				}
			}
			System.out.print("|");
			System.out.println();
		}
		System.out.println("-------------------------");
	}

	private static int getArea(int i, int j) {
		if (i < 3 && j < 3) {
			return 0;
		} else if (i < 3 && j >= 3 && j < 6) {
			return 1;
		} else if (i < 3 && j >= 6 && j < 9) {
			return 2;
		} else if (i >= 3 && i < 6 && j < 3) {
			return 3;
		} else if (i >= 3 && i < 6 && j >= 3 && j < 6) {
			return 4;
		} else if (i >= 3 && i < 6 && j >= 6) {
			return 5;
		} else if (i >= 6 && j < 3) {
			return 6;
		} else if (i >= 6 && j >= 3 && j < 6) {
			return 7;
		} else if (i >= 6 && j >= 6) {
			return 8;
		}
		return -1;
	}
}
