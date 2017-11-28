package com.main.JianzhiOffer.day6;

/**
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
	输入描述:
	二叉树的镜像定义：源二叉树 
	    	    8
	    	   /  \
	    	  6   10
	    	 / \  / \
	    	5  7 9 11
	    	镜像二叉树
	    	    8
	    	   /  \
	    	  10   6
	    	 / \  / \
	    	11 9 7  5
 * @author chenbin
 *
 */
public class Question1 {

	public static void main(String[] args) {

	}

	/**
	 * 求镜像二叉树
	 * 1、如果root节点的左右子节点都为null，返回root自身
	 * 2、如果root节点的左右子节有一个不为null，交换左右子树
	 * @param root
	 */
    public void Mirror(TreeNode root) 
    {
    	if(root==null){
    		return;
    	}
    	//交换左右子树
    	TreeNode tmp=root.right;
    	root.right=root.left;
    	root.left=tmp;
    	//递归，子树
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
