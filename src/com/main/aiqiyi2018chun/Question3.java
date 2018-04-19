package com.main.aiqiyi2018chun;

import java.util.ArrayList;
import java.util.HashSet;
/*
3 5
0 3
0 3
0 3
*/
import java.util.Scanner;
import java.util.Set;

public class Question3 {

//    static int n;  
    static int m;  
    static int[] arr;
    
    static ArrayList<ArrayList<Integer>> list=new ArrayList<>();
    
    public static void main(String[] args) { 
    	
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        m=sc.nextInt();
        
        int l[]=new int[n];
        int r[]=new int[n];
        for(int i=0;i<n;i++)
        {
        	l[i]=sc.nextInt();
        	r[i]=sc.nextInt();
        }
       
        arr=new int[m];  
        for (int i = 1; i <= m; i++) {  
            computer(0,i);  
        }
         
        int result=0;
        for(ArrayList<Integer> t_list:list)
        {
        	if(t_list.size()>n){
        		continue;
        	}
        	
        	ArrayList<Integer> temp=new ArrayList<>();
        	boolean flag=true;
        	for(int i:t_list){
        		for(int j=0;j<n;j++){
        			if(l[j]>i||r[j]<i){
        				flag=false;
        				break;
        			}
        		}
        		temp.add(i);
        	}
        	if(!flag){
        		continue;
        	}
        	
        	for(int i=0;i<n-temp.size();i++)
        	{
        		temp.add(0);
        	}
        	
        	Set<Integer> set=new HashSet<>();
        	for(int i:temp){
        		set.add(i);
        	}
        	
        	int a=set.size();
        	int res=getNum(n,a);
        	result+=res;
        	
        }
        
        System.out.println(result);
    }  
    
    public static int getNum(int a,int b)
    {
    	int res=1;
    	if(a==b){
    		for(int i=1;i<=a;i++){
    			res*=i;
    		}
    	}else{
    		for(int i=b+1;i<=a;i++){
    			res*=i;
    		}
    	}
    	return res;
    }
    
    
    public static void computer(int time,int n){  
        if(time>=n){  
            if(getSum(n)==m){  
                printf(n);  
            }  
            return;  
        }  
          
        for (int i = 0; i < m; i++) {  
            arr[time]=i+1;  
            if(time>0&&arr[time]<arr[time-1]){  
            }else{  
                computer(time+1,n);  
            }  
              
        }  
    }  
    public static void printf(int n){ 
    	ArrayList<Integer> temp=new ArrayList<>();
        for (int i = 0; i < n; i++) {  
        	temp.add(arr[i]); 
        }  
        list.add(new ArrayList<>(temp));
    }  
    public static int getSum(int n){  
        int sum=0;  
        for (int i = 0; i < n; i++) {  
            sum+=arr[i];  
        }  
        return sum;  
    }
	

}
