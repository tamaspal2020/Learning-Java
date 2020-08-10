package fishing;
import java.util.ArrayList;
import java.util.Random;

import fishing.Fish;

public class Fisherman {
	public static Random rand=new Random();
public String neve;
public double teherbiras;
public ArrayList<Fish> halai = new ArrayList<Fish>();
public double sumWeightFishes=0;
public int csaliMelyseg() {
	int melyseg=rand.nextInt(80)+10;
	return melyseg;
}
public boolean kifog(Fish fish) {
	boolean kifogta=false;
	if((fish.suly+sumWeightFishes)<=teherbiras) {
		sumWeightFishes+=fish.suly;
	}
	return kifogta;
}
public Fisherman(String n, double t) {
	this.neve=n; 
	this.teherbiras=t;
}
}
