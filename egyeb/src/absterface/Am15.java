package absterface;

public class Am15 implements absterface.Gun {
	private String name="Am15";
	private int length=15;
	private int weight=20;
	private int strength=50;
	public void go() {
		System.out.println("**********");
	}
public void getdata() {
		System.out.println("Name: "+this.name);
		System.out.println("Length: "+this.length);
		System.out.println("Weight: "+this.weight);
		System.out.println("Strength: "+this.strength);
	}
}
