package com.codeprac;

public class SecondLargestArrayValue {

	public static void main(String[] args) 
	{ 
		int[] arr= {10,78,56,34};
		int largest=0;
		int secondLargest=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				secondLargest=largest;
				largest=arr[i];
			}
			else if(arr[i]>secondLargest)
			{
				secondLargest=arr[i];				
			}
			
		}		
		System.out.println(secondLargest);	
		System.out.println(largest);
		
	}

}
