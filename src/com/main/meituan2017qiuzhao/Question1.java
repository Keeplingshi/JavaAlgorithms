package com.main.meituan2017qiuzhao;

import java.util.Scanner;

/**
 * 	大富翁游戏，玩家根据骰子的点数决定走的步数，即骰子点数为1时可以走一步，点数为2时可以走两步，点数为n时可以走n步。
 * 	求玩家走到第n步（n<=骰子最大点数且是方法的唯一入参）时，总共有多少种投骰子的方法。 
	输入描述:
		输入包括一个整数n,(1 ≤ n ≤ 6)
	
	输出描述:
		输出一个整数,表示投骰子的方法
	
	输入例子1:
		6
	
	输出例子1:
		32
 * @author Administrator
 *
 */
public class Question1 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println(getResult(n));
	}

	private static int getResult(int n) {
		
		int result=1;
		
		for(int i=1;i<n;i++){
			result*=2;
		}
		return result;
	}
	
}
