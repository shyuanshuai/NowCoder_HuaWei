package com.ys.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class HJ2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String arr = br.readLine();
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < arr.length(); i++) {
			String key = String.valueOf(arr.charAt(i)).toUpperCase();
			if (map.containsKey(key)) {
				map.put(key, map.get(key) + 1);
			} else {
				map.put(key, 1);
			}
		}
		String findChar = br.readLine().toUpperCase();
		int value = map.get(findChar) == null ? 0 : map.get(findChar);
		System.out.println(value);
	}

}
