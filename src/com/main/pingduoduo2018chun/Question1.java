package com.main.pingduoduo2018chun;

import java.util.Scanner;

/**
 * 气温采样
 * @author Administrator
 *
 */
public class Question1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		int low[]=new int[n];
		int high[]=new int[n];
		
		int Tmin=-51;
		int Tmax=51;
		for(int i=0;i<n;i++)
		{
			low[i]=sc.nextInt();
			high[i]=sc.nextInt();
		}
		
		for(int t=-50;t<=50;t++)
		{
			int num=getTNum(t,low,high);
			if(num>=k){
				Tmin=t;
				break;
			}
		}
		
		for(int t=50;t>=-50;t--)
		{
			int num=getTNum(t,low,high);
			if(num>=k){
				Tmax=t;
				break;
			}
		}
		
		if(Tmin==-51||Tmax==51){
			System.out.println("error");
		}else{
			System.out.println(Tmin+" "+Tmax);
		}
	}

	
	private static int getTNum(int t, int[] low, int[] high) 
	{
		int num=0;
		int n=low.length;
		for(int i=0;i<n;i++)
		{
			if(t>=low[i]&&t<=high[i]){
				num++;
			}
		}
		
		return num;
	}

}
