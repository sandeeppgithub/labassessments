
public class PersonTest 
{

	public void buildPerson(String inploc, double inpsal, String inpnm) 
	{
		Person p1 = new Person();
		p1.setLoc(inploc);
		p1.setName(inpnm);
		p1.setSalary(inpsal);
		System.out.println(p1.toString());
		
	}

	public String findGrade(Person person) 
	{
		double sal=person.getSalary();
		String grade="";
		if(sal<10000)
		{
			grade="C";
		}
		else if (sal>=10000 && sal<=25000)
		{
			grade="B";
		}
		else if(sal>25000)
		{
			grade="A";
		}
//		else
//		{
//			grade="NoGrade";
//		}
		return grade;
	}
	

}
//a)	If salary<10000, he is C grade
//b)	If salary>=10000 and salary<=25000, he is B grade
//c)	If salary>25000, he is A grade