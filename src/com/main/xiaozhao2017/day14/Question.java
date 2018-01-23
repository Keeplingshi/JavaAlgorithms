package com.main.xiaozhao2017.day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * 	题目描述
		继MIUI8推出手机分身功能之后，MIUI9计划推出一个电话号码分身的功能：首先将电话号码中的每个数字加上8取个位，
		然后使用对应的大写字母代替 （"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"）， 
		然后随机打乱这些字母，所生成的字符串即为电话号码对应的分身。
	输入描述:
		第一行是一个整数T（1 ≤ T ≤ 100)表示测试样例数；接下来T行，每行给定一个分身后的电话号码的分身（长度在3到10000之间）。
	输出描述:
		输出T行，分别对应输入中每行字符串对应的分身前的最小电话号码（允许前导0）。
	示例1
	输入
		4
		EIGHT
		ZEROTWOONE
		OHWETENRTEO
		OHEWTIEGTHENRTEO
	输出
		0
		234
		345
		0345
 * @author Administrator
 *
 */
public class Question {
	
//	public static String[] numbers={"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
	
	/**
	 * "ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"

		G	1	EIGHT
		U	1	FOUR
		W	1	TWO
		X	1	SIX
		Z	1	ZERO
		
		F	2	FOUR	FIVE
		H	2	EIGHT	THREE
		S	2	SIX		SEVEN
		V	2	FIVE	SEVEN
		
		T	3	TWO		THREE	EIGHT
		R	3	ZERO	THREE	FOUR	
		
		I	4	FIVE	SIX		EIGHT	NINE
		N	4	ONE		SEVEN	NINE
		O	4
		
		E	9

	 * @param args
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String[] arr=new String[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=br.readLine();
		}
		
//		String[] arr={"EIGHT","ZEROTWOONE","OHWETENRTEO","OHEWTIEGTHENRTEO"};
		getMinTelNumber(arr);
	}

	private static void getMinTelNumber(String[] arr) {
		
		for(int i=0;i<arr.length;i++)
		{
			ArrayList<Integer> numlist=new ArrayList<>();
			char[] carr=arr[i].toCharArray();
			ArrayList<Character> clist=new ArrayList<Character>();
			for(Character c:carr)
			{
				clist.add(c);
			}
			
			while(!clist.isEmpty())
			{
				//是否包含0
				if(clist.contains('Z'))
				{
					clist.remove(clist.indexOf('Z'));
					clist.remove(clist.indexOf('E'));
					clist.remove(clist.indexOf('R'));
					clist.remove(clist.indexOf('O'));
					numlist.add(2);
					continue;
				}
				//是否包含2
				if(clist.contains('W'))
				{
					clist.remove(clist.indexOf('T'));
					clist.remove(clist.indexOf('W'));
					clist.remove(clist.indexOf('O'));
					numlist.add(4);
					continue;
				}
				//是否包含4
				if(clist.contains('U'))
				{
					clist.remove(clist.indexOf('F'));
					clist.remove(clist.indexOf('O'));
					clist.remove(clist.indexOf('U'));
					clist.remove(clist.indexOf('R'));
					numlist.add(6);
					continue;
				}
				//是否包含6
				if(clist.contains('X'))
				{
					clist.remove(clist.indexOf('S'));
					clist.remove(clist.indexOf('I'));
					clist.remove(clist.indexOf('X'));
					numlist.add(8);
					continue;
				}
				//是否包含8
				if(clist.contains('G'))
				{
					clist.remove(clist.indexOf('E'));
					clist.remove(clist.indexOf('I'));
					clist.remove(clist.indexOf('G'));
					clist.remove(clist.indexOf('H'));
					clist.remove(clist.indexOf('T'));
					numlist.add(0);
					continue;
				}
				//是否包含5
				if(clist.contains('F'))
				{
					clist.remove(clist.indexOf('F'));
					clist.remove(clist.indexOf('I'));
					clist.remove(clist.indexOf('V'));
					clist.remove(clist.indexOf('E'));
					numlist.add(7);
					continue;
				}
				//是否包含3
				if(clist.contains('H'))
				{
					clist.remove(clist.indexOf('T'));
					clist.remove(clist.indexOf('H'));
					clist.remove(clist.indexOf('R'));
					clist.remove(clist.indexOf('E'));
					clist.remove(clist.indexOf('E'));
					numlist.add(5);
					continue;
				}
				//是否包含7
				if(clist.contains('S'))
				{
					clist.remove(clist.indexOf('S'));
					clist.remove(clist.indexOf('E'));
					clist.remove(clist.indexOf('V'));
					clist.remove(clist.indexOf('E'));
					clist.remove(clist.indexOf('N'));
					numlist.add(9);
					continue;
				}
				//是否包含9
				if(clist.contains('I'))
				{
					clist.remove(clist.indexOf('N'));
					clist.remove(clist.indexOf('I'));
					clist.remove(clist.indexOf('N'));
					clist.remove(clist.indexOf('E'));
					numlist.add(1);
					continue;
				}
				//是否包含1
				if(clist.contains('N'))
				{
					clist.remove(clist.indexOf('O'));
					clist.remove(clist.indexOf('N'));
					clist.remove(clist.indexOf('E'));
					numlist.add(3);
					continue;
				}
			}
			
			numlist.sort((a, b) -> a.compareTo(b));
			for(Integer integer:numlist){
				System.out.print(integer);
			}
			System.out.println();
		}
		
	}

}
