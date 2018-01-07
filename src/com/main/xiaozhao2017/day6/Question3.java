package com.main.xiaozhao2017.day6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 	题目描述
		输入n个整数，输出出现次数大于等于数组长度一半的数。
	输入描述:
		每个测试输入包含 n个空格分割的n个整数，n不超过100，其中有一个整数出现次数大于等于n/2。
	输出描述:
		输出出现次数大于等于n/2的数。
	示例1
	输入
		3 9 3 2 5 6 7 3 2 3 3 3
	输出
		3
 * @author Administrator
 *
 */
public class Question3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<>();
		String str=sc.nextLine();
		String[] array=str.split(" ");
		for(int i=0;i<array.length;i++)
		{
			list.add(Integer.parseInt(array[i]));
		}
		
		int len=list.size()/2;
		
		for (Integer integer : list) {
			
			int count=0;
			for (Integer k : list)
			{
				if(k==integer){
					count++;
				}
			}
			
			if(count>=len){
				System.out.println(integer);
				break;
			}
		}
	}

}
