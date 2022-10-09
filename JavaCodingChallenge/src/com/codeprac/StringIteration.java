package com.codeprac;

public class StringIteration {

	public static void main(String[] args) 
	{
		String str="KUNDAN";
	   /*for(int i=0;i<str.length();i++)
		{
			//printing my name 0 to 5 times
			 System.out.print(str+ " ");	
			 
			 
			//iterating each word and print it in different line:
			//System.out.println(str.charAt(i));			
		}*/
	   
		
		//converting the string into char array and print it in different line
		char[] charArray = str.toCharArray();
		for(char ch:charArray)
		{
			System.out.println(ch);
			
		}
	   

	}

}
