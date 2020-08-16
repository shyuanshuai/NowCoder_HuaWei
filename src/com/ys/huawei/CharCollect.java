package com.ys.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CharCollect {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String src = br.readLine();
		List<String> list = new ArrayList<>();

		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < src.length(); i++) {
			String strChar = String.valueOf(src.charAt(i));
			if (!list.contains(strChar)) {
				list.add(strChar);
				sb.append(strChar);
			}
		}

		System.out.print(sb.toString());
	}

}
