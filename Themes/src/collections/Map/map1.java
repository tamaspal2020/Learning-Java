package collections.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class map1 {

	public static void main(String[] args) {
		Map<Foldresz, ArrayList<Orszag>> terkep=new HashMap<>();

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
	private Map<Megye, LinkedList<Varos>> megyekvarosok=new HashMap<>();
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
	public Map<Megye, LinkedList<Varos>> getMegyekvarosok() {
		return megyekvarosok;
	}
	public void setMegyekvarosok(Map<Megye, LinkedList<Varos>> megyekvarosok) {
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
	private
}
