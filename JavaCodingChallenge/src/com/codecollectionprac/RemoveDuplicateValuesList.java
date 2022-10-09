package com.codecollectionprac;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateValuesList {

	public static void main(String[] args) 
	{
		List<String>list=new ArrayList<String>();
		list.add("kundan");
		list.add("Amit");
		list.add("kundan");
		list.add("rajesh");
		//remove the duplicate values from list:
		//remove the duplicate value: use the LinkedHashSet class
		
		Set<String>set=new LinkedHashSet<String>();
		//for(int i=0;i<list.size();i++) 
			set.addAll(list);
		
		
		for(String items:set)
		{
			System.out.println(items);
			
		}
		

	}

}
