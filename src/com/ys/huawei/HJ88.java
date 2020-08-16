package com.ys.huawei;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HJ88 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String src = sc.nextLine();
			String[] arr = src.split("-");

			String left = arr[0];
			String right = arr[1];

			String[] leftDtl = left.split(" ");
			String[] rightDtl = right.split(" ");

			// ���������ը��ֱ�������ը
			if ("joker JOKER".equals(left) || "joker JOKER".equals(right)) {
				System.out.println("joker JOKER");
				return;
			}

			// ������治��ȣ����ERROR������ը�����
			if (leftDtl.length != rightDtl.length) {
				if (leftDtl.length == 4) {
					System.out.println(left);
					return;
				}
				if (rightDtl.length == 4) {
					System.out.println(right);
					return;
				}
				System.out.println("ERROR");
			} else {
				Map<String, Integer> map = new HashMap<String, Integer>();
				map.put("3", 1);
				map.put("4", 2);
				map.put("5", 3);
				map.put("6", 4);
				map.put("7", 5);
				map.put("8", 6);
				map.put("9", 7);
				map.put("10", 8);
				map.put("J", 9);
				map.put("Q", 10);
				map.put("K", 11);
				map.put("A", 12);
				map.put("2", 13);

				if (map.get(leftDtl[0]) > map.get(rightDtl[0])) {
					System.out.println(left);
				} else {
					System.out.println(right);
				}
			}
		}
	}

}
