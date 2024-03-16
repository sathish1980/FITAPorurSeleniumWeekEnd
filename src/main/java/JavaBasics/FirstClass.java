package JavaBasics;

/*
 * accessmodifier class classname{}
 */
public class FirstClass {

	/*
	 *  Method : reusable purpose
	 *  syntax : accesmodifier returntype methodname(arguments/parameter){}
	 *	Types : 4
	 *	1.Methods with out parameter /arguments
	 *	2.Methods with parameter /arguments
	 ************************************
	 *	3.Methods with out return type
	 *	4.Methods with return type
	 */
	// Method with out parameter/arguments and with out return Type
	public void printthis()
	{
		System.out.println(2+3);
		System.out.println(2);
		System.out.println(3);
	}

	// Method with parameter/arguments and with out return Type
	public void Myoutput(int a,int b)
	{
		System.out.println(a+b);
		System.out.println(a);
		System.out.println(b);
	}

	// Method with out parameter/arguments and with return Type
	public int giveBackValue()
	{
		int a=2+3;
		return a;
	}

	// Method with out parameter/arguments and with return Type
	public double giveBackValuewithAmount(int amount,double percentage)
	{
		double discount=amount*percentage;
		return discount;
	}

	public void redeempoints(int amount, double percent)
	{
		//int finalAmount =amount-giveBackValue();
		double finalAmount =amount-giveBackValuewithAmount(amount,percent);
		System.out.println(finalAmount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.print("sathish");
		 // Lines of Code
		// System.out.println("kumar");
		System.out.print("R");*/
		/* block of code */

		System.out.println("My age is :"+23);
		//System.out.println(2+3);
		FirstClass FC = new FirstClass();
		FC.printthis();
		FC.Myoutput(5, 14);
		FC.redeempoints(100,0.06);
	}

}
