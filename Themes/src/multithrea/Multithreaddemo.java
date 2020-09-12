package multithrea;

public class Multithreaddemo {

	public static void main(String[] args) {
		ClassthatImplementsRunnable r1 =new ClassthatImplementsRunnable("First Thread");
		r1.start();
		
		ClassthatImplementsRunnable r2 =new ClassthatImplementsRunnable("Second Thread");
		r2.start();
		
		ThreadDemo t1=new ThreadDemo("First Threaddemo");
		ThreadDemo t2=new ThreadDemo("second Threaddemo");
		t1.start();
		t2.start();
	}

}

class ClassthatImplementsRunnable implements Runnable{
	private Thread t;
	private String threadName;
	public ClassthatImplementsRunnable(String threadName) {		
		this.threadName = threadName;
		System.out.println("Creating the "+threadName+" thread with the constructor");
	}
	@Override
	public void run() {
		System.out.println("The run() method( "+threadName+") is running");
		for(int i=4; i>0; i--) {
			System.out.println("The thread( "+threadName+")  is sleepeing for a while: "+i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				System.out.println("The thread is interrupted");
				
			}
			System.out.println("After this the thread ("+threadName+")will exit");
		}
		
	}
	public void start() {
		System.out.println("The start method starts.");
		if(t==null) {
			t=new Thread(this,threadName );
			t.start();
		}
	}
	
}

class ThreadDemo extends Thread{
	private Thread t;
	   private String threadName;
	   
	   ThreadDemo( String name) {
	      threadName = name;
	      System.out.println("Creating " +  threadName );
	   }
	   public void run() {
		      System.out.println("Running " +  threadName );
		      try {
		         for(int i = 4; i > 0; i--) {
		            System.out.println("Thread: " + threadName + ", " + i);
		            // Let the thread sleep for a while.
		            Thread.sleep(50);
		         }
		      } catch (InterruptedException e) {
		         System.out.println("Thread " +  threadName + " interrupted.");
		      }
		      System.out.println("Thread " +  threadName + " exiting.");
		   }
	   public void start () {
		      System.out.println("Starting " +  threadName );
		      if (t == null) {
		         t = new Thread (this, threadName);
		         t.start ();
		      }
		   }
}
