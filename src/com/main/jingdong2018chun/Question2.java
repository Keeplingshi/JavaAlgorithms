package com.main.jingdong2018chun;

import java.util.Scanner;

/**
 * 回文子串
 * @author Administrator
 *
 */
public class Question2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		char[] cstr=str.toCharArray();
		
		System.out.println(getResult(cstr));
	}

//    public static int getResult(String str){
//        StringBuilder sb  = new StringBuilder(str);
//        String newStr = sb.reverse().toString();
//        char[] c1 = str.toCharArray();
//        char[] c2 = newStr.toCharArray();
//        int n = str.length();
//        int[][] dp = new int[n+1][n+1];
//        for(int i=1;i<n+1;i++){
//            for(int j=1;j<n+1;j++){
//                if(c1[i-1]==c2[j-1]){ //此处应该减1.
//                    dp[i][j]=dp[i-1][j-1]+1;
//                }else{
//                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
//                }
//            }
//        }
//        return dp[n][n];
//    }
	
	private static int getResult(char[] cstr)
	{
	    int n=cstr.length;
	    int dp[][]=new int[n][n];

	    for(int j=0;j<n;j++)
	    {
	        dp[j][j]=1;
	        for(int i=j-1;i>=0;i--)
	        {
	            dp[i][j]=dp[i+1][j]+dp[i][j-1]-dp[i+1][j-1];
	            if(cstr[i]==cstr[j]){
	            	dp[i][j]+=1+dp[i+1][j-1];
	            }
	        }
	    }
	    return dp[0][n-1];
	}
	
}
