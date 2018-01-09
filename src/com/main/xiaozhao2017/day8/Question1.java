package com.main.xiaozhao2017.day8;

import java.util.Scanner;

/**
 * 	题目描述
		Please create a function to extract the filename extension from the given path,return the extracted filename extension or null if none.
	输入描述:
		输入数据为一个文件路径
	输出描述:
		对于每个测试实例，要求输出对应的filename extension
	示例1
	输入
		Abc/file.txt
	输出
		txt
 * @author Administrator
 *
 */
public class Question1 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
//		String str="Abc/file.txt";
		System.out.println(getFileExtension(str));
	}
	
	public static String getFileExtension(String path)
	{
		if(path==null||"".equals(path)){
			return null;
		}
		char[] cstr=path.toCharArray();
		for(int i=cstr.length-1;i>=0;i--)
		{
			if(cstr[i]=='.'){
				return path.substring(i+1);
			}
		}
		
		return null;
	}
	
}
