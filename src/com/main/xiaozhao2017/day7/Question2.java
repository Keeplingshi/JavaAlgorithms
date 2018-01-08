package com.main.xiaozhao2017.day7;

import java.util.Scanner;

/**
 * 	题目描述
		二货小易有一个W*H的网格盒子，网格的行编号为0~H-1，网格的列编号为0~W-1。每个格子至多可以放一块蛋糕，任意两块蛋糕的欧几里得距离不能等于2。
		对于两个格子坐标(x1,y1),(x2,y2)的欧几里得距离为:
		( (x1-x2) * (x1-x2) + (y1-y2) * (y1-y2) ) 的算术平方根
		小易想知道最多可以放多少块蛋糕在网格盒子里。
	输入描述:
		每组数组包含网格长宽W,H，用空格分割.(1 ≤ W、H ≤ 1000)
	输出描述:
		输出一个最多可以放的蛋糕数
	示例1
	输入
		3 2
	输出
		4
 * @author Administrator
 *
 */
public class Question2 {

	public static void main(String[] args)
	{
//		int m=3;
//		int n=3;
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		
		int count=0;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i%4==0||i%4==1){
					if(j%4==0||j%4==1){
						count++;
					}
				}
				if(i%4==2||i%4==3){
					if(j%4==2||j%4==3){
						count++;
					}
				}
				
			}
		}
		System.out.println(count);
	}
	
}
