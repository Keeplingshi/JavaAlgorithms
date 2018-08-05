package com.exam.pinduoduo;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		char[] cstr=str.toCharArray();
		
		int result = 0;
		for(int k=1;k<=str.length()-1;k++){
			String tmp1="";
			for(int i=0;i<k;i++){
				tmp1+=cstr[i];
			}
			String tmp2="";
			for(int i=k;i<str.length();i++){
				tmp2+=cstr[i];
			}
			int a=getChange(tmp1);
			int b=getChange(tmp2);
			
			result+=a*b;
		}

		System.out.println(result);
	}

	private static int getChange(String str) {
		int result=0;
		char[] cstr=str.toCharArray();
		int len = cstr.length;
		if(cstr[len-1]=='0'){
			if(cstr[0]=='0'){
				if(len==1){
					result=1;
				}else{
					result=0;
				}
				
			}else{
				result=1;
			}
		}else{
			if(cstr[0]=='0'){
				result=1;
			}else{
				result=len;
			}
		}
		return result;
	}
	
}
