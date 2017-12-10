package com.main.JianzhiOffer.day14;

import java.util.ArrayList;

/**
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，但不知道有几个数字是重复的。
 * 也不知道每个数字重复几次。请找出数组中任意一个重复的数字。 
 * 
 * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
 * @author chenbin
 *
 */
public class Question4 {

	public static void main(String[] args) {

	}

	/**
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
	 */
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if(length==0||length==1){
        	return false;
        }
    	
    	ArrayList<Integer> list=new ArrayList<Integer>();
    	for(int i:numbers){
    		if(list.contains(i)){
    			duplication[0]=i;
    			return true;
    		}else{
    			list.add(i);
    		}
    	}
    	
    	return false;
    }
	
}
