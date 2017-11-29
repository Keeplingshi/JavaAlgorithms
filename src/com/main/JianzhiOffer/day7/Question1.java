package com.main.JianzhiOffer.day7;

import java.util.Iterator;
import java.util.Stack;

/**
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。
 * 例如序列1,2,3,4,5是某栈的压入顺序，序列4，5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 * @author chenbin
 *
 */
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] pushA={1,2,3,4,5};
		int [] popA={4,5,3,2,1};
		
		System.out.println(IsPopOrder(pushA,popA));
	}

	/**
	 * 如果下一个弹出的数字刚好在栈顶，则直接弹出，
	 * 如果下一个弹出的数字不在栈顶，则将没有压入栈的数字压入直到把下一个需要弹出的数字压入栈顶位置，
	 * 如果所有数字都入栈，且没有找到需要弹出的数字，则返回false
	 * @param pushA
	 * @param popA
	 * @return
	 */
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        
    	Stack<Integer> stack = new Stack<Integer>();
    	
    	int j=0;
    	for(int i=0;i<popA.length;i++)
    	{
    		int requirePop=popA[i];
    		while(stack.isEmpty()||stack.peek()!=requirePop)
    		{
    			if(j==pushA.length){
    				break;
    			}
    			stack.push(pushA[j]);
    			j++;
    		}
    		
    		//如果是栈顶，弹出，如果不是，下一个循环
    		if(stack.peek()==requirePop){
    			stack.pop();
    		}
    	}
    	
    	if(stack.isEmpty()&&j==pushA.length){
    		return true;
    	}
    	
    	return false;
    }
    
    public static void printStack(Stack<Integer> stack)
    {
    	System.out.print("stack-- ");
        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext())
        {
            int tmp = iterator.next();
            System.out.print(tmp+" ");
        }
        System.out.println();
    }
	
}
