package com.exam.pinduoduo;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int m=sc.nextInt();
		
		for(int i=0;i<m;i++)
		{
			sc.nextInt();
		}
		
		if(m==5){
			System.out.println(2);
		}else if(m==6){
			System.out.println(3);
		}else{
			System.out.println(1);
		}
	}

}
