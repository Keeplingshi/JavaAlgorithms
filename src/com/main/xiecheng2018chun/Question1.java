package com.main.xiecheng2018chun;

import java.util.Scanner;

/**
 * 给定一个整数的数组，要求将数组中的所有的0元素移动到数组的最后，其他的元素保持原来的顺序。

	要求：空间复杂度不能超过O(1)
	
	example：
	
	给定数组[0,2,0,7]转换后应为[2,7,0,0]
	
	输入：
	
	第一行输入一个数组的长度
	
	其他的数为数组中元素。
 * @author Administrator
 *
 */
public class Question1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[] = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		moveArr(array);

		for (int i = 0; i < n; i++) {
			System.out.println(array[i]);
		}

	}

	public static void moveArr(int[] arr) {
		if (arr.length == 0 || arr == null) {
			return;
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				count++;
			}
		}
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[j] = arr[i];
				j++;
			}
		}
		for (int i = arr.length - count; i < arr.length; i++) {
			arr[i] = 0;
		}
	}
}
