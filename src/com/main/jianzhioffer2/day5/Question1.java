package com.main.jianzhioffer2.day5;

/**
 * 请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 * @author Administrator
 *
 */
public class Question1 {

	
    boolean isSymmetrical(TreeNode pRoot)
    {
    	if(pRoot==null){
    		return true;
    	}
    	return isSymmetrical(pRoot.left,pRoot.right);
    }
    
    boolean isSymmetrical(TreeNode left,TreeNode right)
    {
    	
    	if(left==null&&right==null){
    		return true;
    	}
    	
    	if(left!=null&&right!=null){
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
