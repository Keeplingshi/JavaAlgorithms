package com.main.xiaozhao2017.day6;

import java.util.Scanner;

/**
 * 	题目描述
		小易去附近的商店买苹果，奸诈的商贩使用了捆绑交易，只提供6个每袋和8个每袋的包装(包装不可拆分)。
		 可是小易现在只想购买恰好n个苹果，小易想购买尽量少的袋数方便携带。如果不能购买恰好n个苹果，小易将不会购买。
	输入描述:
		输入一个整数n，表示小易想购买n(1 ≤ n ≤ 100)个苹果
	输出描述:
		输出一个整数表示最少需要购买的袋数，如果不能买恰好n个苹果则输出-1
	示例1
	输入
		20
	输出
		3
 * @author Administrator
 *
 */
public class Question2 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int result=getNumOfBags(n);
		System.out.println(result);
	}

	private static int getNumOfBags(int n) 
	{
		if(n==6){
			return 1;
		}
		
		int result=-1;
		int count=n/8;
		if(n%8==0){
			return count;
		}
		
		for(int i=count;i>=1;i--)
		{
			int value=n-i*8;
			if(value%6==0){
				result=i+value/6;
				return result;
			}
		}
		
		return result;
	}
	
}
