package com.codeprac;

public class VowelConsonentCount {

	public static void main(String[] args) 
	{
		String str="my name is kundan prasad";
		int vCount=0;
		int cCount=0;		
		for(int i=0;i<str.length();i++)
		{
			if((str.charAt(i)== 'a')|| (str.charAt(i)== 'e')|| (str.charAt(i)== 'i')|| (str.charAt(i)== 'o')||(str.charAt(i)== 'u'))
			{
				vCount++;
						
			}
			
			else if((str.charAt(i)>='a') && (str.charAt(i)<='z'))
			{
				cCount++;						
			}
			
		}
		
		System.out.println("no of vowel character are:" +vCount);
		System.out.println("no of consonent character are:" +cCount);

	}

}
