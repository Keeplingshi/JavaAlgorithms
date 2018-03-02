package com.main.jianzhioffer2.day3;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * @author Administrator
 *
 */
public class Question1 {

	public int JumpFloor(int target)
	{
		if(target==1||target==2)
		{
			return target;
		}else{
			return JumpFloor(target-1)+JumpFloor(target-2);
		}
	}
	
}
