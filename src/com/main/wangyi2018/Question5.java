package com.main.wangyi2018;

import java.util.Scanner;

/**
 * 	小易有一个长度为N的正整数数列A = {A[1], A[2], A[3]..., A[N]}。
	牛博士给小易出了一个难题:
	对数列A进行重新排列,使数列A满足所有的A[i] * A[i + 1](1 ≤ i ≤ N - 1)都是4的倍数。
	小易现在需要判断一个数列是否可以重排之后满足牛博士的要求。 
	
	输入描述:
		输入的第一行为数列的个数t(1 ≤ t ≤ 10),
		接下来每两行描述一个数列A,第一行为数列长度n(1 ≤ n ≤ 10^5)
		第二行为n个正整数A[i](1 ≤ A[i] ≤ 10^9)

	输出描述:
		对于每个数列输出一行表示是否可以满足牛博士要求,如果可以输出Yes,否则输出No。
	
	输入例子1:
		2
		3
		1 10 100
		4
		1 2 3 4
	
	输出例子1:
		Yes
		No
 * @author Administrator
 *
 */
public class Question5 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int j=0;j<n;j++)
			{
				a[j]=sc.nextInt();
			}
			
			getResult(a);
		}
//		int[] arr={1,10,100};
//		getResult(arr);
	}

	private static void getResult(int[] arr) 
	{
		int numa=0;		//%2!=0
		int numb=0;		//%4==0
		int numc=0;		//%2==0
		
		for (int i : arr) {
			if(i%4==0){
				numb++;
			}else if(i%2==0){
				numc++;
			}else{
				numa++;
			}
		}
		
		if(numc>=1&&numa<=numb){
			System.out.println("Yes");
		}else if(numc==0&&numa<=numb+1){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
	}
	
}
