package com.main.JianzhiOffer.day8;

import java.util.ArrayList;

/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 * 
 * 
 * 二叉查找树（Binary Search Tree），（又：二叉搜索树，二叉排序树）它或者是一棵空树，或者是具有下列性质的二叉树： 
 * 若它的左子树不空，则左子树上所有结点的值均小于它的根结点的值； 
 * 若它的右子树不空，则右子树上所有结点的值均大于它的根结点的值； 
 * 它的左、右子树也分别为二叉排序树。
 * @author chenbin
 *
 */
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] sequence={5,7,6,9,11,10,8};
		Question2 question2=new Question2();
		question2.VerifySquenceOfBST(sequence);
	}

	/**
	 * 1、后序遍历，最后一个为根节点
	 * 2、循环，如果找到根据根节点大小将sequence[0：sequence.length-1]划分为左右子树left，right
	 * 3、left所有值小于根节点的值，判断right所有的值是否大于根节点的值，如果否，返回false，如果是，递归验证left与right是否为二叉搜索树
	 * @param sequence
	 * @return
	 */
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length==0){
        	return false;
        }
        if(sequence.length==1){
        	return true;
        }
        
        int rootvalue=sequence[sequence.length-1];
        int index=-1;
        ArrayList<Integer> left=new ArrayList<Integer>(0);
        ArrayList<Integer> right=new ArrayList<Integer>(0);
        for(int i=0;i<sequence.length-1;i++)
        {
        	if(sequence[i]<rootvalue)
        	{
        		left.add(sequence[i]);
        	}else{
        		index=i;
        		break;
        	}
        }
        if(index!=-1){
        	for(int i=index;i<sequence.length-1;i++)
        	{
        		if(sequence[i]<rootvalue){
        			return false;
        		}
        		right.add(sequence[i]);
        	}
        }
        
        boolean result=false;
        if(left.size()!=0){
        	int[] leftArray=new int[left.size()];
            for(int i=0;i<leftArray.length;i++)
            {
            	leftArray[i]=left.get(i);
            }
            result=VerifySquenceOfBST(leftArray);
        }
        if(right.size()!=0)
        {
            int[] rightArray=new int[right.size()];
            for(int i=0;i<rightArray.length;i++)
            {
            	rightArray[i]=right.get(i);
            }
            result=VerifySquenceOfBST(rightArray);
        }
        
        return result;
    }
	
}
