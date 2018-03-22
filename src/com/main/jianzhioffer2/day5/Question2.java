package com.main.jianzhioffer2.day5;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 * 
 * @author Administrator
 *
 */
public class Question2 {

	ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) 
	{
		ArrayList<ArrayList<Integer>> reList=new ArrayList<>();
		ArrayList<Integer> tmp=new ArrayList<>();
		if(pRoot==null){
			return reList;
		}
		LinkedList<TreeNode> q=new LinkedList<TreeNode>();
		q.add(pRoot);
		
		int now=1,next=0;
		while(!q.isEmpty())
		{
			TreeNode p=q.remove();
			now--;
			tmp.add(p.val);
			
			if(p.left!=null){
				q.add(p.left);
				next++;
			}
			if(p.right!=null)
			{
				q.add(p.right);
				next++;
			}
			
			if(now==0)
			{
				reList.add(new ArrayList<>(tmp));
				tmp.clear();
				now=next;
				next=0;
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
