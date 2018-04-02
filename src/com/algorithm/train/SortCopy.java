package com.algorithm.train;

/**
 * 多种排序算法比较
 * @author Administrator
 *
 */
public class SortCopy {

	public static void main(String[] args)
	{
//		int array[]={6,4,5,3,2,1};
		int array[]={6,4,2,3,6,7};
//		bubbleSort(array);
//		selectionSort(array);
//		insertionSort(array);
//		mergeSort(array);
		quickSort(array);
//		countSort(array);
	}
	

	/**
	 * 快速排序
	 * @param array
	 */
	private static void quickSort(int[] array) 
	{
		quickSort(array,0,array.length-1);
		printArr(array);
	}

	/**
	 * 快速排序，哨兵相遇
	 * @param array
	 * @param start
	 * @param end
	 */
	private static void quickSort(int[] array, int start, int end) 
	{
		if(start>end){
			return;
		}
		int base=array[start];
		int i=start;	//左指针
		int j=end;		//右指针
		
		while(i!=j)
		{
			while(i<j&&array[j]>=base){
				j--;
			}
			while(i<j&&array[i]<=base){
				i++;
			}
			
			if(i<j){
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
		
		//此时，i==j，将array[i]与base交换
		array[start]=array[i];
		array[i]=base;
		
		quickSort(array,start,i-1);
		quickSort(array,i+1,end);
	}


	/**
	 * 插入排序
	 * 插入排序的基本操作就是将一个数据插入到已经排好序的有序数据中，
	 * 从而得到一个新的、个数加一的有序数据，算法适用于少量数据的排序，时间复杂度为O(n^2)。
	 * 算法时间复杂度O(n2)
	 * @param array
	 */
	private static void insertionSort(int[] array) 
	{

	}

	/**
	 * 冒泡排序：
		在要排序的一组数中，对当前还未排好序的范围内的全部数，自上而下对相邻的两个数依次进行比较和调整，
		让较大的数往下沉，较小的往上冒。即：每当两相邻的数比较后发现它们的排序与排序要求相反时，就将它们互换。
		冒泡排序是稳定的。算法时间复杂度O(n^2)
	 */
	public static void bubbleSort(int[] array)
	{

	}
	
	/**
	 * 选择排序
	 * 它的工作原理是每一次从待排序的数据元素中选出最小（或最大）的一个元素，存放在序列的起始位置，直到全部待排序的数据元素排完。
	 * 不断选择剩余数组中的最小的一个数
	 * 算法复杂的O(n2)
	 * @param array
	 */
	public static void selectionSort(int[] array)
	{

	}

	
	/**
	 * 打印数组
	 * @param array
	 */
	public static void printArr(int[] array)
	{
		for (int i : array) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
}
