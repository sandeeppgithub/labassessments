class StringTasks
{
	public String concatAdd(String s1,String s2)
	{
		String re=s1+s2;
		String rm=re.replaceAll("\\s","");
		return rm;
		
	}
		
		

	public String reverse(String srev)
	{
		char[] ch=srev.toCharArray();
		String rev="";
		for(int i=srev.length()-1;i>=0;i--)
		{
			rev+=ch[i];
		}
		return rev;
	}

	
		


	
	boolean isDigit(String sn)
	{
		int num=0;
		for(int i=0;i<=sn.length()-1;i++)
		{
			char ch1=sn.charAt(i);
			if(ch1>='0' && ch1<='9')
				continue;
				else
				return false;
		}
			
			return true;
			
	}

		
		
	public static void main(String [] args)
	{
		StringTasks t1=new StringTasks();
		t1.concatAdd("per","son");
		System.out.println(t1.concatAdd("per ","son"));
		t1.reverse("sir");
		System.out.println(t1.reverse("sir"));
		t1.isDigit("1");
		System.out.println(t1.isDigit("1"));
	}
	
	
}