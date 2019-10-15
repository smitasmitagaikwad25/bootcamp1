package com.bridgelabz.day1;

import java.util.Scanner;

public class PrintthreeName {
	



	public static void main (String [] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter 1st name");
		String str1 = scanner.next();
		
		System.out.println("Enter 2st name");
		String str2 = scanner.next();
		
		System.out.println("Enter 3st name");
		String str3 = scanner.next();
		
		System.out.println("Hi"+" "+str3+" "+str2+" "+str1);
		
	}

}


