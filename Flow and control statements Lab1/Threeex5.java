import java.util.Scanner;
//Method Name 	calculateSum 
//Method Description 	Calculate Sum 
//Argument 	int n 
//Return Type 	int-sum 
//Logic 	Calculate the sum of first n natural numbers which are divisible by 3 or 5. 


import java.util.*;

class ThreeEx5
{
	public static int calculateSum(int n)
	{
		int sum = 0;

		for(int i=1;i<=n;i++)
		{
			if(i%3 == 0 || i%5 == 0)
				sum = sum + i;
		}
		return sum;
	}

	public static void main(String args[])
	{
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = calculateSum(n);
		
		System.out.println("Sum  :"+res);
	}
}