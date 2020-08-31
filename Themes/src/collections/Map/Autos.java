package collections.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Autos implements  Autofv{
	public Random rand=new Random();
	public Map<String, ArrayList<Auto>> autolista=new HashMap<>();
	
	public static void main(String[] args) {
		Autos aus=new Autos();
		aus.feltoltAutoLista();
		aus.kiirAutoLista();		
	}
	public void addAuto(Auto a) {
		ArrayList<Auto> alist=this.autolista.get(a.marka);
		if(alist==null) {
			alist = new ArrayList<Auto>();
			alist.add(a);
			this.autolista.put(a.marka, alist);
		}
		else {
		alist.add(a);
		this.autolista.put(a.marka, alist);
		}
	}
	public void kiirAutoLista() {
		Set<Map.Entry<String, ArrayList<Auto>>> es=this.autolista.entrySet();
		for(Map.Entry<String, ArrayList<Auto>> e: es) {
			System.out.println("Marka:"+e.getKey());
			for(int i=0; i<e.getValue().size(); i++) {
				System.out.println("Tipus: "+e.getKey()+"-"+e.getValue().get(i).tipus);
				System.out.println("Tank mérete: "+e.getValue().get(i).tank);
				System.out.println("Ár: "+e.getValue().get(i).ar);
				System.out.println();
			}
			System.out.println();
			System.out.println("---------------------");
		}
	}
	
	public Auto randomAuto(automarkak a) {
		Auto au=new Auto();
		au.marka=a.toString();
		au.tipus=rand.nextInt(500);
		au.ar=rand.nextInt(10000000);
		au.tank=rand.nextInt(50);
		return au;
	}
	public  void feltoltAutoLista() {
		for(int i=0; i<automarkak.values().length; i++) {
			for(int j=0; j<3; j++) {
				Auto auto=randomAuto(automarkak.values()[i]);
				addAuto(auto);
			}
		}
	}
}
class Auto{
	 String marka;
	 int tipus;
	 int tank;
	 int ar;
}
interface Autofv extends markak{
	Auto randomAuto(automarkak a);
}
interface markak{
	public enum automarkak {Mazda, Ford, Opel, Mercedes, Suzuki};
}
