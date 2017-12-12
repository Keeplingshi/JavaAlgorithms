package com.main.JianzhiOffer.day16;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印， 第三行按照从左到右的顺序打印，其他行以此类推。
 * 
 * @author chenbin
 *
 */
public class Question3 {

	public static void main(String[] args) {

	}

	/**
	 * 分析：
	 * 
	 * @param pRoot
	 * @return
	 */
	public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		
		ArrayList<ArrayList<Integer>> reList=new ArrayList<ArrayList<Integer>>();
		
		if(pRoot==null)
		{
			return reList;
		}
		
		//存奇数层
		Stack<TreeNode> s1=new Stack<>();
		//存偶数层
		Stack<TreeNode> s2=new Stack<>();
		
		s1.push(pRoot);
		
		while(!s1.isEmpty()||!s2.isEmpty())
		{
			if(!s1.isEmpty())
			{
				ArrayList<Integer> aList=new ArrayList<>();
				while(!s1.isEmpty())
				{
					TreeNode p=s1.pop();
					//偶数层，从右往左输出，栈先进后出
					if(p.left!=null){
						s2.add(p.left);
					}
					if(p.right!=null){
						s2.add(p.right);
					}
					aList.add(p.val);
				}
				reList.add(aList);
				
			}else{
				ArrayList<Integer> aList=new ArrayList<>();
				while(!s2.isEmpty())
				{
					TreeNode p=s2.pop();
					//偶数层，从右往左输出，栈先进后出
					if(p.right!=null){
						s1.add(p.right);
					}
					if(p.left!=null){
						s1.add(p.left);
					}
					aList.add(p.val);
				}
				reList.add(aList);
			}
		}
		return reList;
	}

	public class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;
		}
	}
}
