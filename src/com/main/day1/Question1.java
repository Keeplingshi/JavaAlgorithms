package com.main.day1;

/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * @param target
 * @param array
 * @return
 */
public class Question1 {

	public static void main(String[] args) {

	}
	
	/**
	 * 
	 * @param target
	 * @param array
	 * @return
	 */
	public boolean Find(int target, int [][] array)
	{
		int rowCount=array.length;
		int columCount=array[0].length;
		
		int i=rowCount-1,j=0;
		while(i>=0&&j<columCount)
		{
			if(array[i][j]>target)
			{
				i--;
				continue;
			}else if(array[i][j]<target)
			{
				j++;
				continue;
			}else{
				return true;
			}
			
		}
		
		return false;
	}
	
}
