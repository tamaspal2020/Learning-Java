package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//Map is included in collection framework it does not inherit from Collection interface.
public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map_l =new HashMap<>();
		Map<Integer , Customer> map=new HashMap<>();
		System.out.println("try");
		Customer c1=new Customer(345, "Betty");
		Customer c2=new Customer(323545, "Andrew");
		Customer c3=new Customer(234, "sdf");
		map.put(c1.id, c1);
		map.put(c2.id, c2);
		System.out.println("try");
		System.out.println(map.get(345).id);
		System.out.println(map.get(345).name);
		map.put(c3.id, c3);
		Map<Foldresz, Orszag> orszagok=new HashMap<>();
		Foldresz as=new Foldresz("Azsia", 3546356);
		Foldresz eu=new Foldresz("Europa", 223422);
		Orszag eng=new Orszag("Anglia", eu );
		Orszag fran=new Orszag("Francia", eu );
		Orszag rus=new Orszag("Rus", as );
		Orszag belor=new Orszag("Belor", as);
		orszagok.put(eu, eng);
		orszagok.put(eu,fran);
		orszagok.put(as, belor);
		orszagok.put(as, rus );
		System.out.println(orszagok.get(eu).name);
		System.out.println(orszagok.get(eu).f.name);
		System.out.println(orszagok.get(eu).f.area);
		Iterator<Foldresz> itr=orszagok.keySet().iterator();
		System.out.println("fgsfdg");
		while(itr.hasNext()) {
		 Foldresz f=itr.next();
			System.out.println(f.name);
			System.out.println(orszagok.get(f).name);
		}
		
		
		Map<String, String> chmp=new ConcurrentHashMap<>();
		
	}

}

 class Customer {
	public int id;
	public String name;
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}
 
 class Foldresz{
	 String name;
	 public int area;
	 public Foldresz(String n, int a) {
		 this.name=n;		 
		 this.area=a;
	 }
	 }

 
 class Orszag{
	 String name;
	 Foldresz f;
	 public Orszag(String n, Foldresz f) {
		 this.name=n;
		 this.f=f;
	 }
 }
 