package com.codecollectionprac;
import java.util.*;
public class ElementIterating {

	public static void main(String[] args) 
	{
		List<String>arrayList=new ArrayList<String>();					
		arrayList.add("Banglore");
		arrayList.add("Hyderabad");
		arrayList.add("Pune");
		arrayList.add("Hyderabad");
		List<String>cities= new  ArrayList<String>();
		cities.add("Kolkata");
		cities.add("Patna");		
		arrayList.addAll(cities);
		//boolean contains = arrayList.contains("Bihar");
		//System.out.println(contains);
		
		//iterating the element in forward direction only
		
		Iterator<String>itr=arrayList.iterator();
		while(itr.hasNext())
		{
			String next = itr.next();
			//String next1 = itr.next();
			System.out.println(next+ "  ");
			//System.out.println(next1+ "  ");
			
		}
		
		//Traversing the element in backward direction:
		System.out.println("Traversing the element in previous direction:");
		
		
		ListIterator<String>listItr=arrayList.listIterator();
		while(listItr.hasPrevious())
		{
			String previous = listItr.previous();			
			 System.out.println(previous+ "  ");	
			
		}
		
		

	}

}
