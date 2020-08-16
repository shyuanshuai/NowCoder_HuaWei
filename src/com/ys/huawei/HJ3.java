package com.ys.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HJ3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.valueOf(br.readLine());
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < length; i++) {
			int value = Integer.valueOf(br.readLine());
			if (!list.contains(value)) {
				list.add(value);
			}
		}
		Collections.sort(list);
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}

}
