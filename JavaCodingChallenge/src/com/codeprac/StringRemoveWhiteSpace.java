package com.codeprac;

public class StringRemoveWhiteSpace {

	public static void main(String[] args) 
	{
		String str="ku    n      d  an";
				//using library method
				/*
				 * String str1=str.replaceAll("\\s", ""); 
				 * System.out.println(str1);
				 */
		//Using For loop:
		
		char[] chars=str.toCharArray();
		StringBuffer buffer=new StringBuffer();
		for(int i=0;i<chars.length;i++)
			{
			if((chars[i]!=' ') && (chars[i]!='\t'))
			{
				buffer.append(chars[i]);
				
			}			
			}
		
    System.out.println(buffer);
	}

}
