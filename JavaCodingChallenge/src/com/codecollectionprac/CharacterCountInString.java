package com.codecollectionprac;

import java.util.HashMap;
import java.util.Map;

public class CharacterCountInString {

	public static void main(String[] args) 
	{
		String str="kundan";
		//Occurence of character in string 
       // o/p:--> g-2,o-2,l-1,e-1
		Map<Character,Integer>map=new HashMap<Character,Integer>();
		char[] chars = str.toCharArray();
		
		for(int i=0;i<chars.length;i++)
		{
			if(map.containsKey(chars[i]))
			{				
				Integer count = map.get(chars[i]);
				map.put(chars[i], ++count);				
			}
			else
			{				
				map.put(chars[i], 1);
				
			}		
			
		}
		
		System.out.println(map);
		
		
	}

}
