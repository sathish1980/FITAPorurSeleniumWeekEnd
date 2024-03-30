package Java.Basics;

public class ClassB extends ClassA{

	public void sub(int a, int b)
	{
		int c=a-b;
		System.out.println(c);
	}

	/*public void Addition(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}*/


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassB B= new ClassB();
		B.sub(10, 5);
		B.Addition(10, 20);
	}

}
