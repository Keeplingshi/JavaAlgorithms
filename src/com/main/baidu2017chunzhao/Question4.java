package com.main.baidu2017chunzhao;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 	度度熊有一个N个数的数组，他想将数组从小到大 排好序，但是萌萌的度度熊只会下面这个操作：
	任取数组中的一个数然后将它放置在数组的最后一个位置。
	问最少操作多少次可以使得数组从小到大有序？ 
	输入描述:
		首先输入一个正整数N，接下来的一行输入N个整数。(N <= 50, 每个数的绝对值小于等于1000)
	
	输出描述:
		输出一个整数表示最少的操作次数。
	
	输入例子1:
		4
		19 7 8 25
	
	输出例子1:
		2
 * @author Administrator
 *
 */
public class Question4 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
//		int arr[]=new int[n];
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			list.add(sc.nextInt());
//			arr[i]=sc.nextInt();
		}
		
		int op=0;	//记录操作次数
		
		int index=n-1;
		while(index>=0)
		{
			int maxindex=0;	//记录最大值的索引
			int maxvalue=list.get(0);		//记录最大值
			
			//为下标index的数组位置确定值
			for(int i=0;i<=index;i++)
			{
				if(list.get(i)>maxvalue){
					maxvalue=list.get(i);
					maxindex=i;
				}
			}
			
			if(maxindex!=index){
				list.add(index+1, list.get(maxindex));
				list.remove(maxindex);
				
				op++;
			}
			index--;
			
		}
		
		System.out.println(op);
	}
	
}
