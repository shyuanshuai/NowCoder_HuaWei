package com.ys.huawei;

import java.util.Scanner;

public class HJ7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String str = sc.nextLine();
			float value = Float.valueOf(str);
			int result = Math.round(value);
			System.out.println(result);
		}
	}

}
