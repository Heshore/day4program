package Exception;

	import java.util.LinkedList;
	
	
	public class Ex7 {
		public static void main(String[] args) {
			LinkedList<Integer> getlist = new LinkedList<>();
			getlist.add(10);
			getlist.add(20);
			getlist.add(30);
			getlist.add(40);
			System.out.println(getlist.get(0));
			System.out.println(getlist.set(0,1000));
			System.out.println(getlist.get(0));
			System.out.println(getlist.remove(0));
			System.out.println(getlist.get(0));
			System.out.println("..............................");
			for (int i:getlist) {
		      System.out.println(i);		
			}
			
			
			
		}
	}


