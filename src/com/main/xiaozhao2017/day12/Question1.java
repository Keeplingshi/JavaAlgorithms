package com.main.xiaozhao2017.day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 	题目描述
		考拉有n个字符串字符串，任意两个字符串长度都是不同的。考拉最近学习到有两种字符串的排序方法： 1.根据字符串的字典序排序。例如：
		"car" < "carriage" < "cats" < "doggies < "koala"
		2.根据字符串的长度排序。例如：
		"car" < "cats" < "koala" < "doggies" < "carriage"
		考拉想知道自己的这些字符串排列顺序是否满足这两种排序方法，考拉要忙着吃树叶，所以需要你来帮忙验证。
	输入描述:
		输入第一行为字符串个数n(n ≤ 100)
		接下来的n行,每行一个字符串,字符串长度均小于100，均由小写字母组成
	输出描述:
		如果这些字符串是根据字典序排列而不是根据长度排列输出"lexicographically",
		如果根据长度排列而不是字典序排列输出"lengths",
		如果两种方式都符合输出"both"，否则输出"none"
	示例1
	输入
		3
		a
		aa
		bbb
	输出
		both

 * @author Administrator
 *
 */
public class Question1 {

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for(int i=0;i<n;i++){
        	arr[i] = br.readLine();
        }
		
		boolean a=islexicographically(arr);
		boolean b=islengths(arr);
		if(a&&b)
		{
			System.out.println("both");
		}else if(a&&!b){
			System.out.println("lexicographically");
		}else if(!a&&b){
			System.out.println("lengths");
		}else{
			System.out.println("none");
		}
		
		
	}

	/**
	 * 是否根据长度排序
	 * @param arr
	 * @return
	 */
	private static boolean islengths(String[] arr) 
	{
		boolean flag=true;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i].length()>=arr[i+1].length()){
				flag=false;
				break;
			}
		}
		
		return flag;
	}

	/**
	 * 是否为字典序
	 * @param arr
	 * @return
	 */
	private static boolean islexicographically(String[] arr) 
	{
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i+1].compareTo(arr[i])<=0)
			{
				return false;
			}
		}
		return true;
	}


	
	
	
}
