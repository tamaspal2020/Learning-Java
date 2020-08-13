package absterface;


public class Harbour {
public static int aru=100;

	public static void main(String[] args) {
		SmallShip s1= new SmallShip();
		SmallShip s2= new SmallShip();		
		aruRakodo(s1, 5);
		aruRakodo(s2, 30);
		s1.rakterinfo();
		s2.rakterinfo();
		aruinfo();
	}
public static void aruRakodo(Ship s, int a) {
	s.sendSign();	
	aru-= a;
	if (s instanceof SmallShip) {
		((SmallShip)s).rakodoter+=a;	
		}
	if (s instanceof BigShip) {
		((BigShip)s).rakodoter+=a;
	}
	}
public static void  aruinfo() {
	System.out.println("I have"+aru);
}
}

interface Ship{
	void sendSign();
	void rakterinfo();
}

class SmallShip implements Ship{
	public  int rakodoter;
	public void sendSign(){
		System.out.println("I am a small ship.");
	}
	public void rakterinfo() {
		System.out.println("I have"+rakodoter);
	}
}

class BigShip implements Ship{
	public  int rakodoter;
	public void sendSign() {
		System.out.println("I am a big ship.");
	}
	public void rakterinfo() {
		System.out.println("I have"+rakodoter);
	}
}