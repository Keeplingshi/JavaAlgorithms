package com.main.JianzhiOffer.day12;

/**
 * 牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。
 * 同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。
 * 
 * 例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，
 * 正确的句子应该是“I am a student.”。
 * 
 * Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
 * @author chenbin
 *
 */
public class Question6 {

	public static void main(String[] args) {
		Question6 question6=new Question6();
		String str=" ";
		System.out.println(question6.ReverseSentence(str));
	}

    public String ReverseSentence(String str) {
    	if(str==null||"".equals(str)){
    		return "";
    	}
        String[] strArray=str.split(" ");
        if(strArray.length==0||strArray.length==1){
        	return str;
        }
        String s="";
        for(int i=strArray.length-1;i>=0;i--)
        {
        	s=s+" "+strArray[i];
        }
        return s.trim();
    }
	
}
