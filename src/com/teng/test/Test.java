package com.teng.test;

import com.teng.obj.Suduku;
import com.teng.utils.PatternUtils;

public class Test {
	public static void main(String[] args) {
		Suduku sodu = new Suduku();
		int[][] processPattern = sodu.getProcessPattern();
		PatternUtils.printResult(processPattern);

	}
}
