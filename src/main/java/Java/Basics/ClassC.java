package Java.Basics;

public class ClassC extends ClassB {

	public void mul(int a, int b)
	{
		int c=a*b;
		System.out.println(c);
	}

	/*public void Addition(int a, int b) {

	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassC C = new ClassC();
		C.mul(10, 5);
		C.sub(10, 5);
		C.Addition(10, 5);

	}

}
