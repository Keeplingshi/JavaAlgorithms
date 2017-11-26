package com.main.day5;

/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 * @author chenbin
 *
 */
public class Question2 {

	public static void main(String[] args) {

	}
	
	
	/**
	 * 判断过程如下：
	 * 如果root1与root2节点值相同，则接下来同时判断root1左子树是否包含root2左子树，root1右子树是否包含root2右子树
	 * 如果不相同，则分别root1左子树是否包含root2，root1右子树是否包含root2
	 * 直到root2为空，则包含，返回true。若root1为空，则不包含，返回false
	 * @param root1
	 * @param root2
	 * @return
	 */
    public boolean HasSubtree(TreeNode root1,TreeNode root2) 
    {
        
        boolean result=false;
        if(root1!=null&&root2!=null)
        {
        	if(root1.val==root2.val)
        	{
        		result=DoesTree1HasTree2(root1, root2);
        	}
        	if(!result)
        	{
        		result=DoesTree1HasTree2(root1.left, root2);
        	}
        	if(!result)
        	{
        		result=DoesTree1HasTree2(root1.right, root2);
        	}
        }
        
        return result;
    }
    
    public boolean DoesTree1HasTree2(TreeNode root1,TreeNode root2)
    {
    	if(root2==null){
    		return true;
    	}
    	if(root1==null){
    		return false;
    	}
    	if(root1.val!=root2.val)
    	{
    		return false;
    	}
    	return DoesTree1HasTree2(root1.left,root2.left)&&DoesTree1HasTree2(root1.right, root2.right);
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
