import java.util.Random;
class Account
{
	private long accNum;
	private double balance;
	private Person accHolder;
	
	
	
	public void setAccNum(long accNum)
	{
		this.accNum=accNum;
	}
	public long getAccNum()
	{
		return accNum;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public double getBalance()
	{
		return balance;
	}
	//public void setAccHolder(Person accHolder)
	//{
		//this.accHolder=accHolder;
	//}
	//public person getAccHolder()
	//{
		//return getAccHolder;
	//}
	

	void deposit(double amount)
	{
		balance=balance+amount;
	}
		
	
	public void withdraw(double amount)
	{
		balance=balance-amount;
	}
		
	
	public static void main(String[] args)
	{
		Random r1=new Random();
		SavingsAccount s1=new SavingsAccount();
		Person p1=new Person();
		s1.setAccNum(r1.nextInt(10000));
		p1.setName("smith");
		p1.setAge(24);
		s1.setBalance(2000);
		s1.deposit(5000);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(s1.getBalance());
		System.out.println("Updated smith balance "+s1.getBalance());
		s1.withdraw(500);
			
		Random r2=new Random();
		CurrentAccount c1=new CurrentAccount();
		Person p2= new Person();
		c1.setAccNum(r2.nextInt(10000));
		p2.setName("kathy");
		p2.setAge(25);
		c1.setBalance(200);
		c1.deposit(5000);
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		System.out.println(c1.getBalance());
		System.out.println("Updated smith balance "+c1.getBalance());
		c1.withdraw(500);	
			
		
		
		
		
		
		
	}
	
}