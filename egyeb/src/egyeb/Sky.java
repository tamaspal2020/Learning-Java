package egyeb;

import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Sky{
	public static Set<Cloud> clouds =new TreeSet<>();
	public static Set<Cloud> clouds2 =new HashSet<>();
	public static void main(String[] args) {
		Cloud c1=new Cloud();
		Cloud c2=new Cloud();		
		Cloud c3=new Cloud(4567,456,3453,2345);
		Cloud c4=new Cloud(5678,4567,435,6);	
		clouds.add(c1);
		clouds.add(c2);
		clouds2.add(c1);
		clouds2.add(c2);
		clouds.add(c3);
		clouds.add(c4);
		Control control=new Control();
		control.listClouds(clouds);
		System.out.println("---------------------------");
		control.listClouds(clouds2);
	}
	public static void mergeClouds(Cloud c1, Cloud c2) {
		Cloud c3=new Cloud(c1.x, c1.y, c1.height, (c1.watercontent+c2.watercontent));
		clouds.remove(c1);
		clouds.remove(c2);
		clouds.add(c3);	
	}
}

class Cloud implements Comparable<Cloud>{
	static Random rand=new Random(9);
	double x;
	double y;
	double height;
	Double watercontent;  //l
	int rainintensity;      ///1,2,3
	public void rain(int time) {
		watercontent=watercontent-time*rainintensity;
	}
	public Cloud() {
		this.x=rand.nextInt(40000);
		this.y=rand.nextInt(40000);
		this.height=rand.nextInt(20000);
		watercontent=1000d;  ///  rand.nextInt(100000);
		this.rainintensity=rand.nextInt(3);
	}
	public Cloud(double x, double y, double height, double watercontent) {
		super();
		this.x = x;
		this.y = y;
		this.height = height;
		this.watercontent = watercontent;
		this.rainintensity=rand.nextInt(3);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cloud other = (Cloud) obj;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}
	@Override
	public int compareTo(Cloud c) {
		if (this.watercontent>c.watercontent) return 1;
		return -1;
	}	
}

class Control{
	public void listClouds(Set<Cloud> cloudset){
		for(Cloud c :  cloudset) {
			System.out.println("x:"+c.x);
			System.out.println("y:"+c.y);
			System.out.println("height:"+c.height);
			System.out.println("watercontent:"+c.watercontent);
		}
	}
}