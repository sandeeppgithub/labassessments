import java.util.*;

class IncreasingEx7
{
	public static boolean checkNum(int n)
	{
		while(n>0)//134468
		{
			int digit1 = n%10;
			n = n/10;
			
			if(digit1 < n%10)
				return false;
		}
		return true;
	}

	public static void main(String args[])
	{
		System.out.println("Enter the number to see whether is in increasing order or not");
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		if(checkNum(n))
			System.out.println(n+" is in increasing order");
		else
			System.out.println(n+" is not in increasing order");
	}
}