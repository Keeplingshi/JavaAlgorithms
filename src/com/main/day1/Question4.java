package com.main.day1;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 * @author chenbin
 *
 */
public class Question4 {

	public static void main(String[] args) {
		int [] pre={1,2,4,7,3,5,6,8};
		int [] in={4,7,2,1,5,3,8,6};
		
		boolean b=true?false:true==true?false:true;
		System.out.println(b);
	}
	
	/**
	 * 重建二叉树
	 * @param pre
	 * @param in
	 * @return
	 */
	public TreeNode reConstructBinaryTree(int [] pre,int [] in) 
	{
		return null;
	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
}
