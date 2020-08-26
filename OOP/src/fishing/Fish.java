package fishing;

import java.util.Random;

public class Fish {
public static Random rand=new Random();
public double suly;
public String faj;
public int depth;
public int ehes;
public boolean harap(int melyseg) {
	boolean h=false;
	int csaliertek=rand.nextInt(100);
	if((csaliertek<ehes*10) && ((melyseg<depth+10) && (melyseg>depth-10))){
		return true;
	}
	return h;
}
public Fish(double s, String f, int d, int e) {
	this.suly=s;
	this.faj=f;
	this.depth=d;
	this.ehes=e;
}
	
}
