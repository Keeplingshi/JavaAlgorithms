package com.main.kuaishou2018chun;

import java.util.Arrays;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int x=sc.nextInt();
		
		String[] strarr=str.split(" ");
		int len=strarr.length;
		int[] array=new int[len];
		
		for(int i=0;i<len;i++)
		{
			array[i]=Integer.parseInt(strarr[i]);
		}

		Arrays.sort(array);
		
		if(x>array[len-1]){
			System.out.println(len);
			return;
		}
		
		int index=0;
		for(int i=0;i<len;i++)
		{
			if(array[i]>=x){
				index=i;
				break;
			}
		}
		System.out.println(index);
	}

}
