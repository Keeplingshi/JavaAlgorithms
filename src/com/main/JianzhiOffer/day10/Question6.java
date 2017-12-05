package com.main.JianzhiOffer.day10;

import java.util.ArrayList;

/**
 * 把只包含因子2、3和5的数称作丑数（Ugly Number）。
 * 例如6、8都是丑数，但14不是，因为它包含因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 * @author chenbin
 *
 */
public class Question6 {

	public static void main(String[] args) {

		Question6 question6=new Question6();
		System.out.println(question6.GetUglyNumber_Solution(7));
		
	}
	
    public int GetUglyNumber_Solution2(int n)
    {
        if(n==0)return 0;
        ArrayList<Integer> res=new ArrayList<Integer>();
        res.add(1);
        int i2=0,i3=0,i5=0;
        while(res.size()<n)
        {
            int m2=res.get(i2)*2;
            int m3=res.get(i3)*3;
            int m5=res.get(i5)*5;
            int min=Math.min(m2,Math.min(m3,m5));
            res.add(min);
            if(min==m2)i2++;
            if(min==m3)i3++;
            if(min==m5)i5++;
        }
        return res.get(res.size()-1);
    }
	

    public int GetUglyNumber_Solution(int index) {
    	
    	if (index < 7)
    		return index;
    	
    	int k=0;
    	int count=0;
    	while(true)
    	{
    		if(count==index){
    			return k;
    		}
    		k++;
    		if(isUglyNumber(k)){
    			count++;
    		}
    	}
    	
    }
    
    /**
     * 判断m是否为丑数
     * @param m
     * @return
     */
    public boolean isUglyNumber(int m)
    {
    	
    	
    	while(m%2==0){
    		m/=2;
    	}
    	while(m%3==0){
    		m/=3;
    	}
    	while(m%5==0){
    		m/=5;
    	}
    	
    	if(m==1){
    		return true;
    	}
    	
    	return false;
    }
	
}
