package com.main.wangyi2018chun;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		long count=0;
		//如果x<y，
		for(int i=1;i<=n-k;i++){
			count+=i;
		}
		
//		if(n%k<=k){
//			System.out.println(count);
//			return;
//		}
		
		for(int y=k+1;y<=n-k;y++)
		{
			for(int x=y+k;x<=n;x++){
				if(x%y>=k){
					System.out.println(x+" "+y);
					count++;
				}
			}
		}
		
		System.out.println(count);
	}

}

/**

7 2
	5 3
	6 4
	7 4
	7 5
19

8 2
	5 3
	6 4
	7 4
	7 5
	8 3
	8 5
	8 6
28

9 2
	5 3
	6 4
	7 4
	7 5
	8 3
	8 5
	8 6
	9 5
	9 6
	9 7
38


5 2
	2 3
	2 4
	2 5
	3 4
	3 5
	4 5
	5 3
7

4 2
	2 3
	2 4
	3 4
3

6 3
	3 4
	3 5
	3 6
	4 5
	4 6
	5 6
6

7 4
	4 5
	4 6
	4 7
	5 6
	5 7
	6 7
6


7 2
	2 3
	2 4
	2 5
	2 6
	2 7
	3 4
	3 5
	3 6
	3 7
	4 5
	4 6
	4 7
	5 6
	5 7
	6 7
	
	5 3
	6 4
	7 4
	7 5
19

 * 
 */