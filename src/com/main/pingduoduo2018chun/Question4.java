package com.main.pingduoduo2018chun;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 滑动窗口
 * 
 * @author Administrator
 *
 */
public class Question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		int array[] = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		ArrayList<Integer> list = resultInWindows(array, k);

		for (int i = 0; i < list.size(); i++) {
			if (i != list.size() - 1) {
				System.out.print(list.get(i) + " ");
			} else {
				System.out.println(list.get(i));
			}

		}
	}

	public static ArrayList<Integer> resultInWindows(int[] num, int size) {
		ArrayList<Integer> res = new ArrayList<>();
		if (size == 0){
			return res;
		}
			
		int begin;
		ArrayDeque<Integer> q = new ArrayDeque<>();
		for (int i = 0; i < num.length; i++) 
		{
			begin = i - size + 1;
			if (q.isEmpty()){
				q.add(i);
			}else if (begin > q.peekFirst()){
				q.pollFirst();
			}
			while ((!q.isEmpty()) && num[q.peekLast()] <= num[i])
			{
				q.pollLast();
			}
				
			q.add(i);
			if (begin >= 0)
			{
				res.add(num[q.peekFirst()]);
			}
				
		}
		return res;
	}

	// public static ArrayList<Integer> maxInWindows(int []num, int size)
	// {
	// ArrayList<Integer> list=new ArrayList<>();
	// if(size==0||size>num.length){
	// return list;
	// }else{
	// int begin=0; //当前第几个窗口
	// while(begin+size<=num.length)
	// {
	// list.add(getMaxMinFromArray(num,begin,begin+size));
	// begin++;
	// }
	// }
	//
	// return list;
	// }
	//
	// public static int getMaxMinFromArray(int[] array,int begin,int end)
	// {
	// int max=array[begin];
	// int min=array[begin];
	// for(int i=begin;i<end;i++)
	// {
	// max=max>array[i]?max:array[i];
	// min=min<array[i]?min:array[i];
	// }
	// return max-min;
	//
	//// ArrayList<Integer> tmp=new ArrayList<>();
	//// for(int i=begin;i<end;i++)
	//// {
	//// tmp.add(array[i]);
	//// }
	//// Collections.sort(tmp);
	////
	////// int max=array[begin];
	////// int min=array[begin];
	////// for(int i=begin;i<end;i++)
	////// {
	////// max=max>array[i]?max:array[i];
	////// min=min<array[i]?min:array[i];
	////// }
	//// return tmp.get(tmp.size()-1)-tmp.get(0);
	// }
}
