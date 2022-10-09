package com.codecollectionprac;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeSetIteration {

	public static void main(String[] args) {
		
		Map<String,String>map=new TreeMap<String,String>();
		map.put("1", "India");
		map.put("2", "US");
		map.put("3", "CANADA");
		
		for(Map.Entry<String,String> entry: map.entrySet())
		{
			System.out.println(entry.getKey()+ " " + entry.getValue());	
			
		}
		//getting value based on key:
		String value = map.get("3");
		System.out.println(value);
		
		//printing the key set:
			
		Set<String>keySet=map.keySet();
		System.out.println(keySet);
		
		//Printing the entry set:
		Set<Entry<String,String>>entrySet=map.entrySet();
		System.out.println(entrySet);
		
		//remove values from map
		String removeValues = map.remove("3");
		System.out.println(removeValues);
		
		//Printing the entry set:
				Set<Entry<String,String>>entrySet1=map.entrySet();
				System.out.println(entrySet1);
				
		
		
		
		

	}

}
