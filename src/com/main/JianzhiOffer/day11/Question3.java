package com.main.JianzhiOffer.day11;

/**
 * 输入两个链表，找出它们的第一个公共结点。
 * @author chenbin
 *
 */
public class Question3 {

	public static void main(String[] args) {

	}
	
	/**
	 * 分析：如果两个链表有公共节点，那么他们一定有相同的尾端，所以让长的先走
	 * 
	 * @param pHead1
	 * @param pHead2
	 * @return
	 */
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
    	int len1=findLenNode(pHead1);
    	int len2=findLenNode(pHead2);
    	
    	if(len1>len2){
    		pHead1=walkStep(pHead1,len1-len2);
    	}else{
    		pHead2=walkStep(pHead2,len2-len1);
    	}
    	
    	while(pHead1!=null){
    		if(pHead1==pHead2){
    			return pHead1;
    		}
    		pHead1=pHead1.next;
    		pHead2=pHead2.next;
    	}
    	return null;
    }
    
    public ListNode walkStep(ListNode pHead, int step)
    {
    	while(step!=0){
    		pHead=pHead.next;
    		step--;
    	}
    	return pHead;
    }
    
    /**
     * 统计链表长度
     * @param pHead
     * @return
     */
    public int findLenNode(ListNode pHead)
    {
    	ListNode current = pHead;
    	int sum=1;
    	while(current!=null){
    		current=current.next;
    		sum++;
    	}
    	return sum;
    }

	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	
}


