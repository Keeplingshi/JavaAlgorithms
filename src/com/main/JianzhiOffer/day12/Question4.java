package com.main.JianzhiOffer.day12;

import java.util.ArrayList;

/**
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，是的他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 * 
 * 对应每个测试案例，输出两个数，小的先输出。
 * @author chenbin
 *
 */
public class Question4 {

	public static void main(String[] args) {

	}

	/**
	 * 
	 * @param array
	 * @param sum
	 * @return
	 */
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        
    	ArrayList<Integer> returnList=new ArrayList<>();
    	for(int i=0;i<array.length-1;i++)
    	{
    		for(int j=i+1;j<array.length;j++)
    		{
    			if(array[i]+array[j]==sum)
    			{
    				//如果当前没有数对，则加入
    				if(returnList.size()==0){
    					returnList.add(array[i]);
    					returnList.add(array[j]);
    				}else{
    					if(array[i]*array[j]<returnList.get(0)*returnList.get(1))
    					{
    						returnList.set(0, array[i]);
    						returnList.set(1, array[j]);
    					}
    				}
    			}
    		}
    	}
    	return returnList;
    }
}
