package info;


import java.util.ArrayList;
import java.util.List;

public class Ltr {  
public static void main(String[] args) {  
	Synth<Instrument> sy=new Synth<Instrument>();
	
	SoundType<Piano> pt=new SoundType<Piano>();
	Piano p=new Piano();
	pt.add(p);
		
	SoundType<Trumpet> tt=new SoundType<Trumpet>();
	Trumpet t=new Trumpet();
	tt.add(t);
	
	sy.addToList(tt);
	sy.addToList(pt);
}  
}  

class Synth<T extends Instrument>{
	List<Instrument> inlist=new ArrayList<>();
	public void sound(T p) {
		p.sound();
	}
	public void addToList(SoundType<? extends Instrument> st) {
		inlist.add(st.i);
	}
}
interface Instrument{
	void sound();
}

class Trumpet implements Instrument{
	public void sound() {
		System.out.println("Sounds like a trumpet");
	}
}
class Piano implements Instrument{
public void sound() {
		System.out.println("Sounds like piano");
	}
}
class Violin{
public void sound() {
		System.out.println("Sounds like violin");
	}
}
class SoundType<T>{
	public T i;
	public void add(T i) {
		this.i=i;
	}
}
