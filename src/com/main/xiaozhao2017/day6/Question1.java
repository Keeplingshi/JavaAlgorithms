package com.main.xiaozhao2017.day6;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 	题目描述
		小易喜欢的单词具有以下特性：
		1.单词每个字母都是大写字母
		2.单词没有连续相等的字母
		3.单词没有形如“xyxy”(这里的x，y指的都是字母，并且可以相同)这样的子序列，子序列可能不连续。
	例如：
		小易不喜欢"ABBA"，因为这里有两个连续的'B'
		小易不喜欢"THETXH"，因为这里包含子序列"THTH"
		小易不喜欢"ABACADA"，因为这里包含子序列"AAAA"
		小易喜欢"A","ABA"和"ABCBA"这些单词
		给你一个单词，你要回答小易是否会喜欢这个单词。
	输入描述:
		输入为一个字符串，都由大写字母组成，长度小于100
	输出描述:
		如果小易喜欢输出"Likes",不喜欢输出"Dislikes"
	示例1
	输入
		AAA
	输出
		Dislikes
 * @author Administrator
 *
 */
public class Question1 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		boolean flag=islike(str);
		if(flag){
			System.out.println("Likes");
		}else{
			System.out.println("Dislikes");
		}
	}
	
	/**
	 * 判断是否喜欢这个字符串
	 * @param str
	 * @return
	 */
	public static boolean islike(String str)
	{
		char[] cstr=str.toCharArray();
		
		Map<Character,Alpha> map = new LinkedHashMap<Character,Alpha>();
		
		for(int i=0;i<cstr.length;i++)
		{
			//判断每个字母都是大写字母
			if(cstr[i]<'A'||cstr[i]>'Z'){
				return false;
			}
			
			//判断是否存在两个连续相等的字母
			if(i<cstr.length-1){
				if(cstr[i]==cstr[i+1]){
					return false;
				}
			}
			
			//判断该字符串前面是否包含两个其他相同字符
			if(map.get(cstr[i])==null){
				map.put(cstr[i], new Alpha(1, i));
			}else{
				map.put(cstr[i], new Alpha(map.get(cstr[i]).count+1, map.get(cstr[i]).endPoint));
			}
			
			if(map.get(cstr[i]).count>3){
				return false;
			}else if(map.get(cstr[i]).count==2){
			
				for(Iterator<Character> it=map.keySet().iterator();it.hasNext();)
				{
					Character key=(Character)it.next();
					if(key==cstr[i]){
						break;
					}
					if(map.get(key).count==2&&map.get(key).endPoint>map.get(cstr[i]).endPoint){
						return false;
					}
				}
			}
			
			map.put(cstr[i], new Alpha(map.get(cstr[i]).count, i));
			
		}
		
		return true;
	}
	
	public static class Alpha
	{
		public int count;
		public int endPoint;
		
		public Alpha(int count, int endPoint) {
			this.count = count;
			this.endPoint = endPoint;
		}
	}
	
}
