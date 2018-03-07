package com.main;

import java.util.Scanner;

import javax.swing.text.AbstractDocument.LeafElement;

/**
 * 0-1背包问题
 * 
 * 现有n件物品和一个容量为c的背包。第i件物品的重量是重量为w[i]，价值是v[i]。
 * 已知对于一件物品必须选择取（用1表示）或者不取（用0表示），且每件物品只能被取一次（这就是“0-1”的含义）。
 * 求放置哪些物品进背包，可使这些物品的重量总和不超过背包容量，且价值总和最大。
 * 
 * 假设有5件物品，其重量分别是w={2，2，6，5，4}，价值分别是v={6，3，5，4，6}，背包容量为10。
 * 
 * @author Administrator
 *
 */
public class Test {

	/**
	 * 	一种双核CPU的两个核能够同时的处理任务，现在有n个已知数据量的任务需要交给CPU处理，
	 * 	假设已知CPU的每个核1秒可以处理1kb，每个核同时只能处理一项任务。
	 * 	n个任务可以按照任意顺序放入CPU进行处理，现在需要设计一个方案让CPU处理完这批任务所需的时间最少，求这个最小的时间。 
		输入描述:
			输入包括两行： 第一行为整数n(1 ≤ n ≤ 50) 第二行为n个整数length[i](1024 ≤ length[i] ≤ 4194304)，表示每个任务的长度为length[i]kb，每个数均为1024的倍数。
		
		输出描述:
			输出一个整数，表示最少需要处理的时间
		
		输入例子1:
			5 
			3072 3072 7168 3072 1024
		
		输出例子1:
			9216
			
			
		分析：0-1背包问题
		背包容量是SUM/2. 每个物体的体积是数的大小，然后尽可能的装满背包。 
		dp方程：f[i][V] = max(f[i-1][V-v[i]]+v[i], f[i-1][V] ) 
		
		f[i][j]=Math.max(f[i-1][j], f[i-1][j-w[i]]+v[i]);
	 * @author Administrator
	 *
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int w[]=new int[n];		//物品重量
		
		int sum=0;
		for(int i=0;i<n;i++)
		{
			w[i]=sc.nextInt()/1024;
			sum+=w[i];
		}
		
		int c=sum/2;
		
		//要使用一维数组，背包容量要采用倒序，即w--->1, 只有这样对于方程dp( j ) = Max( dp( j ), dp (j-w[i] ) + v[i] )
		//dp( j ) = Max( dp( j ), dp (j-w[i] ) + v[i] )
		int dp[]=new int[c+1];
		for(int i=1;i<n;i++)
		{
			for(int j=c;j>=w[i];j--)
			{
				dp[j]=Math.max(dp[j], dp[j-w[i]]+w[i]);
			}
		}
		
		System.out.println((sum-dp[c])*1024);
		
	}

}
