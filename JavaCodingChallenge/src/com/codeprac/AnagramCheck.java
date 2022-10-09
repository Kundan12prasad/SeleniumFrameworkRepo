package com.codeprac;

import java.util.Arrays;

public class AnagramCheck {	

	public static void main(String[] args)
	{
		//to check two strings are anagram or not
		//length and character in strings are same but positions are different
		String str1="maam";
		String str2="army";
		char[] arr1=str1.toCharArray();
		System.out.print(arr1.toString()+ " ");
		char[] arr2=str2.toCharArray();
		System.out.println(arr2.toString()+ " ");
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(Arrays.equals(arr1,arr2))
		{
			System.out.println("Given Strings are Anagram");
		}
		
		else
		{
			System.out.println("Given Strings are not Anagram");
		}		
		

	}

	@Override
	public String toString() {
		return "AnagramCheck [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}