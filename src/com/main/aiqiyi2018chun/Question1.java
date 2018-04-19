package com.main.aiqiyi2018chun;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 字典序最大子序列
 * @author Administrator
 *
 */
public class Question1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		char[] cstr=str.toCharArray();
		String restr="";
		
		int end=0;
		for(int i=cstr.length-1;i>=0;i--)
		{
			if(cstr[i]>=end)
			{
				restr+=cstr[i];
				end=cstr[i];
			}
		}
		char[] rec=restr.toCharArray();
		for(int i=rec.length-1;i>=0;i--)
		{
			System.out.print(rec[i]);
		}
		System.out.println();

	}

}
