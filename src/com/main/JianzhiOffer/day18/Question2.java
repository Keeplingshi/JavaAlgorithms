package com.main.JianzhiOffer.day18;

import java.util.ArrayList;

/**
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
 * 例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，
 * 那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}； 
 * 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个：
 *  {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
 * @author chenbin
 *
 */
public class Question2 {
	
	public static void main(String[] args) {
		Question2 question2=new Question2();
		int[] num={10,14,12,11};
		int size=4;
		question2.maxInWindows(num, size);
	}
	
	
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
    	ArrayList<Integer> list=new ArrayList<>();
    	
    	if(size==0||size>num.length){
    		return list;
    	}else{
    		int begin=0;	//当前第几个窗口
    		while(begin+size<=num.length)
    		{
    			list.add(getMaxFromArray(num,begin,begin+size));
    			begin++;
    		}
    	}
        return list;
    }
    
    /**
     * 获取数组固定位置最大值
     * @param array
     * @param begin
     * @param end
     * @return
     */
    public int getMaxFromArray(int[] array,int begin,int end)
    {
    	int max=Integer.MIN_VALUE;
    	for(int i=begin;i<end;i++)
    	{
    		max=max>array[i]?max:array[i];
    	}
    	return max;
    }
	
}
