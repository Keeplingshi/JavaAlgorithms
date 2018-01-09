package com.main.xiaozhao2017.day8;

import java.util.Scanner;

/**
 * 	题目描述
		牛牛拿到了一个藏宝图，顺着藏宝图的指示，牛牛发现了一个藏宝盒，藏宝盒上有一个机关，
		机关每次会显示两个字符串 s 和 t，根据古老的传说，牛牛需要每次都回答 t 是否是 s 的子序列。
		注意，子序列不要求在原字符串中是连续的，例如串 abc，它的子序列就有 {空串, a, b, c, ab, ac, bc, abc} 8 种。
	输入描述:
		每个输入包含一个测试用例。每个测试用例包含两行长度不超过 10 的不包含空格的可见 ASCII 字符串。
	输出描述:
		输出一行 “Yes” 或者 “No” 表示结果。
	示例1
	输入
		x.nowcoder.com
		ooo
	输出
		Yes
 * @author Administrator
 *
 */
public class Question2 {

	public static void main(String[] args)
	{
		String s="uti";
		String t="i";
//		Scanner sc=new Scanner(System.in);
//		String s=sc.nextLine();
//		String t=sc.nextLine();
		
		if(func(s, t)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
	
	/**
	 * 判断t是否是s的子串
	 * @param s
	 * @param t
	 * @return
	 */
	public static boolean func(String s,String t)
	{
		if("".equals(t)){
			return true;
		}
		
		char[] sstr=s.toCharArray();
		char[] tstr=t.toCharArray();
		int k=0;
		for(int i=0;i<sstr.length;i++)
		{
			if(sstr[i]==tstr[k]){
				k++;
			}
			if(k==tstr.length){
				return true;
			}
		}
		return false;
	}
	
}
