package com.main.day3;

/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。 n<=39
 * @author chenbin
 *
 */
public class Question7 {

	public static void main(String[] args) {
		
		Question7 question7=new Question7();
		System.out.println(question7.Fibonacci(6));
	}

    public int Fibonacci(int n) {
    	if(n==0){
    		return 0;
    	}
    	
    	if(n==1||n==2){
    		return 1;
    	}
    	return Fibonacci(n-1)+Fibonacci(n-2);
    }
	
}
