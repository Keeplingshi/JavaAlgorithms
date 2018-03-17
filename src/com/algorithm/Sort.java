package com.algorithm;

/**
 * 多种排序算法比较
 * @author Administrator
 *
 */
public class Sort {

	public static void main(String[] args)
	{
//		int array[]={6,4,5,3,2,1};
		int array[]={6,4,2,3,6,7};
//		Sort.bubbleSort(array);
//		Sort.selectionSort(array);
//		Sort.insertionSort(array);
		Sort.mergeSort(array);
	}
	
	/**
	 * 快速排序
	 * @param array
	 */
	private static void quickSort(int[] array)
	{
		
		
		printArr(array);
	}
	
	/**
	 * 归并排序
	 * @param array
	 */
	private static void mergeSort(int[] array)
	{
		mergeSort(array,0,array.length-1);
		printArr(array);
	}
	
	private static void mergeSort(int[] array,int start,int end)
	{
		int mid=(start+end)/2;
		if(start<end)
		{
			mergeSort(array, start, mid);
			mergeSort(array,mid+1,end);
			mergeSort(array,start,mid,end);
		}
		
	}
	
	/**
	 * 归并排序辅助函数
	 * @param array
	 * @param start
	 * @param mid
	 * @param end
	 */
	private static void mergeSort(int[] array, int start, int mid, int end) 
	{
        int[] temp = new int[end - start + 1];
        int i = start;// 左指针
        int j = mid + 1;// 右指针
        int k = 0;
        // 把较小的数先移到新数组中
        while (i <= mid && j <= end) {
            if (array[i] < array[j]) {
                temp[k++] =array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }
        // 把左边剩余的数移入数组
        while (i <= mid) {
            temp[k++] = array[i++];
        }
        // 把右边边剩余的数移入数组
        while (j <= end) {
            temp[k++] = array[j++];
        }
        // 把新数组中的数覆盖nums数组
        for (int k2 = 0; k2 < temp.length; k2++) {
        	array[k2 + start] = temp[k2];
        }
	}

	/**
	 * 希尔排序
	 * @param array
	 */
	private static void shellSort(int[] array)
	{
		
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
		for(int i=1;i<array.length;i++)
		{
			int tmp=array[i];
			int j=i-1;
			while(j>=0&&tmp<array[j])
			{
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=tmp;
		}
		
		printArr(array);
	}

	/**
	 * 冒泡排序：
		在要排序的一组数中，对当前还未排好序的范围内的全部数，自上而下对相邻的两个数依次进行比较和调整，
		让较大的数往下沉，较小的往上冒。即：每当两相邻的数比较后发现它们的排序与排序要求相反时，就将它们互换。
		冒泡排序是稳定的。算法时间复杂度O(n^2)
	 */
	public static void bubbleSort(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length-1;j++)
			{
				if(array[j+1]<array[j])
				{
					int tmp=array[j+1];
					array[j+1]=array[j];
					array[j]=tmp;
				}
			}
		}
		
		printArr(array);
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
		for(int i=0;i<array.length-1;i++)
		{
			int minIndex=i;
			for(int j=i+1;j<array.length;j++)
			{
				if(array[minIndex]>array[j]){
					minIndex=j;
				}
			}
			
			int tmp=array[i];
			array[i]=array[minIndex];
			array[minIndex]=tmp;
		}
		
		printArr(array);
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
