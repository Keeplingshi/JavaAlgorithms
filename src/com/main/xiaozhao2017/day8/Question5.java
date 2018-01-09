package com.main.xiaozhao2017.day8;

import java.util.Scanner;

/**
 * 	题目描述
		数列的第一项为n，以后各项为前一项的平方根，求数列的前m项的和。
	输入描述:
		输入数据有多组，每组占一行，由两个整数n（n < 10000）和m(m < 1000)组成，n和m的含义如前所述。
	输出描述:
		对于每组输入数据，输出该数列的和，每个测试实例占一行，要求精度保留2位小数。
	示例1
	输入
		81 4
		2 2
	输出
		94.73
		3.41
 * @author Administrator
 *
 */
public class Question5 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{
			int n=sc.nextInt();
			int m=sc.nextInt();
			getSum(n, m);
		}
		
//		int n=81;
//		int m=4;
//		getSum(n,m);

	}
	
	public static void getSum(int n,int m)
	{
		double k=n;
		double s=0.0;
		for(int i=0;i<m;i++)
		{
			s+=k;
			k=Math.sqrt(k);
		}
		System.out.printf("%.2f\n",s);
	}
	
}
