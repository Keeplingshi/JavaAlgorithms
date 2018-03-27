package com.main.wangyi2018chun;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x1[]=new int[n];
		int y1[]=new int[n];
		int x2[]=new int[n];
		int y2[]=new int[n];
		
		for(int i=0;i<n;i++){
			x1[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			y1[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			x2[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			y2[i]=sc.nextInt();
		}
		
		//倒映在x轴上
		for(int i=0;i<n;i++)
		{
			System.out.println(x1[i]+" "+x2[i]);
		}
	}

}
