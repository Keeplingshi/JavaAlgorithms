package com.main.JianzhiOffer.day9;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * 
 * 输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
 * @author chenbin
 *
 */
public class Question3 {

	public static void main(String[] args) {

		String str="bcaa";
		Question3 question3=new Question3();
		question3.Permutation(str);
	}

    public ArrayList<String> Permutation(String str) 
    {
    	ArrayList<String> strList=new ArrayList<>(0);
    	
        char[] cstr=str.toCharArray();
        Arrays.sort(cstr);
        for(char c:cstr)
        {
        	System.out.println(c);
        }
        
        return null;
    }
	
}
