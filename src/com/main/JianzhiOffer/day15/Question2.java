package com.main.JianzhiOffer.day15;

/**
 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
 * 
 * 例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。 
 * 
 * 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
 * @author chenbin
 *
 */
public class Question2 {

	public static void main(String[] args) {

		Question2 question2=new Question2();
		char[] str={};
		System.out.println(question2.isNumeric(str));
	}

	/**
	 * 1、如果首位是+，-，数字且不为0则继续
	 * 2、如果包含e或者E，则e或E后面只能有一个符号+,-或后面是纯数字
	 * 3、如果包含小数点，则只能包含一个
	 * @param str
	 * @return
	 */
    public boolean isNumeric(char[] str) {
        
        String s=String.valueOf(str);
        return s.matches("[+-]?[0-9]*(\\.[0-9]*)?([eE][+-]?[0-9]+)?");
    	
    }
	
}
