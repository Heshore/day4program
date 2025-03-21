package Exception;

import java.util.ArrayList;

public class Ex6 {
	public static void main(String[] args) {
		ArrayList<Integer> arrlist = new ArrayList<>();
		arrlist.add(100);
		arrlist.add(200);
		arrlist.add(300);
		arrlist.add(400);
		System.out.println(arrlist.get(0));
		System.out.println(arrlist.set(0,1000));
		System.out.println(arrlist.get(0));
		System.out.println(arrlist.remove(0));
		System.out.println(arrlist.get(0));
		System.out.println("..............................");
		for (int i:arrlist) {
	      System.out.println(i);		
		}
		
		
		
	}
}
