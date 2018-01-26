package com.main.xiaozhao2017.day15;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 	题目描述
		一个数组有 N 个元素，求连续子数组的最大和。 例如：[-1,2,1]，和最大的连续子数组为[2,1]，其和为 3
	输入描述:
		输入为两行。 第一行一个整数n(1 <= n <= 100000)，表示一共有n个元素 第二行为n个数，即每个元素,每个整数都在32位int范围内。以空格分隔。
	输出描述:
		所有连续子数组中和最大的值。
	示例1
	输入
		3 
		-1 2 1
	输出
		3
 * @author Administrator
 *
 */
public class Question1 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] array=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		
		int result=getMaxSum(array);
		
		System.out.println(result);
	}

	/**
	 * 求连续子数组的最大和
	 * @param array
	 * @return
	 */
	private static int getMaxSum(int[] array) {
		if(array==null||array.length==0){
			return 0;
		}
		int max=array[0];
		int sum=array[0];
		for(int i=1;i<array.length;i++)
		{
			if(sum<0){
				sum=array[i];
			}else{
				sum+=array[i];
			}
			max=sum>max?sum:max;
		}
		
		return max;
	}

}
