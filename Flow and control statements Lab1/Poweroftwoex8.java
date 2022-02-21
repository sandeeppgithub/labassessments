//package programs;
//Exercise 8: Create a method to check if a number is a power of two or not
//
//Note: Complete this exercise on Doselect.                          [DoSelect-Lab1_4]
//
//Method Name 	checkNumber 
//Method Description 	Checks if the entered number is a power of two or not 
//Argument 	int n 
//Return Type 	boolean 
//Logic 	Check if the input is a power of two. 
//Ex: 8 is a power of 2 
import java.util.*;



public class Poweroftwoex8 
{
	boolean CheckNumber(int n)
	{
		
		for(int i=0;i<n;i++)
		{
			int sum=i*i;
			if (sum==n);
			
		}
		return true;
	     	
	}
	
	public static void main(String[] args) 
	{
		Poweroftwoex8 pe=new Poweroftwoex8();
		boolean b=pe.CheckNumber(9);
		System.out.println(b);
	}
	

}
