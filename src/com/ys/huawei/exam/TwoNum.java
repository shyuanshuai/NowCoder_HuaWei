package com.ys.huawei.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwoNum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long num = scanner.nextLong();

		if (num < 3) {
			System.out.println("-1 -1");
			return;
		}

		List<Long> list = new ArrayList<Long>();

		for (long i = 3; i <= num; i = i + 2) {
			boolean flag = true;
			for (long j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				list.add(i);
			}
		}

		for (Long num1 : list) {
			long temp = num % num1;
			long num2 = num / num1;
			if (temp == 0 && list.contains(num2)) {
				if (num1 < num2) {
					System.out.println(num1 + " " + num2);
				} else {
					System.out.println(num2 + " " + num1);
				}
				return;
			}
		}
		System.out.println("-1 -1");

	}

}
