package com.algorithm.dynamic_programming;

/**
 * 最大子序列的和
 * @author Administrator
 *
 */
public class MaxSumOfSubArray {

	public static void main(String[] args) {

//		int[] nums={-2,1,-3,4,-1,2,1,-5,4};
		int[] nums = {1,2};
		
		int result=maxSubArray(nums);
		System.out.println(result);
	}

	/**
	 * 状态转移方程：前i个元素中的最大子序列和sum有两种可能，
	 * 1、最大子向量在前i-1个元素中
	 * 2、最大子向量以第i个元素结尾
	 * @param nums
	 * @return
	 */
    public static int maxSubArray(int[] nums) {
        
    	int max_front=nums[0];
    	int max_back=0;
    	for(int i=0;i<nums.length;i++)
    	{
    		max_back=Math.max(nums[i],max_back+nums[i]);
    		
    		max_front=Math.max(max_back, max_front);
    	}
    	
    	return max_front;
    }
	
}
