
 class A {
	 public A() {
		 System.out.println("im in A");
	 }
	 public void write(int i) {
		 System.out.println(i*2);
	 }
	 
 }
 
 class B extends A{
	 public B()  {
		 super();
	 System.out.println("im in B");
	 	super.write(10);
	 	write(10);
	 }
	 public void write(int i) {
		 System.out.println(i*3);
	 }
 }
	 

 public class Inheritance {
 
 public static void main(String[] args) {
	 	B obj1=new B();
	 	System.out.println(obj1.getClass());
	 	obj1.write(10);
 }
  
 
 }