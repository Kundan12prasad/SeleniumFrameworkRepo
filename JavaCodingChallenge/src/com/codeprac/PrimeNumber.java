package com.codeprac;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		int num=29;
		//int temp=0
		boolean isPrime=true;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;			
			}			
			
		}
		
		if(isPrime)
		{
			System.out.println("Number is prime number: " +num);
		}
		
		else
		{
			System.out.println("Number is not prime number");
			
		}
		
				

	}

}
