package Collections;

import java.util.Scanner;

public class GetFromUser {

	public void getData()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Hotel: ");
		String name = s.nextLine();
		if(name.equalsIgnoreCase("A2b")) {
		System.out.println("Welcome to !!!" +name);
		}
		else
		{
			System.out.println(name + "is not available");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetFromUser G = new GetFromUser();
		G.getData();
	}

}
