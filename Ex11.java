package Exception;

import java.util.*;

public class Ex11 {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();

		map.put("Apple", 3);

		map.put("Banana", 4);

		map.put("Orange", 7);

		System.out.println("HashMap: " +map);

		System.out.println("Apple count: " +map.get("Apple"));

		System.out.println("Banana count: " +map.get("Banana"));

		System.out.println("Orange count: " +map.get("Orange"));

		

		

		

		

		if (map.containsKey("Banana")) {

			System.out.println("Banana is in the map.");

			

			

			

			 map.remove("Orange");

			System.out.println("After removing Orange:" + map);

			System.out.println("Size of HashMap:" + map.size());

		}

	}

}

