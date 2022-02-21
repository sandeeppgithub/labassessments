//package programs;
//Exercise 2: Write a java program that simulates a traffic light. The program lets the user
//select one of three lights: red, yellow, or green with radio buttons. On entering the choice, 
//an appropriate message with “stop” or “ready” or “go” should appear in the console .Initially there is no message shown.
import java.util.*;

public class Trafficlight 
{
	public void tLight()
	{
		System.out.println("1:RedLight");
		System.out.println("2:YellowLight");
		System.out.println("3:GreenLight");
		System.out.println("Enter the LightNumber which you want to select");
		Scanner sc=new Scanner(System.in);
		int selectlight=sc.nextInt();
		switch(selectlight)
		{
		  case 1: System.out.println("Stop your Vehicles");
		  break;
		  case 2:System.out.println("Ready your vehicles");
		  break;
		  case 3:System.out.println("go");
		  break;
		  default: System.out.println("Invalid selection");
		
		}
		
	}
	
	
	public static void main(String[] args) 
	{
		Trafficlight tl= new Trafficlight();
		tl.Tlight();
	}
	
	

}
