package com.main.wangyiqiuzhao2017;

import java.util.Scanner;

/**
 * 小易去附近的商店买苹果，奸诈的商贩使用了捆绑交易，只提供6个每袋和8个每袋的包装(包装不可拆分)。 可是小易现在只想购买恰好n个苹果，小易想购买尽量少的袋数方便携带。如果不能购买恰好n个苹果，小易将不会购买。 
	输入描述:
	输入一个整数n，表示小易想购买n(1 ≤ n ≤ 100)个苹果
	
	
	输出描述:
	输出一个整数表示最少需要购买的袋数，如果不能买恰好n个苹果则输出-1
	
	输入例子1:
	20
	
	输出例子1:
	3
 * @author Administrator
 *
 */
public class Question7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int x=n/6+1;
		int y=n/8+1;
		
		int min=100;
		for(int i=0;i<=x;i++)
		{
			for(int j=0;j<=y;j++)
			{
				if(i*6+j*8==n)
				{
					min=min>(i+j)?(i+j):min;
				}
			}
		}
		
		if(min==100){
			min=-1;
		}
		
		System.out.println(min);
	}

}
