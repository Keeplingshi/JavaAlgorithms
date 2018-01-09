package com.main.xiaozhao2017.day8;

import java.util.Scanner;

/**
 * 	题目描述
		输入两个字符串，从第一字符串中删除第二个字符串中所有的字符。
		例如，输入”They are students.”和”aeiou”，则删除之后的第一个字符串变成”Thy r stdnts.”
	输入描述:
		每个测试输入包含2个字符串
	输出描述:
		输出删除后的字符串
	示例1
	输入
		They are students. aeiou
	输出
		Thy r stdnts.
 * @author Administrator
 *
 */
public class Question3 {

	public static void main(String[] args)
	{
//		String str="They are students.";
//		String dstr="aeiou";
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String dstr=sc.nextLine();
		
		System.out.println(deleteStr(str, dstr));
		
	}
	
	public static String deleteStr(String oldStr,String deleteStr)
	{
		char[] coldstr=oldStr.toCharArray();
		String returnstr="";
		
		for(int i=0;i<coldstr.length;i++)
		{
			if(deleteStr.indexOf(String.valueOf(coldstr[i]))==-1)
			{
				returnstr+=String.valueOf(coldstr[i]);
			}
		}
		return returnstr;
	}
	
}
