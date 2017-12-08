package com.main.JianzhiOffer.day11;

/**
 * 统计一个数字在排序数组中出现的次数。
 * @author chenbin
 *
 */
public class Question4 {

	public static void main(String[] args) {

	}

    public int GetNumberOfK(int [] array , int k) 
    {
    	int count=0;
        for(int i=0;i<array.length;i++){
        	if(array[i]==k){
        		count++;
        	}
        }
        return count;
    }
	
}
