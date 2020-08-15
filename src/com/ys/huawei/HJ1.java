package com.ys.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String src = br.readLine();
		if (src == null || src.length() == 0) {
			System.out.println(0);
		} else {
			String[] arr = src.split(" ");
			System.out.println(arr[arr.length - 1].length());
		}
	}

}
