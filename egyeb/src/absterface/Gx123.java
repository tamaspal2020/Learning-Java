package absterface;

public class Gx123 implements absterface.Gun {
	private String name="Gx123";
	private int length=30;
	private int weight=40;
	private int strength=150;
	public void go() {
		System.out.println("*********************************");
	}
public void getdata() {
		System.out.println("Name: "+this.name);
		System.out.println("Length: "+this.length);
		System.out.println("Weight: "+this.weight);
		System.out.println("Strength: "+this.strength);
	}
}
