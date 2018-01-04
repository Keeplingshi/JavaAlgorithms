package com.main.xiaozhao2017.day3;

import java.util.ArrayList;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{
			String str=sc.nextLine();
			deal(str);
		}
//		String str="ATTMBQECPD";
//		deal(str);
	}
	
	public static void deal(String str)
	{
		if(str==null||str.length()<=5){
			System.out.println(0);
		}
		int len=str.length();	//字符串长度
		str+=str;
		char[] cstr=str.toCharArray();
		for(int i=0;i<len;i++)
		{
			if(cstr[i]<'A'||cstr[i]>'Z')
			{
				return;
			}
		}
		
		ArrayList<Character> list=new ArrayList<>();

		int m=0;
		for(int i=0;i<len;i++)
		{
			if(cstr[i]>='A'&&cstr[i]<='E')
			{
				int k=0;
				boolean flag=false;
				
				list.clear();
				list.add('A');
				list.add('B');
				list.add('C');
				list.add('D');
				list.add('E');
				
				for(int j=i;j<i+len;j++)
				{
					k++;
					//顺序查找直到ABCDE全部找到。
					if(list.contains(cstr[j])){
						list.remove(list.indexOf(cstr[j]));
					}
					if(list.isEmpty()){
						flag=true;
						break;
					}
					
				}
				if(flag){
					m=m>(len-k)?m:(len-k);
				}
			}
		}
		System.out.println(m);
		
	}

}
