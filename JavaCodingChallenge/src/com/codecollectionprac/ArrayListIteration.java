package com.codecollectionprac;

import java.util.*;

public class ArrayListIteration {

	public static void main(String[] args) 
	{
		List<String>arrayList=new ArrayList<String>();
		List<String>cities= new  ArrayList<String>();
		cities.add("Kolkata");
		cities.add("Patna");
		
		arrayList.add("Banglore");
		arrayList.add("Hyderabad");
		arrayList.add("Pune");
		arrayList.add("Hyderabad");
		arrayList.add(null);
		arrayList.add(null);
		arrayList.addAll(cities);
		
		//addAll cannot take string array
		//we need to pass the collection object
		//Maintains the order
		
		for(String item:arrayList)
		{
			System.out.println(item+ " ");
			
		} 	
		
		//if we want to print the value from collection object:
		//System.out.println(arrayList.get(1));	
		
		
		/*for(int i=0;i<arrayList.size();i++)
		{
			System.out.println(arrayList.get(1));			
		}*/
		
		//List<String> list=new LinkedList<String>();
		//Vector
		

	}

}
