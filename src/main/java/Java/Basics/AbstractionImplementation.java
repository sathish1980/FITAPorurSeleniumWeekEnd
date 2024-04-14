package Java.Basics;

public class AbstractionImplementation extends Abstractionclass implements Interface1{

	int age =50;
	@Override
	public void forgotpassword() {
		// TODO Auto-generated method stub
		System.out.println("Forgot password");
	}
	
	@Override
	public void mydata() {
		// TODO Auto-generated method stub
		System.out.println("Hi my self "+ name);
	}
	
	@Override
	public void MyAge() {
		// TODO Auto-generated method stub
		System.out.println("My age is : "+age);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstractionclass A = new AbstractionImplementation();
		A.forgotpassword();
		Interface1 I1 = new AbstractionImplementation();
		I1.mydata();
		//Interface2 I2 = new AbstractionImplementation();
		I1.MyAge();
		
	}

	

	

	

}
