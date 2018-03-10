package com.main.jianzhioffer2.day6;

import java.util.ArrayList;

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 * @author Administrator
 *
 */
public class Question2 {
	
    public ListNode FindKthToTail(ListNode head,int k) {

    	ListNode node=head;
    	int count=0;
    	while(node!=null){
    		node=node.next;
    		count++;
    	}
    	
    	if(count<k){
    		return null;
    	}
    	
    	for(int i=0;i<count-k;i++){
    		head=head.next;
    	}
    	
    	return head;
    }
    
    
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
