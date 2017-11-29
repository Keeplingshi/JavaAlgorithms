package com.main.JianzhiOffer.day6;

import java.util.Iterator;
import java.util.Stack;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 * @author chenbin
 *
 */
public class Question3 {

	public static void main(String[] args) {

	}

	
	Stack<Integer> stack = new Stack<Integer>();
    public void push(int node) {
    	stack.push(node);
    }
    
    public void pop() {
    	stack.pop();
    }
    
    public int top() {
        return stack.elementAt(0);
    }
    
    /**
     * 关键点在于保持栈的结构，使用stack.pop()之后，栈结构就变了,所以采用iterator的方式
     * @return
     */
    public int min() {
        int min = top();
        int tmp = 0;
        
        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()){
            tmp = iterator.next();
            if (min>tmp){
                min = tmp;
            }
        }
        return min;
    }
    
    public int min2() {
        int min = top();
        int tmp = 0;
        Stack<Integer> stack2 = new Stack<Integer>();
        while(!stack.isEmpty())
        {
        	tmp=stack.pop();
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
