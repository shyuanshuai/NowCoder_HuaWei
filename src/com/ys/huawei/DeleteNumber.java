package com.ys.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ��һ������a[N]˳����0~N-1��Ҫ��ÿ��������ɾ��һ��������ĩβʱѭ������ͷ�������У�
 * �����һ����ɾ��������ԭʼ�±�λ�á���8����(N=7)Ϊ��:��0��1��2��3��4��5��6��7����
 * 0->1->2(ɾ��)->3->4->5(ɾ��)->6->7->0(ɾ��),���ѭ��ֱ�����һ������ɾ����
 * 
 * @author YuanShuai
 *
 */
public class DeleteNumber {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int length = Integer.valueOf(str);

		if (length == 0) {
			System.out.println(0);
			return;
		}

		if (length == 1) {
			return;
		}

		if (length > 1000) {
			length = 999;
		}

		int[] arr = new int[length];
		int flag = 0;
		int result = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		for (int i = 0; i < arr.length; i++) {
			if (flag == 2 && arr[i] != -1) {
				flag = 0;
				// System.out.println(arr[i]);
				arr[i] = -1;
				result = i;
			}
			if (flag != 2 && arr[i] != -1) {
				flag++;
			}
			if (i == arr.length - 1) {
				i = -1;
				int count = 0;
				for (int j = 0; j < arr.length; j++) {
					count = count + arr[j];
				}
				if (count == -length) {
					break;
				}
			}
		}

		System.out.println(result);

	}

}
