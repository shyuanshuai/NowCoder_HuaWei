package com.ys.huawei;

import java.util.Scanner;

public class Transfer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String input = scanner.nextLine();
			System.out.println(Integer.valueOf(input.substring(2), 16));
		}
	}
	
}
