package com.main.JianzhiOffer.day14;

/**
 * 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0
 * 输入描述:
	输入一个字符串,包括数字字母符号,可以为空
        输出描述:
	如果是合法的数值表达则返回该数字，否则返回0
        示例1
        输入
	+2147483647
	    1a33
        输出
	2147483647
	    0
 * 
 * 
 * @author chenbin
 *
 */
public class Question3 {

	public static void main(String[] args) {

		Question3 question3=new Question3();
		System.out.println(question3.StrToInt("1a33"));
	}

    public int StrToInt(String str) {
    	if(str.length()==0){
    		return 0;
    	}
    	
        char[] cstr=str.toCharArray();
        boolean flag=true;
        int start=0;
		if(cstr[0]=='+'){
			flag=true;
			start=1;
		}else if(cstr[0]=='-'){
			flag=false;
			start=1;
		}
        int result=0;
        for(int i=start;i<cstr.length;i++)
        {
        	if(cstr[i]>'0'&&cstr[i]<'9')
        	{
        		result=result*10+cstr[i]-'0';
        	}else{
        		return 0;
        	}
        	
        }
        
        if(!flag){
        	result=-result;
        }
        
        return result;
    }
	
}
