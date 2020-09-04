package Exceptionexamples;

public class Ex1 {

	public static void main(String[] args) throws nemParosException {
		try{
			int a=0;
			int b=10;
			System.out.println(b/a);
		}
		catch(ArithmeticException e) {
			System.out.println("Division by zero");
		}
		System.out.println("After the code");
		intcontrol(3);
		try {
			intcontrol(3);
		}
		catch(nemParosException e) {
			System.out.println("Nem páros szám");
		}
		
		
	}
	public static void intcontrol(int a) throws nemParosException {
		if(a%2!=0) {
			throw new nemParosException("This is the text of the exception itself,  if this exception is not catched, the program will stop here"); 
		}
	}
}
class nemParosException extends Exception{
	nemParosException(String etext){
		super(etext);
	}
}
