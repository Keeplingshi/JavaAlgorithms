package com.main.JianzhiOffer.day1;

import java.util.ArrayList;

/**
 * 输入一个链表，从尾到头打印链表每个节点的值。
 * @author chenbin
 *
 */
public class Question3 {

	public static void main(String[] args) {

	}
	
	/**
	 * 打印链表
	 */
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		ListNode pre=null;
		ListNode next=null;
		while(listNode!=null){
			next=listNode.next;
			listNode.next=pre;
			pre=listNode;
			listNode=next;
		}
		while(pre!=null){
			list.add(pre.val);
			pre=pre.next;
		}
		return list;
	}
	
	
	/*
	 * 链表结构
	 */
	class ListNode
	{
		int val;
		ListNode next;
		
		ListNode(int val) 
		{
			this.val=val;
		}
	}
}
