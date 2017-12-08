package com.main.JianzhiOffer.day11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * 在一个字符串(1<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置
 * @author chenbin
 *
 */
public class Question1 {

	public static void main(String[] args) {
		Question1 question1=new Question1();
		String str="adfankdjasfhajkdfasfdksa";
		System.out.println(question1.FirstNotRepeatingChar(str));

	}

    public int FirstNotRepeatingChar(String str) {
        char[] cstr=str.toCharArray();
        HashMap<String,ArrayList<Integer>> hashmap=new HashMap<String, ArrayList<Integer>>();
        for(int i=0;i<cstr.length;i++){
        	String temp=String.valueOf(cstr[i]);
        	ArrayList<Integer> list=null;
        	if(hashmap.containsKey(temp)){
        		//如果包含，更新list
        		list=hashmap.get(temp);
        	}else{
        		//如果不包含，则加入
        		list=new ArrayList<>();
        	}
    		list.add(i);
    		hashmap.put(temp, list);
        }
        
        int index=-1;
        Iterator<String> iter=hashmap.keySet().iterator();
        while(iter.hasNext()){
        	String key=iter.next();
        	ArrayList<Integer> list=hashmap.get(key);
        	if(list.size()==1){
        		if(index==-1){
        			index=list.get(0);
        		}
        		index=index<list.get(0)?index:list.get(0);
        	}
        }
        
        return index;
    }
    
    
    public int FirstNotRepeatingChar2(String str) {
        if(str == null || str.length()==0) return -1;
        List<Character> list = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!list.contains(ch)){
                list.add(Character.valueOf(ch));
            }else{
                list.remove(Character.valueOf(ch));
            }
        }
        if(list.size() <=0) return -1;
        return str.indexOf(list.get(0));
    }
	
}
