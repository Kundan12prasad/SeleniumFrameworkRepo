//To Remove the duplicate value  from  Array
//Array can be of int or string data type

package com.codeprac;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElementArray {

	public static void main(String[] args)
	{
		//String arr[]= {"JAVA ","DOTNET","JAVA ","C#"};
		int arr[]= {10,20,40,40,10,60,50};
		//if we want to remove duplicate element from array, then we are using set interface
		//Set<String>set1=new LinkedHashSet<String>();
		Set<Integer>set2=new LinkedHashSet<Integer>();
		
		//adding unique elements in set
		for(int i=0;i<arr.length;i++)		
			set2.add(arr[i]); 			
		
		for(Integer uniqueElements:set2)
		{
			//System.out.println(uniqueElements);
			System.out.print(uniqueElements+ "  ");
		}	
		
	}

}
