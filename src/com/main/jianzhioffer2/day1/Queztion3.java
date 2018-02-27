package com.main.jianzhioffer2.day1;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * @author Administrator
 *
 */
public class Queztion3 {
	
	public static void main(String[] args)
	{
		int n=3;
		System.out.println(JumpFloorII(n));
	}
	
    public static int JumpFloorII(int target) {
    	
    	int sum=1;
    	for(int i=0;i<target-1;i++){
    		sum*=2;
    	}
    	return sum;
//    	if(target==1){
//    		return 1;
//    	}
//    	
//    	if(target==2){
//    		return 2;
//    	}
//    	
//    	return JumpFloorII(target-1)+JumpFloorII(target-2);
    }

}
