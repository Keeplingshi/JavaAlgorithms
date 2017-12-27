package com.main.dynamic_programming;

/**
 * 对于一个数字序列，请设计一个复杂度为O(nlogn)的算法，返回该序列的最长上升子序列的长度，
 * 这里的子序列定义为这样一个序列U1，U2...，其中Ui < Ui+1，且A[Ui] < A[Ui+1]。
 * 给定一个数字序列A及序列的长度n，请返回最长上升子序列的长度。

	测试样例：
	[2,1,4,3,1,5,6],7
	返回：4
 * @author chenbin
 *
 */
public class AscentSequence {

	public static void main(String[] args) {
		int[] A={2,1,4,3,1,5,6};
		int n=7;
		System.out.println(new AscentSequence().findLongest(A, n));
	}

	/**
	 * 采用一个数组temp[]保存 以当前元素结尾的最长递增子序列长度，最后求出全局最优解。
	 * 更新最长递增子序列的条件：A[i]>A[j]  (i>j) 且前一个递增序列长度大于等于当前递增序列长度
	 * @param A
	 * @param n
	 * @return
	 */
    public int findLongest2(int[] A, int n) {
    	if(n==0){
    		return 0;
    	}
    	int max=0;
    	int[] temp=new int[n];
    	temp[0]=1;
        for(int i=1;i<n;i++)
        {
        	temp[i]=1;
        	for(int j=0;j<i;j++)
        	{
        		if(A[i]>A[j]&&temp[i]<=temp[j]){
        			temp[i]=temp[j]+1;
        		}
        	}
        	max=temp[i]>max?temp[i]:max;
        }
        return max;
    }
    
    /**
     * 【改进】考虑到在计算每个temp[i]时都要找到最大的，由于数组无序，所以每次都需要顺序查找。
     * 可以让数组有序那么就可以使用二分查找，从而算法复杂度就可以降到O(NlogN)。
     * 可以采用一个数组存储最大递增子序列的最末元素：即：B[temp[j]]=aj。
     * 在数组B中用二分查找法找到满足j<i且B[f(j)]=aj<ai的最大的j,并将B[f[j]+1]置为ai。
     * @param A
     * @param n
     * @return
     */
    public int findLongest(int[] A, int n)
    {
        /*  
         * 在计算每一个f(i)时，都要找出最大的f(j)(j<i)来，由于f(j)没有顺序，只能顺序查找满足aj<ai最大的f(j)，  
         * 如果能将让f(j)有序，就可以使用二分查找，这样算法的时间复杂度就可能降到O(nlogn)。  
         * 于是想到用一个  
         * 数组B来存储“子序列的”最大递增子序列的最末元素，  
         * 即有B[f(j)] = aj  
         *  在计算f(i)时，在数组B中用二分查找法找到满足j<i且B[f(j)]=aj<ai的最大的j,并将B[f[j]+1]置为ai。  
         */   
        int[] temp=new int[n+1];  
        temp[0]=-100;
        temp[1]=A[0];
        int max=1;  
        int p,r,m;//p,r,m分别为二分查找的上界，下界和中点；  
        for(int i=1;i<n;i++)  
        {  
            p=0;r=max;  
            while(p<=r)//二分查找最末元素小于ai+1的长度最大的最大递增子序列；  
            {  
               m = (p+r)/2;  
               if(temp[m]<A[i]) {
            	   p=m+1;  
               }else {
            	   r=m-1;  
               }
            }  
            temp[p] = A[i];//将长度为p的最大递增子序列的当前最末元素置为ai+1;  
            if(p>max) {
            	max++;//更新当前最大递增子序列长度；     
            }
        }
    	return max;
    }
	
}
