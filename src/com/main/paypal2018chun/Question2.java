package com.main.paypal2018chun;

import java.util.Scanner;
import java.util.Stack;

/**
 * 输入为一个算数表达式的字符串。输出它经过计算之后的结果。如果该字符串不满足算数表达式则输出字符串Error。
	注意：
		0. 输入中的数只有非负整数。小数、负数等均需要输出Error。
		1. 需要支持运算符加、减、乘以及括号。
		2. 运算符的优先级为：括号>加=减>乘。
		3. 支持数与操作符、操作符与操作符之间有任意空格。
		3. 输入和运算过程中不需要考虑整数溢出，用32位的int即可。
	输入描述:
		输入1：123
		输入2：1 23
		输入3：1 + 2 * 3
		输入4：1+(2*3)
	输出描述:
		输出1：123
		输出2：Error
		输出3：9
		输出4：7
	示例1
	输入
		1 + 2 * 3 - (4*5)
	输出
		-51
	说明
	1 + 2 * 3 - (4*5)   =>  1 + 2 * 3 - 20   => 3 * 3 - 20  =>  3 * -17  =>  -51
 * @author Administrator
 *
 */
public class Question2 {

    public static void main(String[] args) {
    	
        Stack<Object> shu = new Stack<Object>();
        Stack<Object> fu = new Stack<Object>();
    	
    	Scanner sc=new Scanner(System.in);
    	String str=sc.nextLine();
    	
    	if(str.contains(".")){
    		System.out.println("Error");
    		return;
    	}
    	
    	char[] cstr=str.toCharArray();
    	for (int i = 0; i < cstr.length; i++)
    	{
    		if(isOperate(cstr[i]))
    		{
                if (cstr[i] == '(') {
                    fu.add(cstr[i]);
                }
                if(cstr[i] == ')'){
                    while ((char) fu.peek() != '(') {
                        shu.add(fu.pop());
                    }
                    if ((char) fu.peek() == '(') {
                        fu.pop();
                    }
                    while (fu.isEmpty() != true) {
                        char temp = (char) fu.pop();
                        fu.add(temp);
                        if (temp == '*') {
                            shu.add(temp);
                            fu.pop();
                        } else {
                            break;
                        }
                    }
                }else if (cstr[i] == '*') {
                    fu.add(cstr[i]);
                }else if (cstr[i] == '+') {
                    fu.add(cstr[i]);
                }else if (cstr[i] == '-') {
                    fu.add(cstr[i]);
                }
    		}else if(isNumber(cstr[i])){
    			shu.add(cstr[i]);
    		}else if(cstr[i]==' '){
    			
    		}else{
        		System.out.println("Error");
        		return;
    		}
    	}
    	
    	if(fu.size()==0){
    		
    		StringBuffer res=new StringBuffer();
    		while(!shu.isEmpty()){
    			Character c=(Character) shu.pop();
    			if(isNumber(c)){
    				res.append(c);
    			}else{
            		System.out.println("Error");
            		return;
    			}
    		}
    		System.out.println(res.reverse());
    		
    	}else{
            while(fu.isEmpty()!=true){
                shu.add(fu.pop());
            }
    		try {
    			int result = getResult(Reverse(shu));
    			System.out.println(result);
    		} catch (Exception e) {
        		System.out.println("Error");
        		return;
    		}
    	}
    	

       
    }

    /**
     * 计算函数
     * @param stack
     * @return
     * @throws Exception
     */
    public static int getResult(Stack<Object> stack) throws Exception{
        Stack<Object>temp=new Stack<Object>();//存放后缀表达式的操作数的栈
        while(stack.isEmpty()!=true){
            if(!isOperate((char)stack.peek())){
                temp.add(stack.pop());
            }else{
                int o1=Integer.parseInt(temp.pop().toString());
                int o2=Integer.parseInt(temp.pop().toString());
                if(stack.isEmpty()!=true){
                    if((char)stack.peek()=='+'){
                        temp.add(o2+o1);
                    }
                    if((char)stack.peek()=='-'){
                        temp.add(o2-o1);
                    }
                    if((char)stack.peek()=='*'){
                        temp.add(o2*o1);
                    }
                    stack.pop();
                }
            }
        }
        return (int) temp.peek();
    }

    public static Stack<Object> Reverse(Stack<Object> shu){
        Stack<Object> reverseStack=new Stack<Object>();
        while(shu.isEmpty()!=true){
            reverseStack.add(shu.pop());
        }
        return reverseStack;
    }
    
    /**
     * 判断是否为数字
     * @param b
     * @return
     */
    public static boolean isNumber(char b)
    {
    	int result=b-'0';
    	if(result>=0&&result<=9){
    		return true;
    	}
    	return false;
    }
    
    /**
     * 判断是否为操作符
     * @param b
     * @return
     */
    public static boolean isOperate(char b) {
    	switch (b) {
			case '(':
			case ')':
			case '+':
			case '-':
			case '*':
				return true;
			default:
				return false;
		}
    }
	
}

