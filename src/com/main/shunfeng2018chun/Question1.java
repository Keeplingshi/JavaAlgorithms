package com.main.shunfeng2018chun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 	澡堂一排有n个洗澡间，从左到右从1到n编号。第x号和第y号之间的距离为|x-y|。
	小明是一个浴室歌手，他去洗澡的时候发现有m个洗澡间已经有人在使用了，这m个洗澡间分别是a1,a2,...,am。
	小明想在剩下的n-m个洗澡间中选择一个去洗澡，为了使得大家都能听到他的歌声，他会选择一个洗澡间，使得所有人到小明的平均距离最小。如果有多个洗澡间都能最小化平均距离，小明会选择编号最小的那一个。
	
	
	输入
		第一行输入两个数n,m。（1≤m≤n≤100000）
		第二行m个数a1,a2,...,am(1≤ai≤n)，输入保证这m个数互不相同。
	
	输出
	输出一个数，小明选择的洗澡间。
	
	样例输入
		5 2
		3 4
	
	样例输出
		2
		
	测试用例2：
		10 4
		3 4 10 9
		
		5
 * @author Administrator
 *
 */
public class Question1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		if(n==m){
			System.out.println(0);
			return;
		}
		
		int count=0;
		ArrayList<Integer> list=new ArrayList<>();
		int a[]=new int[m+1];
		for(int i=1;i<=m;i++)
		{
			a[i]=sc.nextInt();
			count+=a[i];
			list.add(a[i]);
		}
		
		Arrays.sort(a,1,m);
		
		int res=a[m];
		int ans=count;
		for(int i=res;(i>=a[1]-1)&&i>=1;i--)
		{
			if(!list.contains(i))
			{
				int temp=calDistance(a,i);
				if(temp<ans)
				{
					res=i;
					ans=temp;
				}
			}
		}
		System.out.println(res);
	}

	private static int calDistance(int[] array, int index) 
	{
		int count=0;
		for(int i=0;i<array.length;i++)
		{
			count+=Math.abs(array[i]-index);
		}
		
		return count;
	}

}
