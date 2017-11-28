package com.main.JianzhiOffer.day4;

import java.util.ArrayList;
import java.util.List;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * @author chenbin
 *
 */
public class Question2 {

	public static void main(String[] args) {

		Question2 question2=new Question2();
		int [] array={1,2,3,6,5,4};
		question2.reOrderArray(array);
    	for(int i=0;i<array.length;i++)
    	{
    		System.out.println(array[i]);
    	}
	}

	/**
	 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
	 * 所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
	 * @param array
	 */
    public void reOrderArray(int [] array) 
    {
    	List<Integer> arrji=new ArrayList<>();
    	List<Integer> arrou=new ArrayList<>();
    	for(int i=0;i<array.length;i++)
    	{
    		if(array[i]%2==0)
    		{
    			arrou.add(array[i]);
    		}else{
    			arrji.add(array[i]);
    		}
    	}
    	
    	for(int i=0;i<arrji.size();i++)
    	{
    		array[i]=arrji.get(i);
    	}
    	
    	for(int i=0;i<arrou.size();i++)
    	{
    		array[arrji.size()+i]=arrou.get(i);
    	}
    	
    }
	
}
