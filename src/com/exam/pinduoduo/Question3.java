package com.exam.pinduoduo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
5 0
1 2 3
0 4
0 4
0 4
1 2 3



5 0
1 2 3
0 4
0 4
0 4
0
 * @author Administrator
 *
 */
public class Question3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String strarr1[]=str1.split(" ");
		int n=Integer.parseInt(strarr1[0]);
		int m=Integer.parseInt(strarr1[1]);
		
		ArrayList<ArrayList<Integer>> list=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			ArrayList<Integer> tmp=new ArrayList<>();
			String str=sc.nextLine();
			String strarr[]=str.split(" ");
			
			for(String s:strarr){
				tmp.add(Integer.parseInt(s));
			}
			
			list.add(tmp);
		}
		
		ArrayList<Integer> friends=new ArrayList<>();
		ArrayList<Integer> current_user=list.get(m);
		for(Integer i:current_user){
			if(list.get(i).contains(m)){
				friends.add(i);
			}
		}

		int result=-1;
		int count=0;
		
		for(int i=0;i<n;i++)
		{
			if(i==m||friends.contains(i)){
				continue;
			}
			
			int tmp_count=0;
			ArrayList<Integer> tmp_user=list.get(i);
			for(Integer j:tmp_user){
				if(friends.contains(j)){
					tmp_count++;
				}
			}
			
			if(count<tmp_count){
				count=tmp_count;
				result=i;
			}
		}
		
		System.out.println(result);
	}

}
