package com.main.JianzhiOffer.day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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

		String str="abc";
		Question3 question3=new Question3();
		question3.Permutation(str);
	}

    public ArrayList<String> Permutation(String str) 
    {
    	ArrayList<String> strList=new ArrayList<>(0);
    	if(str!=null&&str.length()>0)
    	{
    		Permutation(str.toCharArray(),0,strList);
    		Collections.sort(strList);
    	}

        return strList;
    }
	
    /**
     * 回溯法
     * @param cstr
     * @param index
     * @param list
     */
    public void Permutation(char[] cstr,int index,ArrayList<String> list)
    {
    	if(index == cstr.length - 1){
    		String val=String.valueOf(cstr);
    		if(!list.contains(val)){
    			list.add(val);
    		}
    	}else{
    		for(int j=index;j<cstr.length;j++)
    		{
    			swap(cstr,index,j);
    			Permutation(cstr,index+1,list);
    			swap(cstr,index,j);
    		}
    	}
    }

    public static void swap(char[] cs, int i, int j) {
        char temp = cs[i];
        cs[i] = cs[j];
        cs[j] = temp;
    }
    
}
