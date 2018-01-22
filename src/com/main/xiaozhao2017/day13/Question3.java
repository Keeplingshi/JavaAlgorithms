package com.main.xiaozhao2017.day13;

import java.util.Scanner;

/**
 * 	题目描述
		给定一个十进制数M，以及需要转换的进制数N。将十进制数M转化为N进制数
	输入描述:
		输入为一行，M(32位整数)、N(2 ≤ N ≤ 16)，以空格隔开。
	输出描述:
		为每个测试实例输出转换后的数，每个输出占一行。如果N大于9，则对应的数字规则参考16进制（比如，10用A表示，等等）
	示例1
	输入
		7 2
	输出
		111
 * @author Administrator
 *
 */
public class Question3 {

	public static void main(String[] args)
	{
//		Scanner sc=new Scanner(System.in);
//		int m=sc.nextInt();
//		int n=sc.nextInt();
		int m=-4;
		int n=3;
		
		getJinzhi(m,n);
	}

	private static void getJinzhi(int m, int n) {
		
		boolean flag=true;
		if(m<0){
			m=-m;
			flag=false;
		}
		
		char[] c={'A','B','C','D','E','F'};
		String str="";
		while(m!=0)
		{
			if(m%n>=10){
				str=c[m%n-10]+str;
			}else{
				str=m%n+str;
			}
			
			m/=n;
		}
		if(flag){
			System.out.println(str);
		}else{
			System.out.println("-"+str);
		}
		
		
	}
	
	
	
}
