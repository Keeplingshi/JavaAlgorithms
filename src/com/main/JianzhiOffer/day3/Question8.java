package com.main.JianzhiOffer.day3;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * 
 * 解法：斐波那契问题
 * 
 * 如果n==1,则1种
 * 如果n==2,则1+1,2两种
 * 如果n>=3，则分为两种情况，第一种第一次跳1级，则剩下n-1级台阶，有JumpFloor(n-1)种。
 * 					    第二种情况第一次跳2级，则剩下n-2级台阶，有JumpFloor(n-2)种。
 * 因此n>=3时，共有JumpFloor(n-1)+JumpFloor(n-2)种
 * @author chenbin
 *
 */
public class Question8 {

	public static void main(String[] args) {

	}

    public int JumpFloor(int target) {
    	if(target==1){
    		return 1;
    	}
    	if(target==2){
    		return 2;
    	}
    	
    	if(target>2)
    	{
    		return JumpFloor(target-1)+JumpFloor(target-2);
    	}
    	
    	return 0;
    }
	
}
