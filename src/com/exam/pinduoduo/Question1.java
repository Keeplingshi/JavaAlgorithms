package com.exam.pinduoduo;

import java.util.Scanner;

/**
 * 
 * 
 * abcdefghijklmnop
 * 
abcde
p   f
o   g
n   h
mlkji
 * @author Administrator
 *
 */
public class Question1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		char[] cstr=str.toCharArray();
		
		int k=cstr.length/4;
		
		for(int i=0;i<k;i++){
			System.out.print(cstr[i]);
		}
		System.out.println(cstr[k]);
		
		String space_str="";
		for(int i=0;i<=k-2;i++){
			space_str+=" ";
		}
		
		int m=cstr.length-1;
		int n=k+1;
		for(int i=1;i<k;i++)
		{
			//输2(k-1)个空格
			System.out.print(cstr[m]);
			System.out.print(space_str);
			System.out.println(cstr[n]);
			m--;
			n++;
		}
		
		for(int i=3*k;i>2*k;i--){
			System.out.print(cstr[i]);
		}
		System.out.println(cstr[2*k]);
	}

}
