package com.codeprac;

public class FindDuplicateCharacterString {

	public static void main(String[] args) 
	{
		//find the duplicate character in string
		String str="SAAKKEET";
		int count=0;
		char[] chars=str.toCharArray();
		System.out.println("Duplicate Character are:");
		for(int i=0;i<chars.length;i++)
		{
			for(int j=i+1;j<chars.length;j++)
			{
				if(chars[i]==chars[j])
				{
					System.out.println(chars[j]+ " ");
					count++;
					break;
				}
			}
				
		}
		//printing no of duplicate character in string
		
		System.out.println("No of duplicate characters are: " +count);
		
	}

}
