package com.main.xiaozhao2017.day12;

import java.io.BufferedReader;
import java.util.Scanner;

/**
 * 	题目描述
		假定一种编码的编码范围是a ~ y的25个字母，从1位到4位的编码，如果我们把该编码按字典序排序，形成一个数组如下： 
		a, aa, aaa, aaaa, aaab, aaac, … …, b, ba, baa, baaa, baab, baac … …, yyyw, yyyx, yyyy 
		其中a的Index为0，aa的Index为1，aaa的Index为2，以此类推。
		 编写一个函数，输入是任意一个编码，输出这个编码对应的Index.
	输入描述:
		输入一个待编码的字符串,字符串长度小于等于100.
	输出描述:
		输出这个编码的index
	示例1
	输入
		baca
	输出
		16331
 * @author Administrator
 *
 */
public class Question6 {

	public static void main(String[] args)
	{
//		String str="baca";
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		getIndexOfencode(str);
		
	}

	private static void getIndexOfencode(String str) {
		
		char[] cstr=str.toCharArray();
		
		int s=0;
		for(int i=0;i<cstr.length;i++)
		{
			int w=cstr[i]-'a';
			if(i==0){
				s+=w*(25*25*25+25*25+25+1)+1;
			}
			if(i==1){
				s+=w*(25*25+25+1)+1;
			}
			if(i==2){
				s+=w*(25+1)+1;
			}
			if(i==3){
				s+=w+1;
			}
		}
		System.out.println(s-1);
	}
	
}
