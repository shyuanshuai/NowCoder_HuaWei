package com.ys.huawei;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class HJ8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = Integer.valueOf(sc.nextLine());
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>(new MyComparator());
		for (int i = 0; i < size; i++) {
			String[] str = sc.nextLine().split(" ");
			int key = Integer.valueOf(str[0]);
			if (map.containsKey(key)) {
				map.put(key, map.get(key) + Integer.valueOf(str[1]));
			} else {
				map.put(key, Integer.valueOf(str[1]));
			}
		}

		Set<Entry<Integer, Integer>> set = map.entrySet();
		for (Entry<Integer, Integer> entry : set) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}

class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1 - o2;
	}
}
