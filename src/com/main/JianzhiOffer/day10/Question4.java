package com.main.JianzhiOffer.day10;

/**
 * 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？为
 * 此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,但是对于后面问题他就没辙了。
 * ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数。
 * @author chenbin
 *
 */
public class Question4 {

	public static void main(String[] args) {

		Question4 question=new Question4();
		
		System.out.println(question.NumberOf1Between1AndN_Solution(13));
	}

    public int NumberOf1Between1AndN_Solution(int n) 
    {
        int count=0;
        for(int i=1;i<=n;i++)
        {
        	int num=i;
        	while(num!=0)
        	{
        		if(num%10==1){
        			count++;
        		}
        		num/=10;
        	}
        }
        
        return count;
    }
	
}
