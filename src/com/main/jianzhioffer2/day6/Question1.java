package com.main.jianzhioffer2.day6;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * @author Administrator
 *
 */
public class Question1 {

	public static void main(String[] args)
	{
		int []array={1,2,3,4,5,6};
		
		reOrderArray(array);
		
		System.out.println();
	}
	
    public static void reOrderArray(int [] array) 
    {
        int[] arr=new int[array.length];
        
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=array[i];
        	if(arr[i]%2==1){
        		array[index++]=arr[i];
        	}
        }
        
        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i]%2==0){
        		array[index++]=arr[i];
        	}
        }
    }
	
}
