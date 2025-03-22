package Exception;

import java.util.*;

public class Ex12 {

		public static void main(String[] args) {

			HashMap<String, Integer> map = new HashMap<>();

			map.put("Apple", 3);

			map.put("Banana", 4);

			map.put("Orange", 7);

			System.out.println("Iterating using keySet:");

			for (String key : map.keySet()) {

				System.out.println(key + ":" + map.get(key));

			}

				

			}

		}