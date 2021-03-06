package com.main.JianzhiOffer.day16;

/**
 * 请实现一个函数，用来判断一颗二叉树是不是对称的。
 * 注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 * @author chenbin
 *
 */
public class Question2 {

	public static void main(String[] args) {

	}

	/**
	 * 
	 * @param pRoot
	 * @return
	 */
    public boolean isSymmetrical(TreeNode pRoot)
    {
    	if(pRoot==null){
    		return true;
    	}
    	
    	return isSymmetrical(pRoot.left,pRoot.right);
    }
    
    public boolean isSymmetrical(TreeNode left,TreeNode right)
    {
    	if(left==null&&right==null)
    	{
    		return true;
    	}
    	
    	if(left!=null&&right!=null)
    	{
    		return left.val==right.val&&isSymmetrical(left.left,right.right)&&isSymmetrical(left.right,right.left);
    	}
    	return false;
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
