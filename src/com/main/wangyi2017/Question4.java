package com.main.wangyi2017;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 	小易有一个长度为n序列，小易想移除掉里面的重复元素，但是小易想是对于每种元素保留最后出现的那个。小易遇到了困难,希望你来帮助他。 
	输入描述:
		输入包括两行： 第一行为序列长度n(1 ≤ n ≤ 50) 第二行为n个数sequence[i](1 ≤ sequence[i] ≤ 1000)，以空格分隔

	输出描述:
		输出消除重复元素之后的序列，以空格分隔，行末无空格
	
	输入例子1:
		9 
		100 100 100 99 99 99 100 100 100
	
	输出例子1:
		99 100
 * @author Administrator
 *
 */
public class Question4 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sequence[]=new int[n];
		for(int i=0;i<n;i++)
		{
			sequence[i]=sc.nextInt();
		}
		
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=n-1;i>=0;i--)
		{
			if(!list.contains(sequence[i])){
				list.add(sequence[i]);
			}
		}
		for(int i=list.size()-1;i>0;i--)
		{
			System.out.print(list.get(i)+" ");
		}
		System.out.println(list.get(0));
	}
	
}
