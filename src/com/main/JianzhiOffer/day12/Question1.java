package com.main.JianzhiOffer.day12;

//import com.main.JianzhiOffer.day12.TreeNode;

//import java.math.*;

/**
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 * 
 * 二叉平衡树定义：它是一 棵空树或它的左右两个子树的高度差的绝对值不超过1，并且左右两个子树都是一棵平衡二叉树，
 * 同时，平衡二叉树必定是二叉搜索树，反之则不一定。
 * @author chenbin
 *
 */
public class Question1 {

	public static void main(String[] args) 
	{

	}
	
    public boolean IsBalanced_Solution(TreeNode root) 
    {
    	if(root==null){
    		return true;
    	}
    	int leftHeight=getTreeHeight(root.left);
    	int rightHeight=getTreeHeight(root.right);
    	
    	if(Math.abs(rightHeight-leftHeight)<=1){
    		if(IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right)){
    			return true;
    		}
    	}
    	return false;
    }
    
    /**
     * 获取树的高度
     * @param root
     * @return
     */
    public int getTreeHeight(TreeNode root)
    {
    	if(root==null){
    		return 0;
    	}
    	int leftHeight=getTreeHeight(root.left);
    	int rightHeight=getTreeHeight(root.right);
    	
    	return leftHeight>rightHeight?leftHeight+1:rightHeight+1;
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
