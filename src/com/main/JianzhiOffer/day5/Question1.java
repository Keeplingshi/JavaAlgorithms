package com.main.JianzhiOffer.day5;

/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 * @author chenbin
 *
 */
public class Question1 {

	public static void main(String[] args) {

		Question1 question4=new Question1();
		
		
		
//		System.out.println(question4.Merge2().val);
		
	}
	
	public ListNode Merge2(ListNode list1,ListNode list2) {
		
		ListNode mergeNode=new ListNode(0);
		ListNode list=mergeNode;
		
		while(list1!=null&&list2!=null)
		{
			if(list1.val<list2.val)
			{
				list.next=list1;
				list=list.next;		//将自己指向下一个
				list1=list1.next;
			}else{
				list.next=list2;
				list=list.next;
				list2=list2.next;
			}
		}
		
		while(list1!=null)
		{
			list.next=list1;
			list=list.next;
			list1=list1.next;
		}
		
		while(list2!=null)
		{
			list.next=list2;
			list=list.next;
			list2=list2.next;
		}
		
		return mergeNode.next;
		
	}

    public ListNode Merge(ListNode list1,ListNode list2) {
        
    	if(list1==null){
    		return list2;
    	}
    	if(list2==null)
    	{
    		return list1;
    	}
    	
    	ListNode mergeNode=null;
    	if(list1.val<list2.val)
    	{
    		mergeNode=list1;
    		mergeNode.next=Merge(list1.next,list2);
    	}else{
    		mergeNode=list2;
    		mergeNode.next=Merge(list2.next,list1);
    	}
    	return mergeNode;
    }
    
    
    
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
	
}
