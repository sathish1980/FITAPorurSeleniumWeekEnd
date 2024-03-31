package Java.Basics;

public class HDFCbank {
	int balanceamount =5000;

	public void customerInfo()
	{
		String name= "Sathish Kumar";
		int custId = 1233212;
		System.out.println("Your name is : "+name);
		System.out.println("cust id is :" +custId );
	}

	public int Balance()
	{
		return balanceamount;
	}

	public void Withdrawl(int withdrawalamount)
	{
		if(withdrawalamount<Balance())
		{
			balanceamount =balanceamount-withdrawalamount;
			System.out.println("Remaining balnace is " +balanceamount);
		}
		else
		{
			System.out.println("Insufficient balance");
		}
	}

}
