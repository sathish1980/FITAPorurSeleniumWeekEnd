package Java.Basics;

public class StringsConcpets {
	
	
	String name = "Sathish kumar R";
	String name1 = "Sathish kumar R";
	char[] c= {'s','a','t','h'};
	public void string()
	{
		// split
		System.out.println(name);
		String[] newvalue = name.split(" ");
		for(String eachvalue : newvalue)
		{
			System.out.println(eachvalue);
		}
		
		System.out.println(name.replace(" ",""));
		char[] ch = name.toCharArray();
		for(char eachcharater : ch)
		{
			System.out.println(eachcharater);
		}
		System.out.println(name.charAt(1));
		System.out.println(name.indexOf("a"));
		name.lastIndexOf("a");
		System.out.println(name+name1);
		System.out.println(name.concat(name1));
		System.out.println(name.compareTo(name1));
		System.out.println(name.getBytes());
		for (int eachvale : name.getBytes())
		{
			System.out.println(eachvale);
		}
		int a =50;
		System.out.println(String.valueOf(a));
		
		ch.toString();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringsConcpets s = new StringsConcpets();
		s.string();
	}

}
