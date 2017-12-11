package com.main.JianzhiOffer.day15;

import java.util.ArrayList;

/**
 * 一个链表中包含环，请找出该链表的环的入口结点。
 * 
 * @author chenbin
 *
 */
public class Question4 {

	public static void main(String[] args) {

	}
	
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        ArrayList<ListNode> list=new ArrayList<>();
        while(true)
        {
        	if(pHead==null){
        		break;
        	}
        	if(list.contains(pHead)){
        		return pHead;
        	}else{
        		list.add(pHead);
        	}
        	pHead=pHead.next;
        }
    	return null;
    }

	public class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}
}
