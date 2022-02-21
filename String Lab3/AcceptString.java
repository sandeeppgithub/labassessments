import java.util.Scanner;

public class AcceptString
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number to add");
		Scanner sc= new Scanner(System.in);
		String input=sc.next();
		int sum=0;
		for(int i=0;i<=input.length()-1;i++)
		{
			char ch=input.charAt(i);
			if(Character.isDigit(ch))
			{
				String s2="";
				s2=s2+ch;
				int num=Integer.parseInt(s2);
				sum=sum+num;
			}
		}
			
			System.out.println(sum);
		
	}
	

}
