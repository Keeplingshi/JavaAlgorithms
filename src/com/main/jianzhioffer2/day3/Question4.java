package com.main.jianzhioffer2.day3;

/**
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 * @author Administrator
 *
 */
public class Question4 {

	/**
	 * 平衡二叉树又被称为AVL树（有别于AVL算法），且具有以下性质：它是一 棵空树或它的左右两个子树的高度差的绝对值不超过1，并且左右两个子树都是一棵平衡二叉树
	 * 
	 * @param root
	 * @return
	 */
    public boolean IsBalanced_Solution(TreeNode root) 
    {
    	if(root==null)
    	{
    		return true;
    	}
    	
    	if(IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right)&&Math.abs(treeHeight(root.left)-treeHeight(root.right))<=1)
    	{
    		return true;
    	}
    	
		return false;
    }
    
    /**
     * 树的高度
     * @param root
     * @return
     */
    public static int treeHeight(TreeNode root)
    {
    	if(root==null){
    		return 0;
    	}
    	
    	int left=treeHeight(root.left);
    	int right=treeHeight(root.right);
    	
    	return left>right?left+1:right+1;
    }
    
    public class TreeNode
    {
    	public TreeNode left;
    	public TreeNode right;
    	public int val;
		
    	public TreeNode()
    	{
    		
    	}
    	
    	public TreeNode(TreeNode left, TreeNode right, int val) {
			super();
			this.left = left;
			this.right = right;
			this.val = val;
		}
    }
}
