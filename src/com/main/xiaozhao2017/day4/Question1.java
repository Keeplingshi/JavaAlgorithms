package com.main.xiaozhao2017.day4;

import java.util.Scanner;

/**
 * 	题目描述
		有一个X*Y的网格，小团要在此网格上从左上角到右下角，只能走格点且只能向右或向下走。请设计一个算法，计算小团有多少种走法。给定两个正整数int x,int y，请返回小团的走法数目。
	输入描述:
		输入包括一行，逗号隔开的两个正整数x和y，取值范围[1,10]。
	输出描述:
		输出包括一行，为走法的数目。
	示例1
	输入
		3 2
	输出
		10
 * @author Administrator
 *
 */
public class Question1 {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		
		System.out.println(getways(m, n));
	}

	public static int getways(int m,int n)
	{
		if(m==0){
			return 1;
		}
		if(n==0){
			return 1;
		}
		return getways(m-1,n)+getways(m, n-1);
	}
	
}
