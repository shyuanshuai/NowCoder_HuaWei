package com.ys.huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Drink {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		List<Integer> results = new ArrayList<Integer>();
		while (!"0".equals(input)) {
			// 最多能喝到的瓶数
			int result = 0;
			// 剩余空瓶数
			int remain = Integer.valueOf(input);
			if (remain < 2) {
				result = 0;
			}
			while(remain > 2) {
				result = result + remain / 3;
				remain = remain / 3 + remain % 3;
			}
			if (remain == 2) {
				result++;
			}
			results.add(result);
			input = scanner.nextLine();
		}
		results.forEach(r -> System.out.println(r));
	}
	
}
