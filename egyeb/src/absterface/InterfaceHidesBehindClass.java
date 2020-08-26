package absterface;

public class InterfaceHidesBehindClass {

	public static void main(String[] args) {
		Cx c=new Cx();
		c.show();
		///X1.show();
		X1 tt=new Cx();
		Alpha nm=new Cx();
		nm.show();
		
	}

}

interface X1{
	default void show() {
		System.out.println("I am X1"); 
	 }
	 /*static void show() {
		 System.out.println("Im am from the X1 interface static method"); 
	 }*/
}
interface X2{
	 default void show() {
		System.out.println("I am X2"); 
	 }
}

class Alpha{
	
	 public void show() {
			System.out.println("I am Alpha"); 
		 }
}

class Cx extends Alpha implements X1{     ///class is STRONGER than interface when each has a method with the same name
	
}