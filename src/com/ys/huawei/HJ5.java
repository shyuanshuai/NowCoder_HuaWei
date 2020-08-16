package com.ys.huawei;

import java.io.IOException;
import java.util.Scanner;

public class HJ5 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String str = sc.nextLine();
			int result = Integer.parseInt(str.substring(2), 16);
			System.out.println(result);
		}
	}

}
