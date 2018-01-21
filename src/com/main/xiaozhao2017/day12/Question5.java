package com.main.xiaozhao2017.day12;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 	题目描述
		n 只奶牛坐在一排，每个奶牛拥有 ai 个苹果，现在你要在它们之间转移苹果，使得最后所有奶牛拥有的苹果数都相同，
		每一次，你只能从一只奶牛身上拿走恰好两个苹果到另一个奶牛上，问最少需要移动多少次可以平分苹果，如果方案不存在输出 -1。
	输入描述:
		每个输入包含一个测试用例。每个测试用例的第一行包含一个整数 n（1 <= n <= 100），接下来的一行包含 n 个整数 ai（1 <= ai <= 100）。
	输出描述:
		输出一行表示最少需要移动多少次可以平分苹果，如果方案不存在则输出 -1。
	示例1
	输入
		4
		7 15 9 5
	输出
		3
 * @author Administrator
 *
 */
public class Question5 {

	public static void main(String[] args)
	{
//		int n=4;
//		int a[]={7,15,9,5};
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		
		Arrays.sort(a);
		int s=0;
		for(int i=0;i<a.length;i++)
		{
			s+=a[i];
		}
		if(s%n!=0){
			System.out.println(-1);
			return;
		}
		
		int avg=s/n;
		for(int i=0;i<a.length;i++)
		{
			if(Math.abs(a[i]-avg)%2!=0){
				System.out.println(-1);
				return;
			}
		}
		
		int step=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<avg){
				step+=Math.abs(a[i]-avg)/2;
			}
		}
		System.out.println(step);
	}
	
}
