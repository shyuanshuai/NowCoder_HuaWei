package com.ys.huawei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class RecordError {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<String, Integer> map = new TreeMap<String, Integer>();
		while (scanner.hasNext()) {
			String input = scanner.nextLine();
			String key = input.substring(input.lastIndexOf("\\") + 1);
			if (map.containsKey(key)) {
				map.put(key, map.get(key) + 1);
			} else {
				map.put(key, new Integer(1));
			}
		}

		List<Map.Entry<String, Integer>> entrys = new ArrayList<>(map.entrySet());
		Collections.sort(entrys, new MyComp());
		for (Entry<String, Integer> entry : entrys) {
			String key = entry.getKey();
			int value = entry.getValue();
			if (key.length() > 16) {
				key = key.substring(key.length() - 16);
			}
			System.out.println(key + " " + value);
		}
	}

}

class MyComp implements Comparator<Map.Entry<String, Integer>> {

	@Override
	public int compare(Entry o1, Entry o2) {
		return ((String) o1.getValue()).compareTo((String) o2.getValue());
	}

}