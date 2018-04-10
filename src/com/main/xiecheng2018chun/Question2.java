package com.main.xiecheng2018chun;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 有一个NxN整数矩阵，请编写一个算法，将矩阵顺时针旋转90度。 

	给定一个NxN的矩阵，和矩阵的阶数N,请返回旋转后的NxN矩阵,保证N小于等于300。
 * @author Administrator
 *
 */
public class Question2 {

	public static void main(String[] args) {
        
		ArrayList<Integer> list=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{
			list.add(sc.nextInt());
		}
        
		int a=list.size();
		int n=(int)Math.sqrt(a);
		
		int matrix[][]=new int[n][n];
		int index=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				matrix[i][j]=list.get(index);
				index++;
			}
		}
        
        int temp[][]=xuanzhuan(matrix);  
        
        for(int i=0;i<temp.length;i++)
        {  
            for(int j=0;j<temp[0].length;j++)
            {  
            	if(j!=temp[0].length-1){
            		System.out.print(temp[i][j]+" ");
            	}else{
            		System.out.print(temp[i][j]);  
            	}
                
            }  
            System.out.println();  
        } 
		
	}
	
    private static int[][] xuanzhuan(int [][]mat)
    {  
        int temp[][]=new int[mat[0].length][mat.length];  
        
        int t=mat.length-1;  
        for(int i=0;i<mat.length;i++,t--)
        {  
            for(int j=0;j<mat[0].length;j++)
            {  
                temp[j][t]=mat[i][j];  
            }  
        }  
        return temp;  
    }  
}
