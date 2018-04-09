package com.main.jingdong2018chun;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		/**
		 * f[i][j]=f[i-2][j-1]+f[i-2][j+1]
		 * 		  +f[i-2][j-1]+f[i-2][j+1]
		 * 		  +f[i-2][j-1]+f[i-2][j+1]
		 * 		  +f[i-2][j-1]+f[i-2][j+1]
		 */
		
		int f[][]=new int[9][10];
		f[1][2]=1;
		f[2][1]=1;
		
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<10;j++)
			{
				f[i][j]=f[i-2][j-1]+f[i-1][j-2];
			}
		}
		
		System.out.println(f[x][y]);
	}

}
