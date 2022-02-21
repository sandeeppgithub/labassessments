class CurrentAccount extends Account
{
	final double overDraftLimt=10000;
	public void withdraw(double amount)
	{
		if(getBalance()>=overDraftLimt)
		{
			double finbal=getBalance()-amount;
			System.out.println(finbal);
		}
		else
		{
			System.out.println("minimum balance is less ");
		}
	}
}