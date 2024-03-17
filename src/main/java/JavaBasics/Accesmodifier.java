package JavaBasics;

public class Accesmodifier extends  DataTypes{
	DataTypes D = new DataTypes();

	public void mul()
	{
		int c = geta1()*b1;
		D.add();
		sub();
		seta1(5);
		System.out.println(geta1());
		D.add();
		System.out.println(geta1());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accesmodifier A = new Accesmodifier();
		A.mul();
	}

}
