package Java.Basics;

public class Loops {

	public void loopsimplementaiton()
	{
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		/*
		 * for loop
		 * while loop
		 * do while loop
		 */

		/*
		 * for loop:
		 * for(intialization;condition;increment/decrement)
		 * {
		 * }
		 */

		for(int a=1;a<10;a++)
		{
			System.out.println(a);
		}

		for(int a=10;a>0;a--)
		{
			//break;
			if(a==5 || a==2)
			{
				continue;
			}
			System.out.println(a);
		}

	}

	public void whileloop(int value,int nextdigit)
	{
		/*
		 * while(condition)
		 * {
		 * }
		 */
		//int nextTenNumber =value+nextdigit;
		int nextTenNumber=100;
		while(value<nextTenNumber)
		{
			value= value+1;
			if(value==55)
			{
				continue;
			}
			System.out.println(value);

		}
	}

	public void dowhile(int value)
	{
		/*
		 * do
		 * {
		 * }
		 * while(condition);
		 *
		 */
		//int nextTenNumber =value+nextdigit;
		int nextTenNumber=100;
		do
		{
			value= value+1;
			if(value==55)
			{
				continue;
			}
			System.out.println(value);

		}while(value<nextTenNumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loops L = new Loops();
		L.dowhile(50);
	}

}
