package com.codecollectionprac;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapIterating {

	public static void main(String[] args) 
	{
		//Map-->   HashMap,LinkedHashMap,TreeMap
		//Map<String,String>map=new HashMap<String,String>();
		Map<String,String>map=new LinkedHashMap<String,String>();		
		map.put("1","null");
		map.put("2",null);
		map.put("3","C#");
		map.put(null, null);
		
		for(Map.Entry<String,String>entry:map.entrySet())
		{
			System.out.println(entry.getKey()+ "  " +entry.getValue());
			
		}
		
		//printing the particular value from map 
		String value = map.get("3");
		System.out.println(value);
		
		//Printing all the keys available in map
	    Set<String> keySet = map.keySet();
	    System.out.print(keySet);
	    
	    Set<Map.Entry<String, String>> entrySet = map.entrySet();
	    System.out.println(entrySet);	
		
		
	}

}
