package Exceptionexamples;

public class Ex1 {

	public static void main(String[] args) {
		try{
			int a=0;
			int b=10;
			System.out.println(b/a);
		}
		catch(ArithmeticException e) {
			System.out.println("Division by zero");
		}
		
	}

}
