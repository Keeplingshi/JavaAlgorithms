package com.main.jianzhioffer2.day4;

import java.util.Stack;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 * @author Administrator
 *
 */
public class Question1 {

	Stack<Integer> stack=new Stack<>();
	
    public void push(int node) {
    	stack.push(node);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.elementAt(0);
    }
    
    public int min() {
        int min=stack.elementAt(0);
        Stack<Integer> stack2=new Stack<>();
        
        while(!stack.isEmpty())
        {
        	int tmp=stack.pop();
        	min=min<tmp?min:tmp;
        	stack2.push(tmp);
        }
        	
        while(!stack2.isEmpty())
        {
        	stack.push(stack2.pop());
        }
        return min;
    }
	
}
