package com.main.jianzhioffer2.day6;

/**
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 * 
 * @author Administrator
 *
 */
public class Question6 {

	public void Mirror(TreeNode root) 
	{
		if(root==null){
			return;
		}
		
		TreeNode left=root.left;
		TreeNode right=root.right;
		root.left=right;
		root.right=left;
		Mirror(root.left);
		Mirror(root.right);
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
