package Java.Basics;

import java.io.IOException;

public final class ExceptionalHandling {

	final int a1=10;
	int d=20;

	public final void div(int a, int b)
	{
		//a1=a1+10;
		try {
			if(b>0)
			{
				int c =a/b;
				System.out.println(c);
			}
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		catch(Exception exp)
		{
			System.out.println(exp);
			if(b>0)
			{

			}
			else
			{
				b=2;
				int c =a/b;
				System.out.println("catch exception: "+c);
			}
		}
		finally
		{
			System.out.println("finally block");
		}
	}

	public void add(int a, int b)
	{
		int c =a+b;
		System.out.println(c);
	}

	public void ageCalc(int age)
	{

		if(age<=18)
		{
			throw new NullPointerException("hi u are NOT > 18");
		}
		else
		{
			System.out.println("Hi u are > greater than 18 ");
		}
	}

	public void Grade(String classvalue) throws NullPointerException,IOException
	{
		System.out.println("you are belong to class: "+classvalue);
	}

	public static void main(String[] args) throws NullPointerException, IOException {
		// TODO Auto-generated method stub
		ExceptionalHandling E = new ExceptionalHandling();
		E.div(10, 0);
		E.add(10, 2);
		E.ageCalc(18);
		E.Grade("5");
	}

}
