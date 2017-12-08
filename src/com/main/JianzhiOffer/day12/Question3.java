package com.main.JianzhiOffer.day12;

import java.util.ArrayList;

/**
 * 小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。
 * 但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
 * 没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。
 * 现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
 * 
 * 输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
 * @author chenbin
 *
 */
public class Question3 {

	public static void main(String[] args) {
		
		Question3 question3=new Question3();
		ArrayList<ArrayList<Integer>> returnList=question3.FindContinuousSequence(1);
		for(ArrayList<Integer> list:returnList)
		{
			for(int i:list){
				System.out.print(i+"\t");
			}
			System.out.println();
		}

	}

    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
    	
    	ArrayList<ArrayList<Integer>> returnList=new ArrayList<>();
    	
    	//需要遍历的正数序列
        ArrayList<Integer> arrlist=new ArrayList<>();
        for(int i=1;i<=sum/2+1;i++){
        	arrlist.add(i);
        }
        
        if(arrlist.size()<2){
        	return returnList;
        }
        
        ArrayList<Integer> tempList=new ArrayList<>();
        int j=0;
        int s=0;
        for(int i=0;i<arrlist.size();i++)
        {
        	s+=arrlist.get(i);
        	tempList.add(arrlist.get(i));
        	if(s==sum){
        		ArrayList<Integer> temp=new ArrayList<>(tempList);
        		returnList.add(temp);
        		tempList.clear();
        		s=0;
        		j++;
        		i=j-1;
        	}else if(s>sum){
        		tempList.clear();
        		s=0;
        		j++;
        		i=j-1;
        	}
        }
        
        return returnList;
    }
   
}
