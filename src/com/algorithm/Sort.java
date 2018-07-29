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
//		Sort.quickSort(array);
//		Sort.countSort(array);
	}
	
	/**
	 * 归并排序
	 * @param array 数组
	 */
	private static void mergeSort(int[] array) 
	{
		mergeSort(array,0,array.length-1);
		printArr(array);
	}

    /**
     * 归并排序，递归过程
     * @param array 数组
     * @param start 起始位置
     * @param end 结束位置
     */
	private static void mergeSort(int[] array, int start, int end)
	{
		int mid=(start+end)/2;
		if(start<end){
			mergeSort(array,start,mid);
			mergeSort(array,mid+1,end);
			mergeSort(array,start,mid,end);
		}
	}

	/**
	 * 归并排序，将start到end之间的数组排序
	 * 此时传入的array数组，start到mid是有序的，mid+1到end是有序的
	 * @param array 数组
	 * @param start 起始
	 * @param mid 中间
	 * @param end 结束
	 */
	private static void mergeSort(int[] array, int start, int mid, int end) 
	{
		int temp[]=new int[end-start+1];
		int i=start;	//左指针
		int j=mid+1;	//右指针
		int k=0;		//temp数组指针
		
		//将start到mid与mid+1到end之间的元素排序放入temp数组中
        while (i <= mid && j <= end) {
            if (array[i] < array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }
		
		while(i<=mid){
			temp[k++]=array[i++];
		}
		
		while(j<=end){
			temp[k++]=array[j++];
		}
		
		//此时得到的temp数组是有序的，且是array数组中start到end之间的所有元素
		//将temp数组放回到array数组中
        System.arraycopy(temp,0,array,start,temp.length);
//		for(int t=0;t<temp.length;t++){
//			array[t+start]=temp[t];
//		}
		
	}

	/**
	 * 快速排序
	 * @param array 数组
	 */
	private static void quickSort(int[] array) {
		quickSort(array,0,array.length-1);
		printArr(array);
	}

	/**
	 * 快速排序。排start到end
	 * @param array 数组
	 * @param start 起始
	 * @param end 结束
	 */
	private static void quickSort(int[] array, int start, int end) 
	{
		if(start>end){
			return;
		}

        int base = array[start];
        int left = start;
        int right = end;
		
		//哨兵相遇
		while(right!=left){
			
			//右侧哨兵先走，找到第一个比base小的数
			while(right>left&&array[right]>=base){
				right--;
			}
			//左侧，找到第一个比base大的数
			while(right>left&&array[left]<=base){
				left++;
			}
			
			//将两个数交换
			if(left<right){
				int temp=array[left];
				array[left]=array[right];
				array[right]=temp;
			}
		}
		
		//此时left==right，交换base与array[left]
		array[start]=array[left];
		array[left]=base;
		
		quickSort(array,start,left-1);
		quickSort(array,left+1,end);
		
	}
	
	/**
	 * 插入排序
	 * 插入排序的基本操作就是将一个数据插入到已经排好序的有序数据中，
	 * 从而得到一个新的、个数加一的有序数据，算法适用于少量数据的排序，时间复杂度为O(n^2)。
	 * 算法时间复杂度O(n2)
	 * @param array 数组
	 */
    private static void insertionSort(int[] array)
    {
        for (int i = 1; i < array.length; i++)
        {
            int tmp = array[i];
            int j = i - 1;
            while (j >= 0 && tmp < array[j])
            {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = tmp;
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
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
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

            int tmp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = tmp;
		}
		
		printArr(array);
	}

	/**
	 * 计数排序
	 * @param array 数组
	 * @return 数组
	 */
    public static int[] countSort(int[] array){
        int b[] = new int[array.length];
        //先找数组中的最大值和最小值
        int max = array[0];
        int min = array[0];
        for(int i:array){
            if(i>max){
                max=i;
            }
            if(i<min){
                min=i;
            }
        }
        
        //这里k的大小是要排序的数组中，元素大小的极值差+1
        int k=max-min+1;
        int c[]=new int[k];
        for(int i=0;i<array.length;++i){
            c[array[i]-min]+=1;//优化过的地方，减小了数组c的大小
        }
        for(int i=1;i<c.length;++i){
            c[i]=c[i]+c[i-1];
        }
        for(int i=array.length-1;i>=0;--i){
            b[--c[array[i]-min]]=array[i];//按存取的方式取出c的元素
        }
        printArr(b);
        return b;
    }
	
	/**
	 * 打印数组
	 * @param array 数组
	 */
	private static void printArr(int[] array)
	{
		for (int i : array) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
}
