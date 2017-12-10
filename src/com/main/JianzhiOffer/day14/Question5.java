package com.main.JianzhiOffer.day14;

/**
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
 * @author chenbin
 *
 */
public class Question5 {

	public static void main(String[] args) {

		int[] A={1,2,3,4,5};
		Question5 question5=new Question5();
		int[] B=question5.multiply(A);
		for(int i=0;i<B.length;i++)
		{
			System.out.print(B[i]+"\t");
		}
	}

	/**
	 * 分析：B[i]=A数组中除了A[i]之外所有数的乘积
	 * 
	 * 正方形，对角线为1，将其他格用A[i]填充
	 * @param A
	 * @return
	 */
    public int[] multiply(int[] A) {
    	if(A.length==0||A.length==1){
    		return new int[0];
    	}
    	
    	int[] downTriangle=new int[A.length];
    	int[] upTriangle=new int[A.length];
    	
    	downTriangle[0]=1;
    	downTriangle[1]=A[0];
    	for(int i=2;i<A.length;i++)
    	{
    		downTriangle[i]=downTriangle[i-1]*A[i-1];
    	}
    	
    	upTriangle[A.length-1]=1;
    	upTriangle[A.length-2]=A[A.length-1];
    	for(int i=A.length-2;i>=0;i--)
    	{
    		upTriangle[i]=upTriangle[i+1]*A[i+1];
    	}
    	
    	int[] result=new int[A.length];
    	for(int i=0;i<A.length;i++)
    	{
    		result[i]=downTriangle[i]*upTriangle[i];
    	}
    	
    	return result;
    }
	
}
