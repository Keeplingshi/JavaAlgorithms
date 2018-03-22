package com.main.meitaun2018chunzhao;

import java.util.ArrayList;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args)
	{
		test2();
	}
	
	private static void test2() {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		char cstr[]=s.toCharArray();
		int d[]=new int[10];
		for(int i=0;i<cstr.length;i++){
			d[cstr[i]-'0']++;
		}
		
		//存储数量最少的数中最小的那个数的下标,比如00112333，其中0有2，1有2个，2有1个，3有3个，4-9都是0个，所以minp=4（这里4是4的下标）
		int minp=0;
		for(int i=9;i>0;i--){
			if(d[i]<=d[minp]){
				minp=i;
			}
		}
		
		if(minp==0){
			System.out.print(1);
			for(int i=0;i<=d[minp];i++){
				System.out.print(0);
			}
		}else{
			for(int i=0;i<=d[minp];i++){
				System.out.print(minp);
			}
		}
		
	}

	public static void test1()
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		char cstr[]=s.toCharArray();
		
		ArrayList<Long> numlist=new ArrayList<>();
		for(int i=0;i<cstr.length;i++){
			numlist.add(Long.parseLong(cstr[i]-'0'+""));
		}
		
		long t=1;
		while(true)
		{
			boolean flag=false;
			ArrayList<Long> numlisttmp=new ArrayList<>(numlist);
			long tmp=t;
			while(tmp!=0){
				long a=tmp%10;
				if(numlisttmp.contains(a)){
					numlisttmp.remove(a);
				}else{
					System.out.println(t);
					flag=true;
					break;
				}
				tmp/=10;
			}
			if(flag){
				break;
			}
			t++;
		}
	}
	
}
