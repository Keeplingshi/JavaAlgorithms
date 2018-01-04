package com.main.xiaozhao2017.day3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 	题目描述
		给定一个正整数，编写程序计算有多少对质数的和等于输入的这个正整数，并输出结果。输入值小于1000。
		如，输入为10, 程序应该输出结果为2。（共有两对质数的和为10,分别为(5,5),(3,7)）
	输入描述:
		输入包括一个整数n,(3 ≤ n < 1000)
	输出描述:
		输出对数
	示例1
	输入
		10
	输出
		2		
 * @author Administrator
 *
 */
public class Question3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> primeList=new ArrayList<>();
		for(int i=2;i<1000;i++)
		{
			if(isPrime(i)){
				primeList.add(i);
			}
		}
		
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int k=0;
		for(Integer n:primeList)
		{
			if(m<n){
				break;
			}
			if(primeList.contains(m-n)&&(m-n>=n)){
				k++;
			}
		}
		System.out.println(k);
	}
	
	/**
	 * 判断m是否为质数
	 * @param m
	 * @return
	 */
	private static boolean isPrime(int m) {
		for(int i=2;i<m/2+1;i++)
		{
			if(m%i==0){
				return false;
			}
		}
		return true;
	}
}
