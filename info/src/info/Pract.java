package info;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pract {

	public static void main(String[] args) {
		GenericC<String> c1= new GenericC<String>();
		GenericC<Boolean> c2= new GenericC<>();
		c1.lista.add("dfgsfdgs");
		c2.lista.add(true);		
		Genmet gm=new Genmet();
		System.out.println(gm.metodus(10));
		 Synthy sy=new Synthy();
		 Piano1 p1 = new Piano1();
		 Cembalo c= new Cembalo();
		 Trumpet1 t  = new Trumpet1();
		 Fuvola f = new Fuvola();
		 Reszleg<Fuvos> fuvosreszleg=new Reszleg<>();
		 fuvosreszleg.hangszerek.add(f);
		 fuvosreszleg.hangszerek.add(t);
		 Reszleg<Billenytyus> billreszleg=new Reszleg<>();
		 billreszleg.hangszerek.add(p1);
		 billreszleg.hangszerek.add(c);
		Hangszerbolt h=new Hangszerbolt();
		h.reszlegek.add(fuvosreszleg);
		h.reszlegek.add(billreszleg);		
		System.out.println(h.reszlegek.get(0).hangszerek.get(0).getname());
		
		List<? super Fuvos> fuvosoklista =new ArrayList<Hangszertipus>();
		fuvosoklista.add(f);   // f Fuvos is de Hangszertipus is, ami a Fuvos Osztály "felett" van
		System.out.println("fuvosoklista 0: "+fuvosoklista.get(0));
		List<? extends Fuvos> fuvosoklista2 =new ArrayList<Fuvola>();
		//fuvosoklista2.add(f);   ///you will lose the ability to add anything to the list through the new reference:
		
	   /* List<Boat> boats = new ArrayList<Boat>();  //There is only one list being instantiated, and it is an ArrayList<Boat> 
	    List<Car> cars = new ArrayList<Car>(); 
		List<? extends Vehicle> vehicles=boats; ///you will lose the ability to add anything to the list through the new reference:
		vehicles.add(new Car());  
		vehicles.add(new Vehicle());
		vehicles.add(new Boat());*/
	
		
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(new Car());
		vehicles.add(new Boat());
		List<? extends Vehicle> v=new ArrayList<Car>();
		v=vehicles;
		//v.add(new Car());

		//v.add(new Boat());
		System.out.println(v.get(0).getClass()+"sgdf");
		Car ca=(Car)v.get(0);
		
		
		//sameVehicles.add(new Car());   // compile error!   ///you will lose the ability to add anything to the list through the new reference:
		//sameVehicles.add(new Boat()); ///compile error!   you will lose the ability to add anything to the list through the new reference:
		//sameVehicles.add(new Vehicle()); ///compile error!   you will lose the ability to add anything to the list through the new reference:
		///System.out.println(sameVehicles.get(0).getClass()); 
		/*
		 * Types describe properties of instances passed around in our program, and the type system must always be able to guarantee 
		 * the integrity of what an instance was originally created as. When an instance is passed as a compatible less specific type than what it was originally declared, 
		 * 	WE LOSE SOME OPTIONS FOR WHAT WE MAY DO WITH THIS INSTANCE. As in the examples with the lists of vehicles, cars and boats, 
		 * it makes sense that when we don't know exactly of which specific type a list was originally declared as, the type system can not allow us to add ANYTHING to it,
		 *  because it may be list of boats, or a list of cars.
		 *  It may also be a list of vehicles, which can hold both cars and boats, but we don't know as long as we have a List<? extends Vehicle>.
		 * */
		/*
		 * The extends wildcard have a distinct relation to method arguments, in that it renders any method with parameters of the wildcard type as simply not invocable. 
		 * */
		
		ParkingLot parkingLot = new ParkingLot();
		parkingLot.cars.add(new Car());

		List<Car> expiredCars = new ArrayList<>();
		parkingLot.putExpiredInto(expiredCars);
		
		List<Vehicle> expiredVehicles = new ArrayList<>();
		parkingLot.putExpiredInto(expiredVehicles);

		Set<Object> expiredAnything = new HashSet<>();
		parkingLot.putExpiredInto(expiredAnything);

		Set<Boat> boats = new HashSet<>();
		///parkingLot.putExpiredInto(boats);  //does not compile
		/*
		 * The ? super Car wildcard type enables to express that the method needs to be able to add cars to the given collection,
		 *  but the caller is FREE TO CHOOSE ANY LEVEL OF COMPATIBLE GENERALITY OF THE COLLECTION.
		 * */
		/*
		 * 	extends adds flexibility to return types, but disables method parameter types
			super adds flexibility to method parameter types, but makes return types not useful
		 * */
		String nev="XYXYXYXY";
		Reszleg<Fuvos> rf=new Reszleg<Fuvos>();
		Gene<Reszleg<Fuvos>,String, Integer> genetest=new Gene<Reszleg<Fuvos>,String, Integer>(5);
		System.out.println(gentest.)
	}	
	public void kiker(Hangszertipus h) {
		System.out.println(h.getClass().getTypeName());
	}
	
}
class Gene<U, T, E>{
	
	private E b;
	public Gene(E u) {
		
		this.b=u;
	}
	public static <C> C fug(C p) {    
		C k=p;		
		return k;
	}
}
class GenericC<T>{
	private T mezo;	
	public ArrayList<T> lista=new ArrayList<T>();
}

class GenericC2<T>{
	private T mezo;
	public GenericC2(T m){
		this.mezo=m;
	}	
}
class Genmet{
	<T> T metodus(T v) {
		return v;
	}
}

class Hangszerbolt{
	ArrayList<Reszleg<? extends Hangszertipus>> reszlegek =new ArrayList<>();
	public void addReszleg(Reszleg<? extends Hangszertipus> r) {		
	}	
}
class Reszleg<T>{
	ArrayList<T> hangszerek=new ArrayList<T>();
	public void add(T h) {
		hangszerek.add(h);
	}
}
interface Hangszertipus{
	String getname();
}

class Fuvos implements Hangszertipus{
	private String name;
	public String getname() {
		return this.name;
	}
	public void setname(String name) {
		this.name=name;
	}
}
class Billenytyus implements Hangszertipus{
	private String name;
	public String getname() {
		return this.name;
}
}
class Synthy extends Billenytyus {
	private String name="Synthy";
}
class Piano1 extends Billenytyus{
	private String name="Piano";
}
class Cembalo extends Billenytyus{
	private String name="Cembalo";
}
class Trumpet1 extends Fuvos{
	private String name="Trumpet";
}
class Fuvola extends Fuvos{
	 public Fuvola(){
		 this.setname("Fuvola");
	 }
}

class Categ{}
class Vehicle extends Categ{}	
class Boat extends Vehicle{}
class Car extends Vehicle{}
class Volvo extends Car{}
/*
 * As the extends wildcard puts restrictions on the use of methods having the wildcard type in their parameters, the super keyword puts restrictions on methods returning the wildcard type. 
 * Not in a way that you can not invoke such methods, but you can only ever get a value of type Object when invoking methods returning a wildcard type declared with super
 * */

class ParkingLot {
    List<Car> cars = new ArrayList<>();

    void putExpiredInto(Collection<? super Car> expired) {
        // determine cars with expired parking,
        // and add them to the given Collection
    }
}

