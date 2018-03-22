package com.main.meituan2017qiuzhao;

import java.util.Scanner;

/**
 * 输入描述:
	输入包括两行,第一行包含一个整数n(1 ≤ n ≤ 10000)
	第二行包括n个整数,表示h数组中的每个值,h_i(1 ≤ h_i ≤ 1,000,000)
	
	
	输出描述:
	输出一个整数,表示最大的矩阵面积。
	
	输入例子1:
	6
	2 1 5 6 2 3
	
	输出例子1:
	10
 * @author Administrator
 *
 */
public class Question3 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int h[]=new int[n];
		for(int i=0;i<n;i++)
		{
			h[i]=sc.nextInt();
		}
		
		int maxArea=h[0];
		
		for(int i=0;i<n;i++)
		{
			//对于第i个数，分别向前向后寻找第一个比它小的数
			int left=i;
			int right=i;
			while(left>0){
				if(h[left-1]>=h[i]){
					left--;
				}else{
					break;
				}
			}
			
			while(right<n-1){
				if(h[right+1]>=h[i]){
					right++;
				}else{
					break;
				}
			}
			right++;
			
			if(h[i]*(right-left)>maxArea){
				maxArea=h[i]*(right-left);
			}
			
		}
		System.out.println(maxArea);
	}
	
}
