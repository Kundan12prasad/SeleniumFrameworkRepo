package com.codeprac;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) 
	{
		//sorting in array using Arrays class:
		int arr[]= {10,89,56,34};
		int temp=0;
		
		/*
		 * Arrays.sort(arr); //sorted the array for(int sortedArray: arr) {
		 * System.out.print(sortedArray+ "  "); }
		 */
		
		//by using for loop
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;					
				}			
				
			}
		}
			
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}

	}

}
