package com.ys.huawei;

import java.io.*;

public class HJ13 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sentence = br.readLine();
		if (sentence == null || sentence.length() == 0) {
			System.out.println("");
		}
		String[] arr = sentence.split(" ");
		StringBuffer sb = new StringBuffer();
		for (int i = arr.length; i > 0; i--) {
			sb.append(arr[i - 1] + " ");
		}
		System.out.println(sb.toString().trim());
	}
	
}
