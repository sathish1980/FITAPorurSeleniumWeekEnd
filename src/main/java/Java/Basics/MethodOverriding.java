package Java.Basics;

public class MethodOverriding extends HDFCbank {
	int commisionAmount =500;

	@Override
	public void Withdrawl(int amount)
	{
		if(amount<Balance())
		{
			balanceamount =balanceamount-amount-commisionAmount;
			System.out.println("Remaining balnace is " +balanceamount);
		}
		else
		{
			System.out.println("Insufficient balance");
		}
	}

	public void transaction(int amount)
	{
		this.Withdrawl (amount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding M = new MethodOverriding();
		M.Withdrawl(3000);
	}

}
