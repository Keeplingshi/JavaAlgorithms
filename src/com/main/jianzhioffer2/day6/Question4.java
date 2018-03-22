package com.main.jianzhioffer2.day6;

/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 * @author Administrator
 *
 */
public class Question4 {

	public static void main(String[] args)
	{
		ListNode list1=null;
		
	}
	
    public ListNode Merge(ListNode list1,ListNode list2) 
    {
    	if(list1==null){
    		return list2;
    	}
    	if(list2==null)
    	{
    		return list1;
    	}
    	
        ListNode list=null;
        if(list1.val>list2.val){
        	list=list2;
        	list2=list2.next;
        }else{
        	list=list1;
        	list1=list1.next;
        }
        
        ListNode head=list;
        
        while(list1!=null||list2!=null)
        {
        	if(list1==null||list1.val>list2.val){
        		list.next=list2;
        		list2=list2.next;
        		list=list.next;
        	}else{
        		list.next=list1;
        		list1=list1.next;
        		list=list.next;
        	}
        	
//        	if(list2==null){
//        		list.next=list1;
//        		list1=list1.next;
//        		list=list.next;
//        		continue;
//        	}
//        	
//        	if(list1.val>list2.val)
//        	{
//        		list.next=list2;
//        		list2=list2.next;
//        		list=list.next;
//        	}else{
//        		list.next=list1;
//        		list1=list1.next;
//        		list=list.next;
//        	}
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
