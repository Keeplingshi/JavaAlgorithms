package com.main.JianzhiOffer.day17;

/**
 * 请实现两个函数，分别用来序列化和反序列化二叉树
 * 
 * @author chenbin
 *
 */
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	int index = -1;

	/**
	 * 先序遍历的代码可以完成序列化二叉树的工作
	 *     _30_
		   /    \   
		  10    20
		 /     /  \
		50    45  35
		
		30 10 50 # # # 20 45 # # 35 # #
	 * @param root
	 * @return
	 */
	public String Serialize(TreeNode root) {
		if(root==null){
			return "";
		}
		StringBuilder sb=new StringBuilder();
		Serialize2(root,sb);
		return sb.toString();
	}

	private void Serialize2(TreeNode root, StringBuilder sb) {
		if(root==null){
			sb.append("#,");
			return;
		}
		sb.append(root.val);
		sb.append(",");
		Serialize2(root.left,sb);
		Serialize2(root.right, sb);
	}

	/**
	 * 反序列化
	 * @param str
	 * @return
	 */
	public TreeNode Deserialize(String str) {
        if(str.length() == 0)
            return null;
        String[] strs = str.split(",");
        return Deserialize2(strs);
	}

	private TreeNode Deserialize2(String[] strs) {
		index++;
		if(!strs[index].equals("#"))
		{
			TreeNode node=new TreeNode(0);
			node.val=Integer.parseInt(strs[index]);
			node.left=Deserialize2(strs);
			node.right=Deserialize2(strs);
			return node;
		}
		
		return null;
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
