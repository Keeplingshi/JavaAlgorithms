package com.exam.wangyi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * 
5
2 7 3 4 9
3
1 25 11
 * @author Administrator
 *
 */
public class Question2 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n+1];
		a[0]=0;
		int sum[]=new int[n+1];
		
		for(int i=1;i<=n;i++){
			a[i]=sc.nextInt();
			sum[i]=sum[i-1]+a[i];
		}
		int m=sc.nextInt();
		int q[]=new int[m];
		for(int i=0;i<m;i++)
		{
			q[i]=sc.nextInt();
		}
		
		
		for(int i=0;i<m;i++)
		{
			
		}
	}

}
