package com.main.xiaozhao2017.day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 	题目描述
		牛牛的作业薄上有一个长度为 n 的排列 A，这个排列包含了从1到n的n个数，但是因为一些原因，其中有一些位置（不超过 10 个）看不清了，
		但是牛牛记得这个数列顺序对的数量是 k，顺序对是指满足 i < j 且 A[i] < A[j] 的对数，请帮助牛牛计算出，符合这个要求的合法排列的数目。
	输入描述:
		每个输入包含一个测试用例。每个测试用例的第一行包含两个整数 n 和 k（1 <= n <= 100, 0 <= k <= 1000000000），
		接下来的 1 行，包含 n 个数字表示排列 A，其中等于0的项表示看不清的位置（不超过 10 个）。
	输出描述:
		输出一行表示合法的排列数目。
	示例1
	输入
		5 5
		4 0 0 2 0
	输出
		2
 * @author Administrator
 *
 */
public class Question4 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] array=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
//		int n=5;
//		int k=5;
//		int[] array={4,0,0,2,0};
		
		System.out.println(getNumOfArr(array,n,k));
	}

	/**
	 * 计算合法的排列数目
	 * @param array
	 * @param k
	 * @return
	 */
	private static int getNumOfArr(int[] array,int n, int k) 
	{
		//数列中不存在的数字
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=1;i<=n;i++)
		{
			boolean flag=false;
			for(int j=0;j<array.length;j++)
			{
				if(array[j]==i){
					flag=true;
				}
			}
			if(!flag){
				list.add(i);
			}
		}
		
		int count=0;
		//求所有排列
		List<ArrayList<Integer>> perm=new ArrayList<>();
		calperm(perm,list,0);
		
		for (ArrayList<Integer> tmp : perm)
		{
			//存储可能的排列
			ArrayList<Integer> arrayList=new ArrayList<>();
			int index=0;
			for(int i=0;i<array.length;i++)
			{
				if(array[i]==0){
					arrayList.add(tmp.get(index++));
				}else{
					arrayList.add(array[i]);
				}
			}
			if(satisifyOrderPair(arrayList,k)){
				count++;
			}
		}
		
		return count;
	}

	/**
	 * 满足顺序对
	 * @param arrayList
	 * @param k
	 * @return
	 */
	private static boolean satisifyOrderPair(ArrayList<Integer> arrayList,int k) 
	{
		int count=0;
		for(int i=0;i<arrayList.size()-1;i++)
		{
			for(int j=i+1;j<arrayList.size();j++)
			{
				if(i<j&&arrayList.get(i)<arrayList.get(j))
				{
					count++;
				}
			}
		}
		
		return k==count;
	}

	/**
	 * 求出所有排列
	 * @param perm
	 * @param list
	 * @param begin
	 */
	private static void calperm(List<ArrayList<Integer>> perm, ArrayList<Integer> list, int begin) 
	{
		if(begin==list.size()){
			perm.add(new ArrayList<>(list));
		}else{
			for(int i=begin;i<list.size();i++)
			{
                Collections.swap(list, i, begin);
                calperm(perm, list, begin+1);
                Collections.swap(list, i, begin);
			}
		}
	}
	
}
