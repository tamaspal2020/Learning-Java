package collections.Map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class map1 {
public static Random ra=new Random();
	public static void main(String[] args) throws IOException {
		Map<Foldresz, ArrayList<Orszag>> terkep=new HashMap<>();
		//BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
				
		for(int i=3; i>0; i--) {	
			System.out.println(i);
			Varos v=createUnit(new Varos());
			System.out.println(v.getNev());
		varosRendez(v, createUnit(new Kerulet()), createUnit(new Utca()));		
		v.keruletekKiir();
		}	
	}
	public static void varosRendez(Varos v ,Kerulet ke, Utca u) {
		Map<Kerulet, LinkedList<Utca>> k=new HashMap<>();
		LinkedList<Utca> utcak=new LinkedList<>();
		utcak.add(u);
		k.put(ke, utcak);
		v.ujKeruletAdd(k);		
	}
	public static <T extends Unit> T  createUnit(T t)
	{			
		return t.createme();		
	}

}
interface Unit{
	public  <T extends Unit> T createme();	
}
class Foldresz{
	private String nev;
	private int area;
}
class Orszag{
	private String nev;
	private String penznem;
	private String area;
	private String nepesseg;
	private Map<Megye, Set<Varos>> megyekvarosok=new HashMap<>();
	public String getNev() {
		return nev;
	}
	public void setNev(String nev) {
		this.nev = nev;
	}
	public String getPenznem() {
		return penznem;
	}
	public void setPenznem(String penznem) {
		this.penznem = penznem;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getNepesseg() {
		return nepesseg;
	}
	public void setNepesseg(String nepesseg) {
		this.nepesseg = nepesseg;
	}
	public Map<Megye, Set<Varos>> getMegyekvarosok() {
		return megyekvarosok;
	}
	public void setMegyekvarosok(Map<Megye, Set<Varos>> megyekvarosok) {
		this.megyekvarosok = megyekvarosok;
	}
}
class Megye{
	private int id;
	private String neve;
	public Megye(int i, String nev) {
		this.id=i;
		this.neve=nev;
	}
}
class Varos implements Unit, randomStringMaker {
	private String nev;
	private int area;
	private Map<Kerulet, LinkedList<Utca>> keruletek=new HashMap<>();
	public Varos() {}
	public Varos(String nev){
		this.nev=nev;
	}
	public String getNev() {
		return nev;
	}
	public void setNev(String nev) {
		this.nev = nev;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public Map<Kerulet, LinkedList<Utca>> getKeruletek() {
		return keruletek;
	}
	public void setKeruletek(Map<Kerulet, LinkedList<Utca>> keruletek) {
		this.keruletek = keruletek;
	}
	public void ujKeruletAdd(Map<Kerulet, LinkedList<Utca>> ujmap){
		this.keruletek.putAll(ujmap);
	}
	public void ujUtcaadd(Kerulet k, Utca u) {
		this.keruletek.computeIfAbsent(k, Utca -> new LinkedList<>()).add(u);
	}
	public void keruletekKiir() {
		for(Map.Entry<Kerulet, LinkedList<Utca>> e : keruletek.entrySet()){
			   for(Kerulet e1 : keruletek.keySet()) {
				   System.out.println(e1.getNum()+"."+" "+e1.getNev()+":");
				   for(Utca u1: e.getValue()) {
					   System.out.println(u1.getNev()+"-"+u1.gethossz());
				   }
			   }
			     
			}
	}
	@Override
	public Varos createme() {
		return new Varos("Varosnev:"+makeString(4));					
	}
}
class Kerulet implements Unit, randomStringMaker{
	Random rr=new Random();
	public static Set<Integer> idk=new HashSet<>();
	private int num;
	private String nev;
	public Kerulet() {}
	public Kerulet(int num, String nev) {
		this.num = num;
		this.nev = nev;
		idk.add(num);
	}
	public int getNum() {
		return this.num;
	}
	public String getNev() {
		return this.nev;
	}
	@Override
	public Kerulet createme() {
		String elotag="Keruletnev: ";
		return new Kerulet(rr.nextInt(20),elotag+makeString(20));	
	}
}
class Utca implements Unit, randomStringMaker{
	private int hossz;
	private String neve;
	public Random rand=new Random();
	public Utca() {};
	public Utca(String neve) {
		
		this.hossz = rand.nextInt(1000);
		
		this.neve = neve;
	}
	public int gethossz() {
		return this.hossz;
	}
	public String getNev() {
		return this.neve;
	}
	@Override
	public  Utca createme() {
		String elotag="utca neve: ";
		return new Utca(elotag+makeString(10));		
	}
}
interface randomStringMaker {
	Random ran=new Random();
	char[] betuk= (new String("qwertziopöüóasdfghjkkléíyxcbnm")).toCharArray();
	default String makeString(int l) {
		String s=null;
		for(int i=0; i<l; i++) {
			s+=betuk[ran.nextInt(betuk.length-1)];
		}		
		return s;
	}
}
