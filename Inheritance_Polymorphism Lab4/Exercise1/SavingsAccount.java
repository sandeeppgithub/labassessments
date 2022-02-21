class SavingsAccount extends Account
{
	final double minimumBalance=500;
	public void withdraw(double amount)
	{
		if(getBalance()>=minimumBalance)
		{
			double checkbalance=getBalance()-amount;
			System.out.println(checkbalance);
		}
		else
		{
			System.out.println("minimum balance is less ");
		}
	}
}