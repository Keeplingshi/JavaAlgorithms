package com.main.wangyi2018neitui;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 	小易有一个长度为n的整数序列,a_1,...,a_n。然后考虑在一个空序列b上进行n次以下操作:
	1、将a_i放入b序列的末尾
	2、逆置b序列
	小易需要你计算输出操作n次之后的b序列。 
	
	输入描述:
		输入包括两行,第一行包括一个整数n(2 ≤ n ≤ 2*10^5),即序列的长度。
		第二行包括n个整数a_i(1 ≤ a_i ≤ 10^9),即序列a中的每个整数,以空格分割。

	输出描述:
		在一行中输出操作n次之后的b序列,以空格分割,行末无空格。
	
	输入例子1:
		4
		1 2 3 4
	
	输出例子1:
		4 2 1 3
 * @author Administrator
 *
 */
public class Question4 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
//		1 2 3 4 5 6
//		6 4 2 1 3 5
		
//		1 2 3 4 5
//		5 3 1 2 4
		
		int[] b=new int[n];
		int begin=n/2;
		b[begin]=a[0];
		
		int count=1;
		
		if(n%2==0){
			for(int i=1;i<n;i+=2)
			{
				b[begin-count]=a[i];
				if(begin+count<n){
					b[begin+count]=a[i+1];
				}
				count++;
			}
		}else{
			for(int i=1;i<n;i+=2)
			{
				b[begin+count]=a[i];
				b[begin-count]=a[i+1];
				count++;
			}
		}
		
		for(int i=0;i<n;i++)
		{
			if(i!=n-1){
				System.out.print(b[i]+" ");
			}else{
				System.out.println(b[i]);
			}
			
		}
		
		
	}
	
}
