package com.main.wangyiqiuzhao2017;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 	小易来到了一条石板路前，每块石板上从1挨着编号为：1、2、3.......
	这条石板路要根据特殊的规则才能前进：对于小易当前所在的编号为K的 石板，小易单次只能往前跳K的一个约数(不含1和K)步，
	即跳到K+X(X为K的一个非1和本身的约数)的位置。 小易当前处在编号为N的石板，他想跳到编号恰好为M的石板去，小易想知道最少需要跳跃几次可以到达。
	例如：
		N = 4，M = 24：
		4->6->8->12->18->24
		于是小易最少需要跳跃5次，就可以从4号石板跳到24号石板 
	输入描述:
		输入为一行，有两个整数N，M，以空格隔开。 (4 ≤ N ≤ 100000) (N ≤ M ≤ 100000)
	
	输出描述:
		输出小易最少需要跳跃的步数,如果不能到达输出-1
	
	输入例子1:
		4 24
	
	输出例子1:
		5
 * @author Administrator
 *
 */
public class Question3 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		System.out.println(solve(n,m));
		
	}

	private static int solve(int n, int m) 
	{
        if (m == n) {
            return 0;
        }
        int steps = m - n + 1;// 算上了起点和终点
        int[] dp = new int[steps];// 规划的量：到达 每个位置需要的最小步数
        
        dp[0] = 0; // 起点
        
        for (int i = 1; i < steps; i++) {
            dp[i] =  Integer.MAX_VALUE; // 初始化 表示后续位置都不能到达
        }
        
        for (int i = 0; i < steps; i++)
        {
        	if(dp[i]== Integer.MAX_VALUE){
        		dp[i]=0;
        		continue;
        	}
        	
        	ArrayList<Integer> list = getYueShu(i + n); // i+n才是石板号
        	
            for (int j = 0; j < list.size(); j++) {
                int x = list.get(j);
                if (i + n + x <= m) {
                    dp[i + x] = Math.min(dp[i + x], dp[i] + 1);
                }
            }
        }
        
        if (dp[steps - 1] == 0) {
            return -1;
        } else {
            return dp[steps - 1];
        }
	}
	
	/**
	 * 返回约数列表
	 * @param n
	 * @return
	 */
	private static ArrayList<Integer> getYueShu(int n)
	{
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				list.add(i);
			}
		}
		
		return list;
	}
	
}
