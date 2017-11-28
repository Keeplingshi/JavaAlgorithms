package com.main.JianzhiOffer.day3;

/**
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * @author chenbin
 *
 */
public class Question11 {

	public static void main(String[] args) {
		Question11 question11=new Question11();
		System.out.println(question11.NumberOf1(-1));
	}

    public int NumberOf1(int n) {
        int count = 0;
        int flag = 1;
        while (flag != 0) {
            if ((n & flag) != 0) {
                count++;
            }
            flag = flag << 1;
        }
        return count;
    }
	
}
