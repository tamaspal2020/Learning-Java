package proj1;

import java.util.ArrayList;

public class Pract {

	public static void main(String[] args) {
		Gen<String> g1=new Gen<String>();
		g1.l.add("szoveg");
		Gen<Integer> g2=new Gen<>();
		g2.l.add(234);
		long szam=234;
		Gen2<Long> g3 =new Gen2<>(szam);
		Gen graw=new Gen();
		graw.l.add("text");
		graw.l.add(234);
		for(Object o: graw.l) {
			System.out.println(o);
		}
		GenMet gm=new GenMet();
		System.out.println(gm.metodus(3453453));
		System.out.println(gm.metodus("generikus metódus")); 
		System.out.println(gm.<String>metodus("generikus metódus"));  //the same
	}
}
class Gen<T>{
	private T x;
	public ArrayList<T> l=new ArrayList<T>();		
}
class Gen2<T>{
	private T x;
	public Gen2(T x) {
		this.x=x;
	}
}
class GenMet{
<T> T metodus(T x) {
	return x;
}	
}


