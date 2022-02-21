class ValidateAge
{
	public static void main(String [] args)
	{	int age=12;
		try{
		aAge(age);}
		catch(AgeLimitException e)
		{
			System.out.println("Not eligible");
		}
	}
	
	static int aAge(int age) throws AgeLimitException
	{
		if(age<15)
		{
			throw new AgeLimitException();
		}
		else
		{
			System.out.println("Eligible");
		}
	}	
}