package com.day2;

public class Insertion {
	public static void main (String [] agrs)
	{
		int temp, j;
		int [] a = {31,9,25,6};
		 for(int i=1; i<a.length; i++)
		 {
			 temp=a[i];
			 j=i;
			 
			 while(j>0 && a[j-1]>temp)
			 {
				 a[j]=a[j-1];
				 j=j-1;
			 }
			 
			 a[j]=temp;
			 
		 }   
		  
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.println(a[i]+" ");
		 }
		
	}

}
