package com.main.JianzhiOffer.day3;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * @author chenbin
 *
 */
public class Question9 {

	public static void main(String[] args) {

	}

    public int JumpFloorII(int target) {
    	if(target>0)
    	{
    		int m=1;
    		for(int i=0;i<target-1;i++)
    		{
    			m*=2;
    		}
    		return m;
    	}
    	return 0;
    }
	
}
