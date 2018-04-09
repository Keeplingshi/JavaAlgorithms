package com.main.jingdong2018chun;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		for(int i=0;i<t;i++)
		{
			long n=sc.nextLong();
			splitNum(n);
		}
	}

	private static void splitNum(long n) 
	{
		if(n%2==0){
			long m=n;
			while(m%2==0){
				m/=2;
			}
			
			System.out.println(m+" "+(n/m));
		}else{
			System.out.println("No");
		}
		
	}

}
