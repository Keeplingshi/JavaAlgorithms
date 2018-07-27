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

	private static void quickSort(int[] array)
	{
		quickSort(array,0,array.length-1);
		printArr(array);
	}

	private static void quickSort(int[] array, int start, int end)
	{
		if(start>end){
			return;
		}
		int base=array[start];
		int left=start;
		int right=end;

		while (left != right)
		{
			while (left < right && array[right] >= base) {
				right--;
			}
			while (left < right && array[left] <= base) {
				left++;
			}
			if(left<right){
				int temp = array[left];
				array[left] = array[right];
				array[right] = temp;
			}
		}

		array[start] = array[left];
		array[left] = base;

		quickSort(array, start, left - 1);
		quickSort(array, left + 1, end);
	}

	/**
	 * 打印数组
	 * @param array 需要打印的数组
	 */
	private static void printArr(int[] array)
	{
		for (int i : array) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
