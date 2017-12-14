package com.main.JianzhiOffer.day17;

/**
 * 
 * 给定一颗二叉搜索树，请找出其中的第k大的结点。 例如，  
 * 		 5
 * 		/ \ 
 * 	   3   7 
 *    /\   /\ 
 *   2  4 6  8
 * 
 * 中，按结点数值大小顺序第三个结点的值为4。
 * 
 * @author chenbin
 *
 */
public class Question2 {

	public static void main(String[] args) {

	}

	/**
	 * 分析： 二叉搜索树性质： 若它的左子树不空，则左子树上所有结点的值均小于它的根结点的值
	 * 若它的右子树不空，则右子树上所有结点的值均大于它的根结点的值
	 * 
	 * 中序遍历的顺序
	 * 
	 * @param pRoot
	 * @param k
	 * @return
	 */
	int index=0;
	TreeNode KthNode(TreeNode pRoot, int k) {
		
		if(pRoot!=null){
			TreeNode node=KthNode(pRoot.left, k);
			if(node!=null){
				return node;
			}
			index++;
			if(index==k){
				return pRoot;
			}
			node=KthNode(pRoot.right, k);
			if(node!=null){
				return node;
			}
		}
		
		return null;
	
	}

//	/**
//	 * 计算二叉树的结点个数
//	 * 
//	 * @param pRoot
//	 * @return
//	 */
//	private int countTreeNode(TreeNode pRoot) {
//		if (pRoot == null) {
//			return 0;
//		}
//		int count_right = 0, count_left = 0;
//		if (pRoot.left == null && pRoot.right == null) {
//			return 1;
//		}
//		if (pRoot.left != null) {
//			count_left = countTreeNode(pRoot.left);
//		}
//		if (pRoot.right != null) {
//			count_right = countTreeNode(pRoot.right);
//		}
//		return 1 + count_right + count_left;
//	}

	public class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;
		}
	}
}
