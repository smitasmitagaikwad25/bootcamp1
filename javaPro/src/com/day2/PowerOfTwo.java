package com.day2;

public class PowerOfTwo {
	
	public static void main(String [] args)
	
	{
		int i=0;
		int powerOftwo=1;
		int n=Integer.parseInt(args[0]);
		//int n=10;
		
		while(i<n)
		{
			System.out.println(i+" "+ powerOftwo);
			powerOftwo= 2*powerOftwo;
			
			i=i+1;
			
		}
		
		                                                                                                                                                              
		
		
	}
	

}
