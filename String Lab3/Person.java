import Ruff.main;

public class Person 
{
	private String loc;
	private String name;
	private double salary;
	
	public Person(String loc, String name, double salary) {
		super();
		this.loc = loc;
		this.name = name;
		this.salary = salary;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public static void main(String[] args) 
	{
		//HydNMKiran-KumarSAL25
		String inploc="hyd";
		double inpsal=26000;
		String inpnm="kitan-kumar";
		PersonTest pt1=new PersonTest();
		
		Person person=new Person("Hyd","sad",12000);
		pt1.buildPerson(inploc,inpsal,inpnm);
		
		System.out.println(pt1.findGrade(person));
		
	}

	@Override
	public String toString() {
		return "Person [loc=" + loc + ", name=" + name + ", salary=" + salary + "]";
	}
	

}
