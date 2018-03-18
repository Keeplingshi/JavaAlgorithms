package com.algorithm;

public class Test {

	
	/**
	 * 快速排序
	 * @param array
	 */
	private static void quickSort(int[] array)
	{
		quickSort(array,0,array.length-1);
	}
	
	/**
	 * 快速排序，选取一个数为基准，比该数大的放右边，小的放左边
	 * 哨兵相遇
	 * @param array
	 * @param left
	 * @param right
	 */
	private static void quickSort(int[] array, int left, int right) 
	{
		if(left>right){
			return;
		}
		
		int temp=array[left];
		int i=left;
		int j=right;
		while(i!=j)
		{
			while(array[j]>=temp&&i<j){
				j--;
			}
			while(array[i]<=temp&&i<j){
				i++;
			}
			
			if(i<j){
				int t=array[i];
				array[i]=array[j];
				array[j]=t;
			}
		}
		
		//将基准放到中间
		array[left]=array[i];
		array[i]=temp;
		
		quickSort(array, left, i-1);
		quickSort(array,i+1,right);
	}
	
	/**
	 * 归并排序
	 * @param array
	 */
	private static void mergeSort(int[] array)
	{
		mergeSort(array,0,array.length-1);
	}
	
	/**
	 * 归并排序辅助函数
	 * @param array
	 * @param start
	 * @param end
	 */
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
	 * 归并排序辅助函数，将start到end之间的数组排序
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
        int k = 0;	//temp的指针
        // 把较小的数先移到新数组中
        //此时的array在[start,mid]与[mid+1,end]两个区间范围的数都是有序的，因此，将这里的操作 可以得到temp是有序的
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
        //到这一步，上面得到的temp是有序的
        
        // 把新数组中的数覆盖nums数组
        for (int index = 0; index < temp.length; index++) {
        	array[index + start] = temp[index];
        }
	}
	
}
