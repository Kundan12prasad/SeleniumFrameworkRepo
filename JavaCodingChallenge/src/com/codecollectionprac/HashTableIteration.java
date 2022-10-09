package com.codecollectionprac;

import java.util.Hashtable;
import java.util.Map;

public class HashTableIteration {

	public static void main(String[] args)
	{
		Map<String,String>map=new Hashtable<String,String>();
		map.put("10","Apple");
		map.put("11","Guava");
		map.put("12","Banana");
		
	  for(Map.Entry<String,String> entry:map.entrySet())
	  {
		  //System.out.println(entry.getKey()+ "  " +entry.getValue());
		  System.out.println(entry.getValue());
		  
	  }
		
	}

}
