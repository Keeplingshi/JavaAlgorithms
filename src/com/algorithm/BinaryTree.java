package com.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 * 二叉树相关算法
 * 
 * 已知三种遍历的其中两种，求出剩下一种遍历。（如果不知道中序遍历，则无法确定一个唯一树）
 * 已知先序遍历序列和中序遍历序列，求出后序序列   或者   已知中序序列和后序序列 ，求出先序遍历。
 * 经过研究发现，已知先序序列和后序序列，无法唯一确定一棵树，所以就无法得知中序
 * 
 * @author Administrator
 *
 */
public class BinaryTree {

	
	public static void main(String[] args)
	{
		TreeNode node=new BinaryTree().init();
		printTreeByLayer(node);
		
//		System.out.println(getTreeDepth(node));
		
//		printTreeTopToBottom(node);
		
//		theFirstTraversal_Stack(node);
//		theInOrderTraversal_Stack(node);
//		thePostOrderTraversal_Stack(node);
		
//		theFirstTraversal(node);
//		System.out.println();
//		theInOrderTraversal(node);
//		System.out.println();
//		thePostOrderTraversal(node);
	}
	
	/**
	 * 初始化一棵树
	 * @return
	 */
    public TreeNode init() {
    	//注意必须逆序建立，先建立子节点，再逆序往上建立，因为非叶子结点会使用到下面的节点，而初始化是按顺序初始化的，不逆序建立会报错  
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
     * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
     */
    public static void printTreeByLayer(TreeNode root) 
    {
    	ArrayList<ArrayList<Integer>> relist=new ArrayList<>();
    	ArrayList<Integer> tmp=new ArrayList<>();
    	if(root==null){
    		return;
    	}
    	LinkedList<TreeNode> q=new LinkedList<>();
    	q.add(root);
    	int now=1;
    	int next=0;
    	while(!q.isEmpty())
    	{
    		TreeNode node=q.remove();
    		tmp.add(node.value);
    		now--;
    		
    		if(node.left!=null){
    			q.add(node.left);
    			next++;
    		}
    		
    		if(node.right!=null){
    			q.add(node.right);
    			next++;
    		}
    		
    		//说明一层已经结束
    		if(now==0){
    			relist.add(new ArrayList<>(tmp));
    			now=next;
    			next=0;
    			tmp.clear();
    		}
    	}
    	
    	for (ArrayList<Integer> list: relist) {
			printList(list);
		}
    }
    
    /**
     * 输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
     * @param root
     */
    public static int getTreeDepth(TreeNode root)
    {
    	if(root==null){
    		return 0;
    	}
    	
    	int left=getTreeDepth(root.left);
    	int right=getTreeDepth(root.right);
    	return left>right?left+1:right+1;
    }
    
    /**
     * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
     * @param root
     */
    public static void printTreeTopToBottom(TreeNode root) 
    {
    	ArrayList<Integer> list=new ArrayList<>();
    	if(root==null){
    		return;
    	}
    	
    	ArrayList<TreeNode> q=new ArrayList<>();
    	
    	//q的存储顺序为：root,left,right,left_left,left_right,right_left,right_right....
    	//上一层始终在下一层的前面。所以，一直将q的首位元素移除，可以得到打印顺序
    	q.add(root);
    	while(!q.isEmpty())
    	{
    		TreeNode node=q.remove(0);
    		list.add(node.value);
    		
    		if(node.left!=null){
    			q.add(node.left);
    		}
    		if(node.right!=null){
    			q.add(node.right);
    		}
    	}
    	
    	printList(list);
    }
    
    //堆栈方式 前序遍历，中序遍历，后序遍历
	/**
	 * 堆栈方式， 前序遍历    根-->左-->右
	 * @param root
	 */
    public static void theFirstTraversal_Stack(TreeNode root)
	{
    	ArrayList<Integer> list=new ArrayList<>();
		Stack<TreeNode> stack=new Stack<>();
		while(root!=null||!stack.isEmpty())
		{	
			if(root!=null){
				list.add(root.value);
				stack.push(root);
				root=root.getLeft();
			}else{
				root=stack.pop();
				root=root.getRight();
			}
		}
		
		printList(list);
	}
    
	/**
	 * 堆栈方式， 中序遍历    左-->根-->右
	 * @param root
	 */
    public static void theInOrderTraversal_Stack(TreeNode root)
	{
    	ArrayList<Integer> list=new ArrayList<>();
		Stack<TreeNode> stack=new Stack<>();
		while(root!=null||!stack.isEmpty())
		{			
			if(root!=null){
				stack.push(root);
				root=root.getLeft();
			}else{
				root=stack.pop();
				list.add(root.value);
				root=root.getRight();
			}
		}
		
		printList(list);
	}
    
    /**
     * 堆栈方式，后序遍历  左->右->根
     */
    public static void thePostOrderTraversal_Stack(TreeNode root)
    {
    	ArrayList<Integer> list=new ArrayList<>();
    	Stack<TreeNode> stack = new Stack<TreeNode>();  
        Stack<TreeNode> output = new Stack<TreeNode>();	//构造一个中间栈来存储逆后序遍历的结果  
        
        while(root!=null||!stack.isEmpty())
        {
        	if(root!=null)
        	{
        		stack.push(root);
        		output.push(root);
        		root=root.getRight();
        	}else{
        		root=stack.pop();
        		root=root.getLeft();
        	}
        }
        
        while(!output.isEmpty()){
        	list.add(output.pop().value);
        }
        
        printList(list);
    }
    
    
    //递归方式  前序遍历，中序遍历，后序遍历
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
	
	/**
	 * 输出列表
	 * @param list
	 */
	private static<T> void printList(ArrayList<T> list)
	{
		for (T t : list) {
			System.out.print(t+" ");
		}
		System.out.println();
	}
}
