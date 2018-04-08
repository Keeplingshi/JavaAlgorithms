package com.main.lianjia2018chun;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 	在小红家里面，有n组开关，触摸每个开关，可以使得一组灯泡点亮。
	现在问你，使用这n组开关，最多能够使得多少个灯泡点亮呢？
	第一行一个n，表示有n组开关。
	接下来n行，每行第一个整数为k，表示这个开关控制k个灯泡，接下来k个整数，表示控制的灯泡序号。
	满足:
		1<=n<=1000
		1<=k<=1000
		序号是在int范围内正整数。
	
	输出
		输出最多多少个灯泡点亮。
	
	样例输入
		3
		1 1
		1 2
		2 1 2
	
	样例输出
		2
 * @author Administrator
 *
 */
public class Question1 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		Set<Integer> lights=new HashSet<>();
		for(int i=0;i<n;i++)
		{
			int k=sc.nextInt();
			
			for(int j=0;j<k;j++){
				lights.add(sc.nextInt());
			}
		}
		
		System.out.println(lights.size());
	}
	
}
