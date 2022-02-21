import java.util.Scanner;
class CalculateDiffernceEx6
{
	static int calculateDifference( int n)
	{
		int sum=0;
	int sum1=0;
	int sum2=0;
		int diff=0;

		for (int i=1;i<=n ;i++)
		{
			sum2= sum2+(i*i);
			sum= sum+i;
			sum1=sum*sum;
		   diff = sum1-sum2;
		}	
		 return diff;
	}
		 public static void main(String[] args)
		{
			 System.out.println("Enter the number");
			 Scanner sc = new Scanner(System.in);
			 int n = sc.nextInt();
			 int sum= calculateDifference(n);
			 System.out.println(sum);

	}
}