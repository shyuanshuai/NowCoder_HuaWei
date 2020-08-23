package com.ys.huawei.exam;

import java.util.Scanner;

public class Jump {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int result = getSum(total);
		System.out.println(result);
	}

	/**
	 * f(x) = f(x-1) + f(x-3)
	 * 
	 * @param total
	 * @return
	 */
	private static int getSum(int total) {
		if (total == 0) {
			return 0;
		}
		if (total < 3) {
			return 1;
		}
		if (total == 3) {
			return 2;
		}
		return getSum(total - 1) + getSum(total - 3);
	}

}
