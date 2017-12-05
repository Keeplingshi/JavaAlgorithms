package com.main.JianzhiOffer.day10;

/**
 * HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。今天测试组开完会后,他又发话了:
 * 在古老的一维模式识别中,常常需要计算连续子向量的最大和,当向量全为正数的时候,问题很好解决。
 * 但是,如果向量中包含负数,是否应该包含某个负数,并期望旁边的正数会弥补它呢？
 * 例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。
 * 你会不会被他忽悠住？(子向量的长度至少是1)
 * @author chenbin
 *
 */
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Question3 question3=new Question3();
		int[] array={-3,-2};
		System.out.println(question3.FindGreatestSumOfSubArray(array));
	}

    public int FindGreatestSumOfSubArray(int[] array) {
        
    	int sum=Integer.MIN_VALUE;
    	for(int i=0;i<array.length;i++)
    	{
    		for(int j=i;j<array.length;j++)
    		{
    			int temp=sumArray(array,i,j);
    			sum=sum>temp?sum:temp;
    		}
    	}
    	return sum;
    }
    
    public int sumArray(int[] array,int begin,int end)
    {
    	int s=0;
    	for(int i=begin;i<=end;i++)
    	{
    		s+=array[i];
    	}
    	return s;
    }
	
}
