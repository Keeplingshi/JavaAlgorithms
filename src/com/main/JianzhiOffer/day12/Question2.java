package com.main.JianzhiOffer.day12;

import java.util.ArrayList;

/**
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 * 
 * //num1,num2分别为长度为1的数组。传出参数
 * //将num1[0],num2[0]设置为返回结果
 * @author chenbin
 *
 */
public class Question2 {

	public static void main(String[] args) {

//		int[] array={2,4,3,6,3,2,5,5};
//		int num1[]=new int[1];
//		int num2[]=new int[1];
//		FindNumsAppearOnce(array,num1,num2);
//		System.out.println(num1[0]);
//		System.out.println(num2[0]);
	}

    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) 
    {
    	ArrayList<Integer> list=new ArrayList<>();
        for(int m:array){
        	if(countElementInArray(array, m)%2!=0){
        		list.add(m);
        	}
        }
        num1[0]=list.get(0);
        num2[0]=list.get(1);
    }
    
    /**
     * 统计元素在数组中的个数
     * @param array
     * @return
     */
    public int countElementInArray(int[] array,int n)
    {
    	int count=0;
    	for(int m:array)
    	{
    		if(m==n){
    			count++;
    		}
    	}
    	return count;
    }
	
}
