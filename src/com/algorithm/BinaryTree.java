package com.algorithm;

import java.util.ArrayList;

/**
 * 二叉树相关算法
 * @author Administrator
 *
 */
public class BinaryTree {

	
	public static void main(String[] args)
	{
		TreeNode node=new BinaryTree().init();
		theFirstTraversal(node);
		System.out.println();
		theInOrderTraversal(node);
		System.out.println();
		thePostOrderTraversal(node);
	}
	
    public TreeNode init() {//注意必须逆序建立，先建立子节点，再逆序往上建立，因为非叶子结点会使用到下面的节点，而初始化是按顺序初始化的，不逆序建立会报错  
    	TreeNode J = new TreeNode(8, null, null);  
        TreeNode H = new TreeNode(4, null, null);  
        TreeNode G = new TreeNode(2, null, null);  
        TreeNode F = new TreeNode(7, null, J);  
        TreeNode E = new TreeNode(5, H, null);  
        TreeNode D = new TreeNode(1, null, G);  
        TreeNode C = new TreeNode(9, F, null);  
        TreeNode B = new TreeNode(3, D, E);  
        TreeNode A = new TreeNode(6, B, C);  
        return A;   //返回根节点  
    }
	
    /**
     * 二叉树前序遍历，递归方法,  root->left->right
     * @param root
     */
    public static void theFirstTraversal(TreeNode root)
    {
    	if(root==null){
    		return;
    	}
    	
    	printTreeNode(root);
    	theFirstTraversal(root.left);
    	theFirstTraversal(root.right);
    }
	
    /**
     * 二叉树中序遍历，递归方法,  left->root->right
     * @param root
     */
    public static void theInOrderTraversal(TreeNode root)
    {
    	if(root==null){
    		return;
    	}
    	
    	theInOrderTraversal(root.left);
    	printTreeNode(root);
    	theInOrderTraversal(root.right);
    }

    /**
     * 二叉树后序遍历，递归方法,  left->right->root
     * @param root
     */
    public static void thePostOrderTraversal(TreeNode root)
    {
    	if(root==null){
    		return;
    	}
    	
    	thePostOrderTraversal(root.left);
    	thePostOrderTraversal(root.right);
    	printTreeNode(root);
    }

    
    /**
     * 二叉树
     * @author Administrator
     *
     */
	public class TreeNode
	{
		int value;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(int value, TreeNode left, TreeNode right) {
			super();
			this.value = value;
			this.left = left;
			this.right = right;
		}

		public TreeNode getLeft() {
			return left;
		}

		public void setLeft(TreeNode left) {
			this.left = left;
		}

		public TreeNode getRight() {
			return right;
		}

		public void setRight(TreeNode right) {
			this.right = right;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}
		
	}
	
	private static void printTreeNode(TreeNode node) {
		System.out.print(node.value+" ");
	}
	
}
