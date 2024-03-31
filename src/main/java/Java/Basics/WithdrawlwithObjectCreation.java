package Java.Basics;

public class WithdrawlwithObjectCreation {

	HDFCbank H = new HDFCbank();
	public void EnterDetails( int number,int pin,int amount)
	{
		System.out.println("Enter card number is " +number);
		System.out.println("Enter Pin " +pin);
		System.out.println("Enter amount "+amount);
		H.Withdrawl(amount);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithdrawlwithObjectCreation W = new WithdrawlwithObjectCreation();
		W.EnterDetails(21313122, 1234, 7000);
	}

}
