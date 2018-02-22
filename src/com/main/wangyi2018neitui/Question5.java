package com.main.wangyi2018neitui;

import java.util.Scanner;

/**
 * 	小易为了向他的父母表现他已经长大独立了,他决定搬出去自己居住一段时间。
 *  一个人生活增加了许多花费: 小易每天必须吃一个水果并且需要每天支付x元的房屋租金。
 *  当前小易手中已经有f个水果和d元钱,小易也能去商店购买一些水果,商店每个水果售卖p元。
 *  小易为了表现他独立生活的能力,希望能独立生活的时间越长越好,小易希望你来帮他计算一下他最多能独立生活多少天。 
	
	输入描述:
		输入包括一行,四个整数x, f, d, p(1 ≤ x,f,d,p ≤ 2 * 10^9),以空格分割
	
	输出描述:
		输出一个整数, 表示小易最多能独立生活多少天。
	
	输入例子1:
		3 5 100 10
		2 17 20 1
		1 1996245611 1999990159 123
	
	输出例子1:
		11
		10
		1996275808
 * @author Administrator
 *
 */
public class Question5 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		long x=sc.nextInt();
		long f=sc.nextInt();
		long d=sc.nextInt();
		long p=sc.nextInt();
		
		//设生活y天
		//总花费<=d
		//x*y+(y-f)*p<=d，求解y最大值
		
		long sum=d+f*p;
		long everyday=x+p;
		long y1=sum/everyday;
		
		long y2=d/x;			//水果足够，租金将所有钱用完
		long y=y1<y2?y1:y2;
		
		System.out.println(y);
	}
	
}
