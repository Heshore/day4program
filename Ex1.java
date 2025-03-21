package Exception;

public class Ex1 {
	public static void main(String[] args) {
	 try {
		 int  num = 10 / 0;
	 }catch (ArithmeticException e) {
		 System.out.println("Cannot divide by Zero:"+e.getMessage());
	 } finally {
		 System.out.println("Execution completed.");
		 
	 }
}
}
