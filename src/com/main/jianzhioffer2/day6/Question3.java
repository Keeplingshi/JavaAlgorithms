package com.main.jianzhioffer2.day6;

/**
 * 输入一个链表，反转链表后，输出链表的所有元素。
 * @author Administrator
 *
 */
public class Question3 {

    public ListNode ReverseList(ListNode head) {

        if(head==null){
        	return null;
        }
        
        ListNode pre = null;
        ListNode next = null;
        
        //1->2->3 变 3->2->1
        while(head!=null)
        {
        	next=head.next;
        	head.next=pre;
        	pre=head;
        	head=next;
        }
        
        return pre;
    }
    
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
