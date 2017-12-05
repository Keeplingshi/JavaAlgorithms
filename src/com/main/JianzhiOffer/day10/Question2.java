package com.main.JianzhiOffer.day10;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 * @author chenbin
 *
 */
public class Question2 {

	public static void main(String[] args) {

		Question2 question2=new Question2();
		
		int[] array={4,5,1,6,2,7,3,8};
		
		question2.GetLeastNumbers_Solution(array, 4);
		
	}

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        
    	
    	
    	ArrayList<Integer> list=new ArrayList<>();
    	
    	if(k>input.length){
    		return list;
    	}
    	
    	Arrays.sort(input);
    	for(int i=0;i<k;i++){
    		list.add(input[i]);
    	}
    	
    	return list;
    }
	
}
