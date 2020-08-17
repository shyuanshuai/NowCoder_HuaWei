package com.ys.huawei;

import java.util.Scanner;

public class TheHighGrade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] init = input.split(" ");
		int studentSum = Integer.valueOf(init[0]);
		int operateSum = Integer.valueOf(init[1]);
		int[] grades = new int[studentSum];
		String[] gradeStr = scanner.nextLine().split(" ");
		for (int i = 0; i < grades.length; i++) {
			grades[i] = Integer.valueOf(gradeStr[i]);
		}
		for (int i = 0; i < operateSum; i++) {
			String[] operate = scanner.nextLine().split(" ");
			if ("Q".equals(operate[0])) {
				int max = 0;
				int start = Integer.valueOf(operate[1]) > Integer.valueOf(operate[2]) ? Integer.valueOf(operate[2])
						: Integer.valueOf(operate[1]);
				int end = Integer.valueOf(operate[1]) <= Integer.valueOf(operate[2]) ? Integer.valueOf(operate[2])
						: Integer.valueOf(operate[1]);
				for (int j = start; j <= end; j++) {
					if (grades[j - 1] > max) {
						max = grades[j - 1];
					}
				}
				System.out.println(max);
			}
			if ("U".equals(operate[0])) {
				grades[Integer.valueOf(operate[1]) - 1] = Integer.valueOf(operate[2]);
			}
		}
	}

}
