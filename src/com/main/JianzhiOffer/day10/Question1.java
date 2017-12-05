package com.main.JianzhiOffer.day10;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 * @author chenbin
 *
 */
public class Question1 {

	public static void main(String[] args) {
		
		Question1 question1=new Question1();
		
		int[] array={1,2,3,2,2,2,5,4,2};
		System.out.println(question1.MoreThanHalfNum_Solution(array));
	}

    public int MoreThanHalfNum_Solution(int [] array) 
    {
        
        for(int i=0;i<=array.length/2+1;i++)
        {
        	int num=array[i];
        	int count=0;
        	for(int j=0;j<array.length;j++)
        	{
        		if(array[j]==num){
        			count++;
        		}
        		if(count>=array.length/2+1){
        			return num;
        		}
        	}
        }
        return 0;
        
    }
	
}
