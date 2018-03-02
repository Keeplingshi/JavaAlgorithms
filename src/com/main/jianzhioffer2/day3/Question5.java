package com.main.jianzhioffer2.day3;

/**
 * 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
 * 为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,但是对于后面问题他就没辙了。
 * ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数。
 * @author Administrator
 *
 */
public class Question5 {

	public static void main(String[] args)
	{
		System.out.println(getSum1FromNum(111));
	}
	
	
    public int NumberOf1Between1AndN_Solution(int n) 
    {
    	int sum=0;
    	for(int i=1;i<=n;i++)
    	{
    		sum+=getSum1FromNum(i);
    	}
    	return sum;
    }
    
    public static int getSum1FromNum(int m)
    {
    	int s=0;
    	while(m!=0)
    	{
    		if(m%10==1)
    		{
    			s++;
    		}
    		m/=10;
    	}
    	return s;
    }
	
}
