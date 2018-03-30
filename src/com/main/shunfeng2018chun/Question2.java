package com.main.shunfeng2018chun;

import java.util.Scanner;

/**
 * 木木一不小心不记得电脑的锁屏密码了，木木很着急，所以找到安安来解决，因为密码是安安帮木木设置的。
	设木木的密码为B数列，安安的密码为A数列，A,B数列的长度都为n，并满足以下条件：
	对于安安密码中的第i个数Ai ，有：Ai = Bi - Bi+1  + Bi+2 - Bi+3....
	现在，知道安安的密码，即A数列，求木木的密码。
	
	输入
		第一行输入一个整数n，(2 ≤ n ≤ 100 000) ，代表密码的长度。
		接下来n行，每行输入一个整数Ai，(按下标字典序输入)代表安安的密码，即A数列( -109 ≤ Ai≤ 109)。
		
	输出
		输出n行，每行一个整数，（按下标字典序输出）代表木木的密码，即B数列。
	
	
	样例输入
		5
		3
		-2
		-1
		5
		6
	
	样例输出
		1
		-3
		4
		11
		6
 * @author Administrator
 *
 */
public class Question2 {


/*请完成下面这个函数，实现题目要求的功能
当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^ 
******************************开始写代码******************************/
    static int[] solve(int[] a) {
    	
    	int n=a.length;
    	int array[]=new int[n];
    	
    	for(int i=0;i<n;i++)
    	{
    		if(i==n-1){
    			array[i]=a[i];
    		}else{
    			array[i]=a[i]+a[i+1];
    		}
    	}
    	
    	return array;

    }
/******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] res;
            
        int _a_size = 0;
        _a_size = Integer.parseInt(in.nextLine().trim());
        int[] _a = new int[_a_size];
        int _a_item;
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(in.nextLine().trim());
            _a[_a_i] = _a_item;
        }
  
        res = solve(_a);
        for(int res_i=0; res_i < res.length; res_i++) {
            System.out.println(String.valueOf(res[res_i]));
        }

    }
}
