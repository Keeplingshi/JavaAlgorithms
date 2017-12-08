package com.main.JianzhiOffer.day12;

/**
 * 汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。
 * 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
 * 
 * 例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！
 * 
 * @author chenbin
 *
 */
public class Question5 {

	public static void main(String[] args) {

		Question5 question5=new Question5();
		String s="";
		System.out.println(question5.LeftRotateString(s, 0));
	}

	/**
	 * 分析：即字符串每个字符向左移动K位，头的一端从尾端接入
	 * @param str
	 * @param n
	 * @return
	 */
    public String LeftRotateString(String str,int n) {
    	if(n>str.length()){
    		return "";
    	}
    	return str.substring(n, str.length())+str.substring(0, n);
    }
	
}
