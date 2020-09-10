package egyeb;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Sky{
	public static Set<Cloud> clouds =new TreeSet<>();
	public static void main(String[] args) {
		Cloud c1=new Cloud();
		Cloud c2=new Cloud();			
		clouds.add(c1);
		clouds.add(c2);	
		c1.toString();
	}
	public static void mergeClouds(Cloud c1, Cloud c2) {
		Cloud c3=new Cloud();
		clouds.remove(c1);
		clouds.remove(c2);
		clouds.add(c3);						
	}	
}

class Cloud{
	static Random rand=new Random(9);
	double x;
	double y;
	double height;
	double watercontent;  //l
	int rainintensity;      ///1,2,3
	public void rain(int time) {
		watercontent=watercontent-time*rainintensity;
	}
	public Cloud() {
		this.x=rand.nextInt(40000);
		this.y=rand.nextInt(40000);
		this.height=rand.nextInt(20000);
	}
	public Cloud(double x) {
}
}
class Control{
	public void listClouds(Set<Cloud> cloudset){
		
	}
}