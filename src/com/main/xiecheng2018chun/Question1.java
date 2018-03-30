package com.main.xiecheng2018chun;

import java.util.Scanner;

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
