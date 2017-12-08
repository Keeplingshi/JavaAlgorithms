package com.main.JianzhiOffer.day12;

import java.util.ArrayList;

/**
 * LL今天心情特别好,因为他去买了一副扑克牌,发现里面居然有2个大王,2个小王(一副牌原本是54张^_^)...
 * 他随机从中抽出了5张牌,想测测自己的手气,看看能不能抽到顺子,如果抽到的话,他决定去买体育彩票,嘿嘿！！
 * “红心A,黑桃3,小王,大王,方片5”,“Oh My God!”不是顺子.....LL不高兴了,他想了想,
 * 决定大\小 王可以看成任何数字,并且A看作1,J为11,Q为12,K为13。
 * 上面的5张牌就可以变成“1,2,3,4,5”(大小王分别看作2和4),“So Lucky!”。
 * 
 * LL决定去买体育彩票啦。 现在,要求你使用这幅牌模拟上面的过程,然后告诉我们LL的运气如何。为了方便起见,你可以认为大小王是0。
 * @author chenbin
 *
 */
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers={0,3,2,6,4};
		Question7 question7=new Question7();
		System.out.println(question7.isContinuous(numbers));
	}

	/**
	 * 分析：满足两个条件
	 * 	1、除0以外没有重复的数
	 * 	2、max-min<5
	 * @param numbers 长度为5
	 * @return
	 */
    public boolean isContinuous(int [] numbers) {

    	if(numbers.length<5){
    		return false;
    	}
    	
    	int min=14;
    	int max=-1;
    	ArrayList<Integer> list=new ArrayList<>();
    	for(int i=0;i<numbers.length;i++)
    	{
    		int num=numbers[i];
    		if(num<0||num>13){
    			return false;
    		}
    		if(num!=0){
        		min=min<num?min:num;
        		max=max>num?max:num;
    		}
    		if(max-min>=5){
    			return false;
    		}
    		
    		if(!list.contains(num)){
    			list.add(num);
    		}else{
    			if(num!=0){
    				return false;
    			}
    		}
    	}
    	
    	return true;
    }
	
}
