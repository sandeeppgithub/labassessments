
//Exercise 4: Write a Java program that prompts the user for an integer and then prints out all the prime numbers up to that Integer?

import java.util.Scanner;

public class Primeex4 
{
	public static void main(String[] args )
	{
		System.out.println("Enter a number limit to display prime numbers");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count;
		for(int i=1;i<num;i++)
		{
			count=0;
			for(int j=1;j<i;j++)
			{
				if(j%i==0)
				count=count+1;
				
			
			}
					if(count==0)
					{
						System.out.println(i);
					}
			
		}
		
			
	}
	
	

}
