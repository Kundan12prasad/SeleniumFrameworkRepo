package com.codecollectionprac;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MergeArraywithoutDuplicate {

	public static void main(String[] args) {
		String[] arr1= {"10","20","20","30"};	
	    List<String>list1 = Arrays.asList(arr1);
		
		String[] arr2= {"50","60","60","70"};
		List<String>list2 = Arrays.asList(arr2);		
		
		Set<String>set1=new LinkedHashSet<String>();
		Set<String>set2=new LinkedHashSet<String>();
		
		//remove the duplicate values from different values and merge it
		
		for(int i=0;i<list1.size();i++)
		{
		  set1.addAll(list1);	
		}
		
		for(int i=0;i<list1.size();i++)
		{
			set2.addAll(list2);			
		}		
		
		//Collections.addAll(list1, list2);
		
		

	}

}
