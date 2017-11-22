package com.main.day1;

/**
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * @param str
 * @return
 */
public class Question2 {

	/**
	 * 
	 * @param str
	 * @return
	 */
	public String ReplaceSpace(StringBuffer str) 
	{
		String s=str.toString().replace(" ", "%20");
		return s;
	}
}
