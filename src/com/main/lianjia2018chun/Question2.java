package com.main.lianjia2018chun;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 	在迷迷糊糊的大草原上，小红捡到了n根木棍，第i根木棍的长度为i，小红现在很开心。
	她想选出其中的三根木棍组成美丽的三角形。
	但是小明想捉弄小红，想去掉一些木棍，使得小红任意选三根木棍都不能组成三角形。
	请问小明最少去掉多少根木棍呢？

	输入
		本题包含若干组测试数据。
		对于每一组测试数据。
		第一行一个n，表示木棍的数量。
		满足 1<=n<=100000
	
	输出
		输出最少数量
	
	样例输入
		4
	
	样例输出
		1

1,2,3,....2013
这样的题,还得分析才好.
不能构成三角形,意味着两个数的和不大于第三个数.
也就是说,如果想剩下的数多,则要尽量从小的留.
1 2 3 5 8 13 21 看出规律了么?就是前两个数求和an=a(n-10+a(n-2)
按照规律写下去,就是
34 55 89 144 233 377 610 987 1597
当然,具体的数,可以变动一下.
数一数,一共是16个数.
 * @author Administrator
 *
 */
public class Question2 {

	public static void main(String[] args) {

		int []array={1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181,6765,10946,17711,28657,46368,75025,121393};

		Scanner sc=new Scanner(System.in);
	    
	    while(sc.hasNext())
	    {
	    	int result=0;
	    	int n=sc.nextInt();
	        for(int i = 0;i<array.length;i++)
	        {
	            if(array[i]>n){
	            	break;
	            }
	            result =i;  
	        }
	        if(n==0) {
	        	result=0;
	        }
	        else {
	        	result++;
	        }
	        System.out.println(n-result);
	    }

	}

}
