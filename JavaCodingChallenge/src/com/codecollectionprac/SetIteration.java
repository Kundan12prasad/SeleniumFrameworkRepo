package com.codecollectionprac;

import java.util.Set;
import java.util.TreeSet;

public class SetIteration {

	public static void main(String[] args) 
	{
		//Set<String>set=new HashSet<String>();
		//Set<String>set=new LinkedHashSet<String>();
		Set<String>set=new TreeSet<String>();		
		
		set.add("Kundan");
		set.add("Amit");
		set.add("Abhishek");
		set.add("Kundan");
		//set.add(null);
		
		for(String item:set)
		{
			System.out.print(item+ " ");			
		}

	}

}
