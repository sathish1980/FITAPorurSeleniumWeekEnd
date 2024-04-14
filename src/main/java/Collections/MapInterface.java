package Collections;

import java.util.*;

public class MapInterface {

	/*
	 * Map Inteface - Wont accept Duplicate Key's 
	 * works based on key and Value Pair
	 * 3 class
	 * Hash Map
	 * Linked Hash Map
	 * Tree Map
	 */
	
	/*
	 * HashMap -  it does not maintain insertion order
	 * Linked HashMap - it maintain insertion order
	 * TreeMap - it maintain in ascending order
	 */
	public void MapInterfaceImplementation()
	{
		//Map<Integer,String> mp = new HashMap<>();
		//Map<Integer,String> mp = new LinkedHashMap<>();
		Map<Integer,String> mp = new TreeMap<>();
		System.out.println(mp);
		mp.put(1, "sathish");
		mp.put(5, "kumar");
		mp.put(1, "raja");
		mp.put(6, "raghu");
		mp.put(2, "sunil");
		mp.putIfAbsent(2, "Fita");
		System.out.println(mp);
		
		// how to update
		mp.replace(2, "Porur");
		mp.replace(2, "Porur", "GK");
		System.out.println(mp);
		
		// how to delete
		mp.remove(2,"GKs");
		System.out.println(mp);
		
		// how to retrieve
		System.out.println(mp.get(6));
		System.out.println(mp.keySet());
		System.out.println(mp.values());
		System.out.println(mp.entrySet());
		
		for( int eachValue : mp.keySet())
		{
			System.out.println(mp.get(eachValue));
		}
		
		System.out.println(mp.size());
		//course.clear();
		System.out.println(mp);
		System.out.println(mp.isEmpty());
		//course.reversed();
		//System.out.println(course.reversed());
		System.out.println(mp);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapInterface M =  new MapInterface();
		M.MapInterfaceImplementation();
	}

}
