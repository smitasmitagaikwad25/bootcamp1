package com.bridgelabz.day1;

public class LeapYear {
	public static void main(String [] args)
	{
	
	 int yr=2001;
	int temp=0;
	
	if((yr%400==0)||(yr%4==0 && yr%100!=0))
	{
		System.out.println("leap yr");
		
	}
	else
	{
		System.out.println(" not leap yr ");
		
	}
	}

}
