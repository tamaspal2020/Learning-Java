package multithrea;

public class ThreadDemo2 {
	 public static void main(String[] args) {
		 MyClass t=new MyClass();
		 t.run();
		 Thread t2=new Thread(new MyClass2());
		 t2.run();
	 }
	 
}

 class MyClass extends Thread{
	public void run() {
		System.out.println("It working");
	}
}

 
 class MyClass2 implements Runnable{
	 @Override
	public void run() {
		System.out.println("It working (implements Runnable)");
	}
 }