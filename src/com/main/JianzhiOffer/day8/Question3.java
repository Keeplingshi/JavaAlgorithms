package com.main.JianzhiOffer.day8;

import java.util.ArrayList;

/**
 * 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * @author chenbin
 *
 */
public class Question3 {

	public static void main(String[] args) 
	{

	}
	
    private ArrayList<ArrayList<Integer>> listAll = new ArrayList<ArrayList<Integer>>();
    private ArrayList<Integer> list = new ArrayList<Integer>();

	/**
	 * 
	 * @param root
	 * @param target
	 * @return
	 */
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) 
    {
    	if(root==null){
    		return listAll;
    	}
    	list.add(root.val);
    	target-=root.val;
    	if(target==0&&root.left==null&&root.right==null)
    	{
    		listAll.add(new ArrayList<Integer>(list));
    	}
    	FindPath(root.left,target);
    	FindPath(root.right,target);
    	list.remove(list.size()-1);
    	return listAll;
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
