package com.codecollectionprac;

import java.util.HashMap;
import java.util.Map;

public class WordCountInString {

	public static void main(String[] args) {
		String str="my my name name is kundan prasad";		
		Map<String,Integer>map=new HashMap<String,Integer>();
		String[] split = str.split(" ");
		for(int i=0;i<split.length;i++)
		{
			if(map.containsKey(split[i]))
			{
				Integer count = map.get(split[i]);
				map.put(split[i],++count);			
			}
			
			else
			{
				map.put(split[i],1);			
			}		
			
		}
		
		System.out.println(map);

	}

}
