package com.codeprac;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		int number=967;
		int reverse=0;
		int remainder=0;
		//logic
		while(number!=0)
		{
			remainder=number%10;
			reverse=(reverse*10)+remainder;
			number=number/10;			
		}		
		System.out.println(reverse);
		
		//palindrome:
		if(number==reverse)
		{
			System.out.print("Number is palindrome:" +reverse);		
		}
		
		else
		{
			System.out.println("Number is not palindrome");
		}
		

	}

}
