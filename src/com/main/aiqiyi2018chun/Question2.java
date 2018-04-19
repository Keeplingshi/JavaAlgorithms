package com.main.aiqiyi2018chun;

import java.util.Arrays;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int[] array=new int[3];
		array[0]=sc.nextInt();
		array[1]=sc.nextInt();
		array[2]=sc.nextInt();
		
		Arrays.sort(array);
		int a=array[0];
		int b=array[1];
		int c=array[2];
		
		int num=0;
		num=c-b;
		
		a+=num;
		int r=c-a;
		if(r%2==0){
			num=num+r/2;
		}else{
			num=num+r/2+2;
		}
		
		System.out.println(num);
	}

}
