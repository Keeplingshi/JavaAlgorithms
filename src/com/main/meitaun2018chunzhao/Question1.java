package com.main.meitaun2018chunzhao;

import java.util.Scanner;

/**
 * 字符串距离
	时间限制：C/C++语言 2000MS；其他语言 4000MS
	内存限制：C/C++语言 65536KB；其他语言 589824KB
	题目描述：
		给出两个相同长度的由字符 a 和 b 构成的字符串，定义它们的距离为对应位置不同的字符的数量。
		如串”aab”与串”aba”的距离为 2；
		串”ba”与串”aa”的距离为 1；
		串”baa”和串”baa”的距离为 0。
		下面给出两个字符串 S 与 T，其中 S 的长度不小于 T 的长度。
		我们用|S|代表 S 的长度，|T|代表 T 的长度，那么在 S 中一共有|S|-|T|+1 个与 T 长度相同的子串，
		现在你需要计算 T 串与这些|S|-|T|+1 个子串的距离的和。
	
	输入
		第一行包含一个字符串 S。
		第二行包含一个字符串 T。
		S 和 T 均由字符 a 和 b 组成，1 ≤ |T| ≤ |S| ≤105 。
	输出
		输出对应的答案。
	
	
	样例输入
		aab
		aba
	
	样例输出
		2
	
	
	样例2
		aaabb
		bab
	样例2 输出
		5
	在样例 2 中，”aaa”与”bab”的距离为 2，”aab”与”bab”的距离为 1，”abb”与”bab”的距离为 2，
	所以最后答案为 5。
 * @author Administrator
 *
 */
public class Question1 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String t=sc.next();
		
		int tlen=t.length();
		
		char[] sarr=s.toCharArray();
		char[] tarr=t.toCharArray();
		int n=s.length()-t.length()+1;
		int result=0;
		
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<i+tlen;j++)
			{
				if(sarr[j]!=tarr[j-i]){
					result++;
				}
			}
		}
		System.out.println(result);
	}

}
