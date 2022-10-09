package com.codeprac;

public class SwapTwoString {

	public static void main(String[] args)
	{
		//Swap this two string o/p--str2=Good, str1=Morning
		String str1="Good";
		String str2="Morning";
		System.out.println("String before swapping: " +str1+ "  " +str2);
		str1=str1+str2;
		str2=str1.substring(0,(str1.length()-str2.length()));
		str1=str1.substring(str2.length());
		System.out.println("String after swapping:" +str1+ "  " +str2);
		

	}

}
