package programs;
import java.util.*;

//Exercise 1: Create a method to find the sum of the cubes of the digits of an n digit number

public class Cubeeex1 
{
	public int  cube(int num)
	{
		int sum=0;
		while(num>0)
		{
			int mod=num%10;
			sum=sum + (int) Math.pow(mod,3);
			num=num/10;
		}
		return sum;
		
		
	}
	
	public static void main(String[] args)
	{
		
		Squareex1 sq=new Squareex1();
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int x1=sc.nextInt();
		System.out.println(x1);
	}

}
