package com.ys.huawei;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CharCollect {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String src = scanner.nextLine();
			List<String> list = new ArrayList<>();
			StringBuilder stringBuilder = new StringBuilder();
			for (int i = 0; i < src.length(); i++) {
				String strChar = String.valueOf(src.charAt(i));
				if (!list.contains(strChar)) {
					list.add(strChar);
					stringBuilder.append(strChar);
				}
			}
			System.out.print(stringBuilder.toString());
		}
	}

}
