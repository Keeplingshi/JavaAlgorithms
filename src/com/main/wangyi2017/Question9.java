package com.main.wangyi2017;

import java.util.Scanner;

/**
 * 	小易有一块n*n的棋盘，棋盘的每一个格子都为黑色或者白色，小易现在要用他喜欢的红色去涂画棋盘。小易会找出棋盘中某一列中拥有相同颜色的最大的区域去涂画，帮助小易算算他会涂画多少个棋格。 
	输入描述:
		输入数据包括n+1行：
		 第一行为一个整数n(1 ≤ n ≤ 50),即棋盘的大小
		 接下来的n行每行一个字符串表示第i行棋盘的颜色，'W'表示白色，'B'表示黑色
		
		
	输出描述:
		输出小易会涂画的区域大小
	
	输入例子1:
		3 
		BWW 
		BBB 
		BWB
	
		8
		BBWWBBWW
		BBWWBBWW
		WWBBWWBB
		WWBBWWBB
		BBWWBBWW
		BBWWBBWW
		WWBBWWBB
		WWBBWWBB
	
	输出例子1:
		3
		2

 * @author Administrator
 *
 */
public class Question9 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char[][] cheers=new char[n][n];
		
		for(int i=0;i<n;i++)
		{
			String str=sc.next();
			cheers[i]=str.toCharArray();
		}
		
		int result=0;
		for(int i=0;i<n;i++)
		{
			int count=1;
			char tmp=cheers[0][i];
			for(int j=1;j<n;j++)
			{
				if(cheers[j][i]==tmp)
				{
					count++;
				}else{
					result=result>count?result:count;
					count=1;
					tmp=cheers[j][i];
				}
			}
			result=result>count?result:count;
		}
		
		System.out.println(result);
	}
	
}
