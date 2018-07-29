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
		mergeSort(array);
//		quickSort(array);
//		countSort(array);
	}

	private static void mergeSort(int[] array)
	{
		mergeSort(array,0,array.length-1);
		printArr(array);
	}

	private static void mergeSort(int[] array, int start, int end)
	{
		int mid = (end - start) / 2;
		if (start < mid) {
			mergeSort(array, start, mid);
			mergeSort(array, mid + 1, end);
			mergeSort(array, start, mid, end);
		}
	}

	//array数组中，start到mid是有序的，mid+1到end是有序的
	private static void mergeSort(int[] array, int start, int mid, int end)
	{
		int temp[] = new int[end - start + 1];
		int i = start;
		int j = mid + 1;
		int k = 0;

		while (i <= mid && j <= end) {
			if (array[i] < array[j]) {
				temp[k++] = array[i++];
			} else {
				temp[k++] = array[j++];
			}
		}

		while (i <= mid) {
			temp[k++] = array[i++];
		}
		while (j <= end) {
			temp[k++] = array[j++];
		}

		System.arraycopy(temp, 0, array, start, temp.length);
	}

	private static void quickSort(int[] array)
	{
		quickSort(array, 0, array.length - 1);
		printArr(array);
	}

	private static void quickSort(int[] array, int start, int end)
	{
		if (start > end) {
			return;
		}

		int base = array[start];
		int left = start;
		int right = end;

		while (left!=right)
		{
			//从右往左，找到第一个小于base的值
			while (right > left && array[right] >= base) {
				right--;
			}
			//从左往右，找到第一个大于base的值
			while (right > left && array[left] <= base) {
				left++;
			}

			//交换array[left]与array[right]的位置
			int temp = array[left];
			array[left] = array[right];
			array[right] = temp;
		}

		//此时left=right，交换base到array[left]位置，这样base左边都是小于base的，右边都是大于base的
		array[start] = array[left];
		array[left] = base;

		//递归base左右两边
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
