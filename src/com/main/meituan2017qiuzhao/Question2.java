package com.main.meituan2017qiuzhao;

import java.util.Scanner;

/**
 * 	给你六种面额 1、5、10、20、50、100 元的纸币，假设每种币值的数量都足够多，
 * 	编写程序求组成N元（N为0~10000的非负整数）的不同组合的个数。 
	输入描述:
		输入包括一个整数n(1 ≤ n ≤ 10000)
	
	输出描述:
		输出一个整数,表示不同的组合方案数
	
	输入例子1:
		1
	
	输出例子1:
		1
 * @author Administrator
 *
 */
public class Question2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int coins[]={1,5,10,20,50,100};
		long dp[]=new long[10001];
		dp[0]=1;
		
		for(int i=0;i<coins.length;i++)
		{
			for(int j=1;j<=n;j++)
			{
				//使用前(i+1)种钱币的表示面值j的方法数=使用前i种钱币的表示面值j的方法数+使用前(i+1)种钱币表示面值(j-coins[i])的方法数
				if(j>=coins[i]){
					dp[j]+=dp[j-coins[i]];
				}
			}
		}
		System.out.println(dp[n]);
	}
}
