package com.main.xiaozhao2017.day15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 	题目描述
		找出n个数里最小的k个
	输入描述:
		每个测试输入包含空格分割的n+1个整数，最后一个整数为k值,n
		不超过100。
	输出描述:
		输出n个整数里最小的k个数。升序输出
	示例1
	输入
		3 9 6 8 -10 7 -11 19 30 12 23 5
	输出
		-11 -10 3 6 7
 * @author Administrator
 *
 */
public class Question2 {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line=br.readLine();
		String[] array=line.split(" ");
		
		int k=Integer.parseInt(array[array.length-1]);
		int[] nums=new int[array.length-1];
		for(int i=0;i<array.length-1;i++)
		{
			nums[i]=Integer.parseInt(array[i]);
		}
		
		if(nums.length<=k){
			Arrays.sort(nums);
			for(int i=0;i<nums.length;i++)
			{
				System.out.print(nums[i]);
				if(i!=nums.length-1){
					System.out.print(" ");
				}
			}
			return;
		}
		
		int[] kminnumbers=new int[k];
		for(int i=0;i<kminnumbers.length;i++)
		{
			kminnumbers[i]=nums[i];
		}
		
		int index=getMaxIndexOfArr(kminnumbers);	//记录k个数中大的数字
		for(int i=k;i<nums.length;i++)
		{
			if(nums[i]<kminnumbers[index]){
				kminnumbers[index]=nums[i];
				index=getMaxIndexOfArr(kminnumbers);
			}
		}
		
		Arrays.sort(kminnumbers);
		for(int i=0;i<kminnumbers.length;i++)
		{
			System.out.print(kminnumbers[i]);
			if(i!=kminnumbers.length-1){
				System.out.print(" ");
			}
		}
		
	}

	/**
	 * 获取数组中最大元素的下标
	 * @param kminnumbers
	 * @return
	 */
	private static int getMaxIndexOfArr(int[] kminnumbers) {
		int index=0;
		int max=kminnumbers[0];
		for(int i=1;i<kminnumbers.length;i++)
		{
			if(max<kminnumbers[i]){
				index=i;
				max=kminnumbers[i];
			}
		}
		return index;
	}
	
}
