package com.main.xiaozhao2017.day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 	题目描述
		读入一个字符串str，输出字符串str中的连续最长的数字串
	输入描述:
		个测试输入包含1个测试用例，一个字符串str，长度不超过255。
	输出描述:
		在一行内输出str中里连续最长的数字串。
	示例1
	输入
		abcd12345ed125ss123456789
	输出
		123456789
 * @author Administrator
 *
 */
public class Question1 {

	public static void main(String[] args) throws IOException
	{
		String str="abcd12345ed125ss123456789";
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		String str=br.readLine();
		
		char[] cstr=str.toCharArray();
		String tmpstr="";
		
		for(int i=0;i<cstr.length;i++)
		{
			if(cstr[i]>='0'&&cstr[i]<='9')
			{
				tmpstr+=cstr[i];
			}else{
				tmpstr+=" ";
			}
		}
		String[] arr=tmpstr.split(" ");
		int maxLen=0;
		String returnstr="";
		for(String s:arr)
		{
			if(maxLen<s.length())
			{
				returnstr=s;
				maxLen=s.length();
			}
		}
		System.out.println(returnstr);
	}
	
}
