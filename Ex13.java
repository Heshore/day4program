package Exception;
import java.util.*;
import java.util.ArrayList;

public class Ex13 {
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		Iterator<String> iterator = fruits.iterator();
		System.out.println("Fruits using Iterator:");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

		
}
