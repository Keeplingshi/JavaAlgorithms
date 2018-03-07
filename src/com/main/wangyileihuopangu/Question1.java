package com.main.wangyileihuopangu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 	给定一个字符串，请你将字符串重新编码，将连续的字符替换成“连续出现的个数+字符”。比如字符串AAAABCCDAA会被编码成4A1B2C1D2A。 
	输入描述:
		每个测试输入包含1个测试用例
		每个测试用例输入只有一行字符串，字符串只包括大写英文字母，长度不超过10000。
	
	
	输出描述:
		输出编码后的字符串
	
	输入例子1:
		AAAABCCDAA
	
	输出例子1:
		4A1B2C1D2A
 * @author chenbin
 *
 */
public class Question1 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
        char[] cstr=str.toCharArray();
        ArrayList<Character> clist=new ArrayList<Character>();
        ArrayList<Integer> nlist=new ArrayList<Integer>();
        
        clist.add(cstr[0]);
        nlist.add(1);
        
        for(int i=1;i<cstr.length;i++)
        {
            if(cstr[i]==clist.get(clist.size()-1))
            {
            	nlist.set(nlist.size()-1, nlist.get(nlist.size()-1)+1);
            }else{
            	clist.add(cstr[i]);
            	nlist.add(1);
            }
        }
        
        for(int i=0;i<nlist.size();i++)
        {
        	System.out.print(nlist.get(i)+""+clist.get(i));
        }
        System.out.println();
	}
	
}
