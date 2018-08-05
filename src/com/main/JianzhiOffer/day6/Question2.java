package com.main.JianzhiOffer.day6;

import java.util.ArrayList;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下矩阵： 
 * 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
 * 则依次打印出数字
 * 1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * @author chenbin
 *
 */
public class Question2 {

	public static void main(String[] args) {

		int [][] matrix=new int[5][5];
		int x=1;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				matrix[i][j]=x;
				x++;
			}
		}
		
		
		printMatrix(matrix);
		
//		int a=5;
//		int b=2;
//		int [][] matrix=new int[a][b];
//		int x=1;
//		for(int i=0;i<a;i++)
//		{
//			for(int j=0;j<b;j++)
//			{
//				matrix[i][j]=x;
//				x++;
//			}
//		}
//		
//		printMatrix2(matrix);
		
	}
	
    public static void printMatrix2(int [][] matrix) {
    	
    	int row=matrix.length;
    	int column=matrix[0].length;
    	System.out.println(column+" "+row);
    	
        for(int i=0;i<row;i++)
        {
        	for(int j=0;j<column;j++)
        	{
        		System.out.print(matrix[i][j]+" ");
        	}
        }
        System.out.println();
        
        //打印圈数
        int circle=((row<column?row:column)-1)/2+1;
        //四个边界
        int rowsmall=0,rowbig=row;
        int columnsmall=0,columnbig=column;
        
        for(int k=0;k<circle;k++)
        {
        	System.out.println("\n"+rowsmall+" "+rowbig+" "+columnsmall+" "+columnbig);
//        	if(rowsmall>rowbig){
//        		break;
//        	}
//        	if(columnsmall>columnbig){
//        		break;
//        	}
        	
        	//横向，向右打印
        	for(int i=columnsmall;i<columnbig;i++)
        	{
        		System.out.print(matrix[rowsmall][i]+" ");
        	}
        	//纵向，向下打印
        	for(int i=rowsmall+1;i<rowbig;i++)
        	{
        		System.out.print(matrix[i][columnbig-1]+" ");
        	}
        	
        	
        	//横向，向左打印
        	if(rowsmall!=rowbig-1)
        	{
            	for(int i=columnbig-1;i>columnsmall;i--)
            	{
            		System.out.print(matrix[rowbig-1][i-1]+" ");
            	}
        	}

        	if(columnsmall!=columnbig-1)
        	{
            	//纵向，向上打印
            	for(int i=rowbig-1;i>rowsmall+1;i--)
            	{
            		System.out.print(matrix[i-1][columnsmall]+" ");
            	}
        	}

        	rowsmall++;
        	rowbig--;
        	columnsmall++;
        	columnbig--;
        	
        }
        
    }
    
    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        
    	ArrayList<Integer> array=new ArrayList<>();
    	
    	int row=matrix.length;
    	int column=matrix[0].length;
    	
        //打印圈数
        int circle=((row<column?row:column)-1)/2+1;
        //四个边界
        int rowsmall=0,rowbig=row;
        int columnsmall=0,columnbig=column;
        
        for(int k=0;k<circle;k++)
        {
        	//横向，向右打印
        	for(int i=columnsmall;i<columnbig;i++)
        	{
        		array.add(matrix[rowsmall][i]);
        	}
        	//纵向，向下打印
        	for(int i=rowsmall+1;i<rowbig;i++)
        	{
        		array.add(matrix[i][columnbig-1]);
        	}
        	
        	//横向，向左打印
        	if(rowsmall!=rowbig-1){
            	for(int i=columnbig-1;i>columnsmall;i--)
            	{
            		array.add(matrix[rowbig-1][i-1]);
            	}
        	}
        	
        	//纵向，向上打印
        	if(columnsmall!=columnbig-1){
            	for(int i=rowbig-1;i>rowsmall+1;i--)
            	{
            		array.add(matrix[i-1][columnsmall]);
            	}
        	}
        	
        	rowsmall++;
        	rowbig--;
        	columnsmall++;
        	columnbig--;
        }
    	
        return array;
    }
	
}
