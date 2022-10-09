package com.codeprac;

public class ArraySearching {

	public static void main(String[] args) 
	{
		int arr[]= {10,20,30,40,50};
		int key=40;
		int flag=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				flag=1;
				break;
			}
			
			else
			{
				flag=0;
			}
			
				
		}
		
		if(flag==1)
		{
			int i=0;
			System.out.println("element found " +key);
		}
		
		if(flag==0)
		{
			System.out.println("element not found");
		}
		

	}

}
