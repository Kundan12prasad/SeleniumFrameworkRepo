package com.codeprac;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) 
	{
		String[] arr= {"kundan","anish","abhishek","mohit"};
		//convert this array to list
		List<String> list = Arrays.asList(arr);
		//System.out.print(list+ " ");
		
		//iterating element with for each loop
		/*
		 * for(String al:list) { System.out.println(al); }
		 */
		
		//iterating with iterator
		/*
		 * Iterator<String>itr=list.iterator(); while(itr.hasNext()) {
		 * System.out.println(itr.next()); }
		 */
		
		//iterating with for loop		
		
		int size = list.size();
		for(int i=0;i<size;i++)
		{
			System.out.println(list.get(i));
			
		}	

	}

}
