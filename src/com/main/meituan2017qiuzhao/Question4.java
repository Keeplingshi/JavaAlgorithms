package com.main.meituan2017qiuzhao;

import java.util.Scanner;

/**
 * 	给出两个字符串（可能包含空格）,找出其中最长的公共连续子串,输出其长度。 
	输入描述:
		输入为两行字符串（可能包含空格），长度均小于等于50.
	
	输出描述:
		输出为一个整数，表示最长公共连续子串的长度。
	
	输入例子1:
		abcde
		abgde
	
	输出例子1:
		2
 * @author Administrator
 *
 */
public class Question4 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		
		char[] cstr1=null;
		char[] cstr2=null;
		
		if(str1.length()<=str2.length()){
			cstr1=str1.toCharArray();
			cstr2=str2.toCharArray();
		}else{
			cstr1=str2.toCharArray();
			cstr2=str1.toCharArray();
		}
		
		
		
	}
	
}
