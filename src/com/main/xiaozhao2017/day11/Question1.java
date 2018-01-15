package com.main.xiaozhao2017.day11;

import java.util.Scanner;

/**
 * 	题目描述
		给你六种面额1、5、10、20、50、100元的纸币，假设每种币值的数量都足够多，编写程序求组成N员（N为0-10000的非负整数）的不同组合的个数。
	输入描述:
		输入为一个数字N，即需要拼凑的面额
	输出描述:
		输出也是一个数字，为组成N的组合个数。
	示例1
	输入
		5
	输出
		2
 * @author Administrator
 *
 */
public class Question1 {

	/*动态规划
	    需要拼凑的面额是n，
	    维护dp[i],表示取到i时的组合数目，dp[0]=1，
	    面额数组a[6]={1,5,10,20,50,100}，
	    dp[j]=dp[j]+dp[j-a[i]],约数条件j>=a[i]。
	    因为面额数目任意，所以需要分别处理只有面额1时，
	    组合钱数为1~n的各自组合数dp[1]~dp[n],
	    然后有面额1,5时，组合钱数为1~n的各自组合数dp[1]~dp[n],
	    依此内推。。。详情见程序。
	*/
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] moneys={1,5,10,20,50,100};
		long[] dp = new long[n+1]; //dp[i]代表拼凑i元的方法数
		dp[0]=1;
		for(int i=0;i<moneys.length;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j>=moneys[i])
				{
					dp[j]+=dp[j-moneys[i]];
				}
			}
		}
		System.out.println(dp[n]);
	}
	
}
