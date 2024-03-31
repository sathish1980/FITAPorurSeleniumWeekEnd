package Java.Basics;

public class MiniStatement  extends HDFCbank{

	public void ministatement()
	{
		customerInfo();
		System.out.println("Your balnce is : "+Balance());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiniStatement M = new MiniStatement();
		M.ministatement();
	}

}
