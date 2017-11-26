package com.main.day4;

/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 * @author chenbin
 *
 */
public class Question4 {

	public static void main(String[] args) {

	}

    public ListNode Merge(ListNode list1,ListNode list2) {
        
    	ListNode list,node;		//保证list的第一个小于或等于node
    	if(list1.val>list2.val){
    		list=list2;
    		node=list1;
    	}else{
    		list=list1;
    		node=list2;
    	}
    	
    	while(true)
    	{
    		
    	}
    	
    }
    
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
	
}
