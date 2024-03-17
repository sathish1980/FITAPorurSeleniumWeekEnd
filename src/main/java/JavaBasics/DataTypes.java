package JavaBasics;

public class DataTypes {


	/*
	 * primitive datatypes
	 * Wholenumber - int --> e.g int a= 10
	 * Wholenumber - long --> e.g long a= 10
	 * Decimal Value float --> e.g float b= 2.3f
	 * Decimal Value double --> e.g doulbe b= 2.345
	 * character     char --> eg char c= 's'
	 * Word value	 String --> e.g String name="Sathish"
	 * TrueofFalse   Boolean --> e.g Boolean status = true
	 * numbers(AScii value) byte -- > e.g byte name = 's'
	 */

	/*
	 * non primitive data types
	 * 1.class
	 * 2.Interface
	 * 3.Arrays
	 * ....etc
	 */

	/*
	 *  Variables - its a container which hold the value
	 *  syntax : accessmodifier datatype varaiblename = value
	 *  its also called as identifiers
	 *  3 Types
	 *  Local - with in the method
	 *  Global - With in the class out side of all the methods
	 *  Static - memory will be allocated during the program execution
	 */

	private int a1=60; //global
	static int b1=50; //static

	public int geta1()
	{
		return a1;
	}

	public void seta1(int a1) {

		this.a1=a1;
	}

	protected void add()
	{
		int a=10; //local variable
		int b=20;
		int c=a+b;
		System.out.println(c);
		System.out.println(a1);
	}

	public void sub()
	{
		int c=a1-b1;
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataTypes D = new DataTypes();
		D.add();
		D.sub();
	}

}
