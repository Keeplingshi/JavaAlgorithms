package com.exam.wangyi;

import java.util.Scanner;

/**
 * 
6 3
1 3 5 2 5 4
1 1 0 1 0 0
 * @author Administrator
 *
 */
public class Question1 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		int value[]=new int[n];
		int wake[]=new int[n];

		for(int i=0;i<n;i++){
			value[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			wake[i]=sc.nextInt();
		}
		
		int value_front[]=new int[n];
		int sum1=0;
		if(wake[0]==1){
			sum1=value[0];
			value_front[0]=value[0];
		}
		for(int i=1;i<n;i++)
		{
			if(wake[i]==0){
				value_front[i]=sum1;
				continue;
			}
			value_front[i]=sum1+value[i];
			sum1+=value[i];
		}
		
		int value_back[]=new int[n];
		int sum2=0;
		if(wake[n-1]==1){
			sum2=value[n-1];
			value_back[n-1]=value[n-1];
		}
		for(int i=n-2;i>=0;i--)
		{
			if(wake[i]==0){
				value_back[i]=sum2;
				continue;
			}
			value_back[i]=sum2+value[i];
			sum2+=value[i];
		}
		
		int max=0;
		if(wake[0]==1){
			max=value[0];
		}
		
		//滑动窗口
		for(int i=1;i<n;i++)
		{
			//滑动窗口起始位置
			if(wake[i]==1){
				continue;
			}
			int sum=value_front[i];
			for(int j=i;(j<i+k)&&(j<n);j++)
			{
				sum+=value[j];
			}
			if(i+k>=n){
				sum+=value_back[n-1];
			}else{
				sum+=value_back[i+k];
			}
			max=max>sum?max:sum;
		}
		
		System.out.println(max);
	}

}
