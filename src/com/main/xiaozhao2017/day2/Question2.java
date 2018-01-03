package com.main.xiaozhao2017.day2;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 	题目描述
		给定一个英文字符串,请写一段代码找出这个字符串中首先出现三次的那个英文字符。
	输入描述:
		输入数据一个字符串，包括字母,数字等。
	输出描述:
		输出首先出现三次的那个英文字符
	示例1
	输入
		Have you ever gone shopping and
	输出
		e
 * @author Administrator
 *
 */
public class Question2 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		char c=getFirstThreeCharacter(str);
		System.out.println(c);
	}
	
	/**
	 * 获取首次出现三次的英文字符
	 * @param str
	 * @return
	 */
	public static Character getFirstThreeCharacter(String str)
	{
		char[] cstr=str.toCharArray();
		HashMap<Character,Integer> hashMap=new HashMap<>();
		for(int i=0;i<cstr.length;i++)
		{
			if((cstr[i]>='a'&&cstr[i]<='z')|| (cstr[i] >= 'A' && cstr[i] <= 'Z'))
			{
				if(hashMap.containsKey(cstr[i])){
					hashMap.put(cstr[i], hashMap.get(cstr[i])+1);
					if(hashMap.get(cstr[i])==3){
						return cstr[i];
					}
				}else{
					hashMap.put(cstr[i], 1);
				}
			}

		}
		return null;
	}
}
