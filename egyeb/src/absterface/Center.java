package absterface;
import absterface.Am15;
import absterface.Gx123;

public class Center {

	public static void main(String[] args) {
		Am15 a=new Am15();
		Gx123 g=new Gx123();
		fire(a);
		fire(g);
	}
	
public static void fire(Gun g) {
	g.go();
}
	
}
