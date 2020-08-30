package collections.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class map1 {

	public static void main(String[] args) {
		Map<Foldresz, ArrayList<Orszag>> terkep=new HashMap<>();

	}
	public void utcaAddtoKerulet(int id, String name) {
		Kerulet k=new Kerulet(id, name);
	}

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
		this.neve=neve;
	}
}
class Varos{
	private String nev;
	private int area;
	private Map<Kerulet, LinkedList<Utca>> keruletek=new HashMap<>();
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
}
class Kerulet{
	public static Set<Integer> idk=new HashSet<>();
	private int num;
	private String nev;
	public Kerulet() {
		
	}
	private Kerulet(int num, String nev) {
		this.num = num;
		this.nev = nev;
		idk.add(num);
	}
}
class Utca{
	private int hossz;
	private String neve;
	private Utca(int hossz, String neve) {
		
		this.hossz = hossz;
		this.neve = neve;
	}
}
