package com.main.JianzhiOffer.day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 * @author chenbin
 *
 */
public class Question5 {

	public static void main(String[] args) {

		Question5 question=new Question5();
		int[] array={3,32,321};
		System.out.println(question.PrintMinNumber(array));
	}

    public String PrintMinNumber(int [] numbers) {

    	ArrayList<Integer> list=new ArrayList<Integer>();
    	for(int i=0;i<numbers.length;i++)
    	{
    		list.add(numbers[i]);
    	}
    	
    	Collections.sort(list, new Comparator<Integer>(){

			@Override
			public int compare(Integer arg0, Integer arg1) {
				String s1=arg0+""+arg1;
				String s2=arg1+""+arg0;
				return s1.compareTo(s2);
			}
    	});
    	
    	String s="";
    	for(int i=0;i<numbers.length;i++)
    	{
    		s+=list.get(i);
    	}
    	
    	return s;
    }
	
   
}
