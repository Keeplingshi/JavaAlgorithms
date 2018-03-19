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
//		Sort.mergeSort(array);
//		Sort.quickSort(array);
		Sort.countSort(array);
	}
	
	/**
	 * 计数排序
	 * @param a
	 * @return
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
	 * 归并排序
	 * @param array
	 */
	private static void mergeSort(int[] array) 
	{
		mergeSort(array,0,array.length-1);
		printArr(array);
	}

	/**
	 * 归并排序
	 * @param array
	 * @param start
	 * @param end
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
	 * 归并排序，将start到end之间的数排序，其中start到mid与mid到end之间都是已排好序的
	 * @param array
	 * @param start
	 * @param mid
	 * @param end
	 */
	private static void mergeSort(int[] array, int start, int mid, int end) 
	{
		int arrtmp[]=new int[end-start+1];
		int left=start;		//左指针起点
		int right=mid+1;	//右指针起点
		int k=0;
		
		while(left<=mid&&right<=end)
		{
			if(array[left]<=array[right]){
				arrtmp[k++]=array[left++];
			}else{
				arrtmp[k++]=array[right++];
			}
		}
		
		//将剩余数组放入arrtmp数组中
		while(left<=mid){
			arrtmp[k++]=array[left++];
		}
		while(right<=end){
			arrtmp[k++]=array[right++];
		}
		
		for(int i=0;i<arrtmp.length;i++){
			array[start+i]=arrtmp[i];
		}
		
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
	 * 快速排序
	 * @param array
	 * @param left
	 * @param right
	 */
	private static void quickSort(int[] array, int left, int right) 
	{
		if(left>right){
			return;
		}
		int base=array[left];
		int i=left;
		int j=right;
		
		while(i!=j)
		{
			//哨兵先从右侧开始走，找到第一个小于基准base的数
			while(array[j]>=base&&i<j){
				j--;
			}
			//哨兵从左侧开始走，找到第一个大于基准base的数
			while(array[i]<=base&&i<j){
				i++;
			}
			
			//交换两个哨兵位置
			if(i<j){
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
		
		//此时i==j，哨兵相遇，相遇位置与基准交换，则基准左侧都小于基准，右侧都大于基准
		array[left]=array[i];
		array[i]=base;
		
		quickSort(array,left,i-1);
		quickSort(array,i+1,right);
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
