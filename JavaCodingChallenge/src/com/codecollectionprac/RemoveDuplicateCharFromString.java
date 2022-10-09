package com.codecollectionprac;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharFromString {

	public static void main(String[] args) {
		String str="aaabbbccc";
		//remove the duplicate character from string:
		//removing the Duplicate things go with LinkedHashSet
		Set<Character> set=new LinkedHashSet<Character>();
		char[] chars = str.toCharArray();
		for(int i=0;i<chars.length;i++)
		{
			set.add(chars[i]);  //adding unique values to set		
		}
		
		for(Character ch:set)
		{
			System.out.print(ch);
		}
		
		

	}

}
