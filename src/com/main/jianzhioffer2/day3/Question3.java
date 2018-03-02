package com.main.jianzhioffer2.day3;

/**
 * HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。今天测试组开完会后,他又发话了:
 * 在古老的一维模式识别中,常常需要计算连续子向量的最大和,当向量全为正数的时候,问题很好解决。
 * 但是,如果向量中包含负数,是否应该包含某个负数,并期望旁边的正数会弥补它呢？
 * 例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。
 * 你会不会被他忽悠住？(子向量的长度至少是1)
 * 
 * 解法：动态规划
 * 
 * @author Administrator
 *
 */
public class Question3 {

	public static void main(String[] args)
	{
		//int[] array={6,-3,-2,7,-15,1,2,2};
		int[] array={-2,-8,-1,-5,-9};
		System.out.println(FindGreatestSumOfSubArray(array));
	}
	
	/**
	 * 方法一，采用二维数组三角形存储值
	 * @param array
	 * @return
	 */
    public static int FindGreatestSumOfSubArray(int[] array) 
    {
     	int n=array.length;
    	int result[][]=new int[n][n];
    	int max=array[0];
    	for(int i=0;i<n;i++)
    	{
        	result[i][i]=array[i];
        	max=max>result[i][i]?max:result[i][i];
        	for(int j=i+1;j<n;j++)
        	{
        		result[i][j]=result[i][j-1]+array[j];
        		max=max>result[i][j]?max:result[i][j];
        	}
    	}
    	
		return max;
    }
	
    /**
     * 方法二：动态规划
     * @param array
     * @return
     */
    public static int FindGreatestSumOfSubArray2(int[] array) 
    {
        int res = array[0]; //记录当前所有子数组的和的最大值
        int max=array[0];   //包含array[i]的连续数组最大值
        for (int i = 1; i < array.length; i++) {
            max=Math.max(max+array[i], array[i]);
            res=Math.max(max, res);
        }
        return res;
    }
    
}
