package com.main.wangyi2017;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * 常规的表达式求值，我们都会根据计算的优先级来计算。比如* /的优先级就高于+-。
 * 但是小易所生活的世界的表达式规则很简单，从左往右依次计算即可，而且小易所在的世界没有除法，
 * 意味着表达式中没有/，只有(+, - 和 *)。现在给出一个表达式，需要你帮忙计算出小易所在的世界这个表达式的值为多少 
	输入描述:
		输入为一行字符串，即一个表达式。其中运算符只有-,+,*。参与计算的数字只有0~9. 保证表达式都是合法的，排列规则如样例所示。
	
	输出描述:
		输出一个数，即表达式的值
	
	输入例子1:
		3+5*7
	
	输出例子1:
		56
 * @author Administrator
 *
 */
public class Question8 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		char[] cstr=str.toCharArray();
		ArrayList<String> numList=new ArrayList<>();
		ArrayList<String> opList=new ArrayList<>();
		
		int index=0;
		for(int i=0;i<cstr.length;i++)
		{
			if(cstr[i]>='0'&&cstr[i]<='9')
			{
				if(numList.size()==index){
					numList.add("");
				}
				
				numList.set(index, numList.get(index)+cstr[i]);
			}else{
				opList.add(cstr[i]+"");
				index++;
			}
		}
		
		int result=Integer.parseInt(numList.get(0));
		for(int i=0;i<opList.size();i++)
		{
			String op=opList.get(i);
			if(op.equals("+"))
			{
				result+=Integer.parseInt(numList.get(i+1));
			}else if(op.equals("-")){
				result-=Integer.parseInt(numList.get(i+1));
			}else{
				result*=Integer.parseInt(numList.get(i+1));
			}
		}
		
		System.out.println(result);
	}
	
}
