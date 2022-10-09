package com.collections.prac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {

	public static void main(String[] args) 
	{
		List<Integer>list=new ArrayList<Integer>();
		list.add(10);
		list.add(9);
		list.add(45);
		list.add(6);
		Collections.addAll(list,89,67);
		
		
	    Collections.sort(list);
		
		//sorting the collection element in reverse order
		//Collections.sort(list,Collections.reverseOrder());
		
		
	for(Integer items:list)
	{
		System.out.println(items);
	} 
		
	//searching an item from collection
   //System.out.println(Collections.binarySearch(list,45)); 
	
		//finding maximum value from collection 
		Integer max = Collections.max(list);
		 System.out.println(max);
		 
		//finding maximum value from collection
		 Integer min = Collections.min(list);
		 System.out.println(min);

	}

}
