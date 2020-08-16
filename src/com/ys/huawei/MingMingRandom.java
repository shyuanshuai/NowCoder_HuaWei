package com.ys.huawei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MingMingRandom {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> result = new ArrayList<Integer>();
		while(scanner.hasNext()) {
			List<Integer> list = new ArrayList<Integer>();
			int length = Integer.valueOf(scanner.nextLine());
			for (int i = 0; i < length; i++) {
				int value = Integer.valueOf(scanner.nextLine());
				if(!list.contains(value)) {
					list.add(value);
				}
			}
			Collections.sort(list);
			result.addAll(list);
		}
		for (Integer integer : result) {
			System.out.println(integer);
		}
	}
	
}
