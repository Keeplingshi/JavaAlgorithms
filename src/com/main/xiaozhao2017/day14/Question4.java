package com.main.xiaozhao2017.day14;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 	题目描述
		请设计一个算法能够完成两个用字符串存储的整数进行相加操作，对非法的输入则返回error
	输入描述:
		输入为一行，包含两个字符串，字符串的长度在[1,100]。
	输出描述:
		输出为一行。合法情况输出相加结果，非法情况输出error
	示例1
	输入
		123 123
		abd 123
	输出
		246
		Error
 * @author Administrator
 *
 */
public class Question4 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{
			String num1=sc.next();
			String num2=sc.next();
			if(isNumber(num1)&&isNumber(num2))
			{
				BigDecimal bigDecimal1=new BigDecimal(num1);
				BigDecimal bigDecimal2=new BigDecimal(num2);
				System.out.println(bigDecimal1.add(bigDecimal2));
			}else{
				System.out.println("Error");
			}
		}
		
	}

	private static boolean isNumber(String str) {
		char[] cstr=str.toCharArray();
		for(Character c:cstr){
			if(c<'0'||c>'9'){
				return false;
			}
		}
		return true;
	}
	
}
