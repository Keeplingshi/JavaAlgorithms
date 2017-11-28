package com.main.JianzhiOffer.day4;

/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * @author chenbin
 *
 */
public class Question1 {

	public static void main(String[] args) {
		
		Question1 question1=new Question1();
		System.out.println(question1.Power(0, -3));
	}

	/**
	 * 
	 * @param base
	 * @param exponent
	 * @return
	 */
	public double Power(double base, int exponent) {
		
		double tmp=1;
		
		if(base==0){
			return 0;
		}
		
		if(exponent>0){
			for(int i=0;i<exponent;i++)
			{
				tmp*=base;
			}
		}else if(exponent<0){
			for(int i=0;i<(-exponent);i++)
			{
				tmp/=base;
			}
		}else {
			return 1;
		}

		return tmp;
	}
	
}
