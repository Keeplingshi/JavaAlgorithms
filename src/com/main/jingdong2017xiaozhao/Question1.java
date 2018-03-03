package com.main.jingdong2017xiaozhao;

import java.util.Scanner;

/**
 * 	战争游戏的至关重要环节就要到来了，这次的结果将决定王国的生死存亡，小B负责首都的防卫工作。
 *  首都位于一个四面环山的盆地中，周围的n个小山构成一个环，作为预警措施，小B计划在每个小山上设置一个观察哨，日夜不停的瞭望周围发生的情况。 
 *  一旦发生外地入侵事件，山顶上的岗哨将点燃烽烟，若两个岗哨所在的山峰之间没有更高的山峰遮挡且两者之间有相连通路，则岗哨可以观察到另一个山峰上的烽烟是否点燃。
 *  由于小山处于环上，任意两个小山之间存在两个不同的连接通路。满足上述不遮挡的条件下，一座山峰上岗哨点燃的烽烟至少可以通过一条通路被另一端观察到。
 *  对于任意相邻的岗哨，一端的岗哨一定可以发现一端点燃的烽烟。 小B设计的这种保卫方案的一个重要特性是能够观测到对方烽烟的岗哨对的数量，她希望你能够帮她解决这个问题。 
	输入描述:
		输入中有多组测试数据，每一组测试数据的第一行为一个整数n(3<=n<=10^6),为首都周围的小山数量，第二行为n个整数，依次表示为小山的高度h（1<=h<=10^9）.
	
	输出描述:
		对每组测试数据，在单独的一行中输出能相互观察到的岗哨的对数。
	
	输入例子1:
		5
		1 2 4 5 3
	
	输出例子1:
		7
 * @author Administrator
 *
 */
public class Question1 {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int array[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		
		int result=n;
		for(int i=0;i<n;i++)
		{
			if(isMinOfLeftAndRight(array,i))
			{
				result+=getSumOfIndex(array,i);
			}
		}
		System.out.println(result);
		
	}


	/**
	 * 以index为核心，判断与array[index-1]的有几对
	 * @param array
	 * @param index
	 * @return
	 */
	private static int getSumOfIndex(int[] array, int index) 
	{
//		int len=array.length;
//		int leftIndex=(index+len-1)%len;
//		int rightIndex=(index+len+1)%len;
//		
//		int s=1;
//		
//		if((rightIndex+len+1)%len==leftIndex){
//			return 0;
//		}
//		
//		if(array[(leftIndex+len-1)%len]==array[leftIndex]){
//			leftIndex=(leftIndex+len-1)%len;
//		}
//		if(array[(rightIndex+len+1)%len]==array[rightIndex]){
//			rightIndex=(rightIndex+len+1)%len;
//		}
//		
//		if((rightIndex+len+1)%len==leftIndex){
//			return 0;
//		}
//		
//		int left=array[leftIndex];
//		int right=array[rightIndex];
		
//		int s=1;
//		if(left>right)
//		{
//			//rightIndex向右扩展
//			while(left>right)
//			{
//				if((rightIndex+len+1)%len==leftIndex){
//					return s;
//				}
//				rightIndex=(rightIndex+len+1)%len;
//				right=array[rightIndex];
//				s++;
//			}
//		}else if(left<right)
//		{
//			//rightIndex向右扩展
//			while(right>left)
//			{
//				if((leftIndex+len-1)%len==rightIndex){
//					return s;
//				}
//				leftIndex=(leftIndex+len-1)%len;
//				left=array[leftIndex];
//				s++;
//			}
//		}else{
//			
//		}
		
		return 0;
	}

	/**
	 * 判断是否满足同时小于左右元素
	 * @param array
	 * @param i
	 * @return
	 */
	private static boolean isMinOfLeftAndRight(int[] array, int index) 
	{
		int len=array.length;
		int leftIndex=(index+len-1)%len;
		int rightIndex=(index+len+1)%len;
		if(array[index]<=array[leftIndex]&&array[index]<=array[rightIndex])
		{
			return true;
		}
		
		return false;
	}
	
}
