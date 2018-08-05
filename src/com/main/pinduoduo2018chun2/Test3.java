package com.main.pinduoduo2018chun2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 给定一个无序数组，包含正数、负数和0，要求从中找出3个数的乘积，使得乘积最大，要求时间复杂度：O(n)，空间复杂度：O(1) 
 * 
 * 测试用例:
61

对应输出应该为:

807120253114

你的输出为:

2147413257
 * @author Administrator
 *
 */
public class Test3 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();

		Long array[]=new Long[n];
		
		for(int i=0;i<n;i++){
			array[i]=sc.nextLong();
		}
		Arrays.sort(array);
		
		long result;
		//如果三个都小于0
		if(array[n-1]<=0){
			result = array[n-3]*array[n-2]*array[n-1];
		}else{
			//只有一个数大于0
			if(array[n-2]<=0){
				result=array[n-1]*array[0]*array[1];
			}else{
				//两个数大于0
				
				if(array[n-3]<=0){
					result=array[0]*array[1]*array[n-1];
				}else{
					long tmp1 = array[n-3]*array[n-2]*array[n-1];
					long tmp2 = array[0]*array[1]*array[n-1];
					result = tmp1>tmp2?tmp1:tmp2;
				}
			}
			
		}
		
		System.out.println(result);
		
	}
	/**
	 * 打印数组
	 * @param <T>
	 * @param array 数组
	 */
	private static <T> void printArr(T[] array)
	{
		for (T i : array) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
