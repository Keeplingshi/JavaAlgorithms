package com.main.xiaozhao2017.day18;

import java.util.Scanner;

/**
 * 	题目描述
		一只袋鼠要从河这边跳到河对岸，河很宽，但是河中间打了很多桩子，每隔一米就有一个，每个桩子上都有一个弹簧，袋鼠跳到弹簧上就可以跳的更远。
		每个弹簧力量不同，用一个数字代表它的力量，如果弹簧力量为5，就代表袋鼠下一跳最多能够跳5米，如果为0，就会陷进去无法继续跳跃。
		河流一共N米宽，袋鼠初始位置就在第一个弹簧上面，要跳到最后一个弹簧之后就算过河了，给定每个弹簧的力量，求袋鼠最少需要多少跳能够到达对岸。如果无法到达输出-1
	输入描述:
		输入分两行，第一行是数组长度N (1 ≤ N ≤ 10000)，第二行是每一项的值，用空格分隔。
	输出描述:
		输出最少的跳数，无法到达输出-1
	示例1
	输入
		5
		2 0 1 1 1
	输出
		4
 * @author Administrator
 *
 */
public class Question1 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] array=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		int count=0;
		
		int end=n-1;
		int length=n;
		while(true)
		{
			int index=getIndexOfLastZ(array,end,length);
			if(index!=-1){
//				System.out.println(index+" "+array[index]);
//				length-=array[index];
				length=index;
				end=index-1;
			}else{
				if(length!=0){
					count=-1;
				}
				break;
			}
			count++;
			if(end<0){
				break;
			}
			
		}
		System.out.println(count);
	}
	
	/**
	 * 
	 * @param array
	 * @param t
	 * @param n
	 * @return
	 */
	private static int getIndexOfLastZ(int[] array,int end,int length)
	{
		int k=-1;
		for(int i=end;i>=0;i--)
		{
//			System.out.print(array[end-i]+" ");
			if(array[i]>=length-i){
				k=i;
			}
		}
//		System.out.println();
		return k;
	}
	
}
