package com.ys.huawei;

import java.io.*;

public class HJ11 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		for (int i = str.length(); i > 0; i--) {
			System.out.print(str.charAt(i - 1));
		}
	}

}
