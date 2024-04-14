package Java.Basics;

public class Arrays {

	int a=10; //variable
	int[] age = {25,35,45,65,75,99,67}; //static array
	int[][] table = {{5,6},{8,9}};
	//[5,6
	// 8,9]
	// 40 45
	// 48 54

	String[] course =new String[5];
	//String[] course= {null,null,null,null,null}
	public void getArray(String course1,String course2,String course3,String course4,String course5)
	{
		System.out.println(age);
		System.out.println(a);
		System.out.println(age[6]);
		System.out.println(age.length);
		System.out.println(age[age.length-1]);
		for(int var : age)
		{
			System.out.println(var);
		}
		System.out.println("***********");
		for(int i=0;i<age.length;i++)
		{
			System.out.println(age[i]);
		}
		course[0]=course1;
		course[1]=course2;
		course[2]=course3;
		course[3]=course4;
		course[4]=course5;
		//course[5]=course1;
		for(String eachcourse : course)
		{
			System.out.println(eachcourse);
		}
	}


	public void twodimension()
	{
		//System.out.println(table[0][0]);
		//Get row

		//[5,6
		// 8,9]
		// 40 45
		// 48 54
		// 40 54
		for(int i=0;i<table.length;i++)
		{
			//System.out.println(table[i]);
			for(int j=0;j<table.length;j++)
			{

				//System.out.println(i+","+j);
				if (i<table.length-1)
				{
					System.out.print( table[i][i] * table[i+1][j]);
				}
				else
				{
					System.out.print( table[i-1][table.length-1] * table[i][j]);

				}
				/*int n =table[i][0];
				int n1 =table[i+1][j];
				System.out.print(n*n1);*/

			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays A = new Arrays();
		A.getArray("C#",".net","SQL","python","java");
		//A.twodimension();
	}

}
