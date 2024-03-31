package Java.Basics;

public class MethodOverloading {

	public void Add(int a,int b)
	{
		int c= a+b;
		System.out.println("2 integer: "+ c);
	}

	public void Add(int a,int b,int d)
	{
		int c= a+b+d;
		System.out.println("3 integer: "+ c);
	}

	public void Add(int a,double b)
	{
		double c= a+b;
		System.out.println("1 integer , 1 double: "+ c);
	}

	public void Add(double a,double b)
	{
		double c= a+b;
		System.out.println("2 double: "+ c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading M = new MethodOverloading();
		M.Add(10,10);
		M.Add(10, 10,10);
		M.Add(10, 10.78);
		M.Add(10.67, 10.78);
		M.Add(10.67, 10);
	}

}
