package Collections;

import java.util.*;

public class SetInterface {
	/*
	 * Duplicate will not accepts
	 * its unordered
	 * 3 class inherits Set Interface
	 * HashSet
	 * Linked HashSet
	 * TreeSet
	 */
	
	/*
	 * Hashset - it does not maintain insertion order
	 * Linked Hashdet - it will maintain insertion order
	 * TreeSet - it will maintain Ascending order
	 */
	public void SetInterfaceImplementation()
	{
		//Set<String> course = new HashSet<>();
		//Set<String> course = new LinkedHashSet<>();
		Set<String> course = new TreeSet<>();
		System.out.println(course);
		List<String> devops =new LinkedList<>();
		
		devops.add("Azure");
		devops.add("AWS");
		devops.add("AWS");
		//devops.addAll(course);
		
		// how to add
		course.add("Python");
		course.add(".Net");
		course.add("Java");

		course.add("Python");
		course.addAll(devops);
		System.out.println(devops);
		System.out.println(course);
		
		// how to update
		 // no update in set since we  don have set method
		
		// how to remove
		course.remove("sathish");
		System.out.println(course);
		
		//how to retrive
		for(String eachCourse : course)
		{
			System.out.println(eachCourse);
		}
		
		Iterator it = course.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println(course.size());
		//course.clear();
		System.out.println(course);
		System.out.println(course.isEmpty());
		//course.reversed();
		//System.out.println(course.reversed());
		System.out.println(course);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetInterface S = new SetInterface();
		S.SetInterfaceImplementation();
	}

}
