package com.day2;

public class Flip {
	


	public static void main(String [] args)
	
	{
		
	int	counter=1;
	int head=0;
	int tail=0;
	
	int flip=10;
	double random=0.0;
	
	while(counter<=flip)
	  {
		random =Math.random();
		
		if(random<0.5)
		{
		head++;
		}
		else
			
		{
		tail++;
		}
		counter++;
		}
		
	
	System.out.println("tail:"+tail);
	System.out.println("head:"+head);
	}
}

