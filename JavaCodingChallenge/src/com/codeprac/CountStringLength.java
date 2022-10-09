package com.codeprac;

public class CountStringLength {

	public static void main(String[] args) 
	{
		String str="My Name is Kundan Prasad";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ') 
			{
				
				count++;				
			}
			
		}
		
		System.out.println(count);
	}

}
