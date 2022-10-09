package com.codeprac;

public class ReverseString {

	public static void main(String[] args) 
	{
		String str="madam";
		String rev="";
		int length=str.length();
		//iterating  the character inside the loop
		for(int i=length-1;i>=0;i--)
		{			
			rev=rev+str.charAt(i);			
		}
		
		//print the reverse value outside the loop
		System.out.println(rev);
		
		//palindrome 
		
		if(str.equals(rev))
		{
			System.out.println("String is Palindrome");
		}
		
		else
		     {
				System.out.println("String is not Palindrome");
			}		
			

	}

}
