package com.codeprac;

public class FibbonnaciSeries {

	public static void main(String[] args) {
		
		int a=0,b=0;
		int c=1;
		for(int i=1;i<=7;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(a+ " ");					
		}
		

	}

}
