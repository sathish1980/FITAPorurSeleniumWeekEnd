package Collections;
import  java.util.*;

public class ListInterface {
	
	/*
	 * List - it will allow duplicate values
	 * below 4 class inherits List interface
	 * ArrayList - it will maintain insertion order
	 * LinkedList - it will maintain insertion order
	 * Vector
	 * Stack
	 */
	
	public void ArrayList()
	{
		/*List<String> course =new ArrayList<>();
		List<String> devops =new ArrayList<>();
		List<String> courseCopy =new ArrayList<>();*/
		
		List<String> course =new LinkedList<>();
		List<String> devops =new LinkedList<>();
		List<String> courseCopy =new LinkedList<>();
		
		devops.add("Azure");
		devops.add("AWS");
		System.out.println(course);
		
		// how to add a value
		course.add("Python");
		course.add("Java");
		course.add(".Net");
		course.add("Python");
		course.addFirst("SQL");
		course.addLast("C#");
		course.addAll(devops);
		System.out.println(course);
		
		
		// how to update
		course.set(1, "JAVA L1");
		System.out.println(course);
		
		// how to delete 
		course.remove(7);
		course.removeFirst();
		course.removeLast();
		System.out.println(course);
		
		// get the value from list
		for(String eachCourse : course)
		{
			System.out.println(eachCourse);
			if(eachCourse.equals("Java"))
			{
				System.out.println("avaialble");
				break;
			}
		}
		System.out.println(course.contains("Java"));
		
		for(int i=0;i<course.size();i++)
		{
			System.out.println(course.get(i));
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
		Collections.sort(course);
		System.out.println(course);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListInterface L = new ListInterface();
		L.ArrayList();
	}

}
