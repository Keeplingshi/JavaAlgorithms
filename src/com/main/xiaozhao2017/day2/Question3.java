package com.main.xiaozhao2017.day2;

import java.util.Scanner;

/**
 * 	题目描述
		给定一个十进制的正整数number，选择从里面去掉一部分数字，希望保留下来的数字组成的正整数最大。
	输入描述:
		输入为两行内容，第一行是正整数number，1 ≤ length(number) ≤ 1000。第二行是希望去掉的数字数量cnt 1 ≤ cnt < length(number)。
	输出描述:
		输出保留下来的结果。
	示例1
	输入
		325
		1
	输出
		35
 * @author Administrator
 *
 */
public class Question3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String number=sc.next();
		int cnt=sc.nextInt();
		getMaxAfterCut(number, cnt);
//		System.out.println(result);
	}
	
	/**
	 * 
	 * @param number
	 * @param cnt
	 * @return
	 */
	public static void getMaxAfterCut(String number,int cnt)
	{
		char[] numArr=number.toCharArray();
		int[] resultArr=new int[numArr.length-cnt];
		
		int begin=0;
		int end=cnt;
		
		for(int i=0;i<resultArr.length;i++)
		{
			end++;
			int max=Integer.MIN_VALUE;
			for(int j=begin;j<end;j++)
			{
				if(numArr[j]-48>max)
				{
					max=numArr[j]-48;
					begin=j+1;
				}
				//max=max>numArr[j]-48?max:numArr[j]-48;
			}
			resultArr[i]=max;
			System.out.print(max);
		}
		
	}
	
}
