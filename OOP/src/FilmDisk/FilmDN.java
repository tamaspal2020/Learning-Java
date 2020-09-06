package FilmDisk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.RandomAccess;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class FilmDN extends RandomFilmGenerator{
	
	public static void main(String[] args) throws Exception {
		Nas nas1=new Nas();
		Disk d1=new Disk(1,2000, csatltypes.ATA);
		Disk d2=new Disk(2,1000, csatltypes.SATA);
		Disk d3=new Disk(3,3000, csatltypes.SATA2);
		Disk d4=new Disk(4,4500, csatltypes.SATA3);
		d1.addFilm(createFilm());
		d1.addFilm(createFilm());
		d1.addFilm(createFilm());
		d2.addFilm(createFilm());
		d2.addFilm(createFilm());
		nas1.addDisk(d1);
		nas1.addDisk(d2);
		nas1.menu();
				
	}	
}
class Nas implements Comparable<TreeMap<Disk, HashSet<Film>>>{	
	public int getMaxdisk() {
		return maxdisk;
	}
	public void setMaxdisk(int maxdisk) throws Exception {
		if(maxdisk<2 || maxdisk>10) {
			throw new Exception("2-10 a diskek száma!");
		} 
		else {	
			this.maxdisk = maxdisk;
		}
	}
	public int getFreecapacity() {
		return freecapacity;
	}
	private int maxdisk;
	//public Map<Disk, HashSet<Film>> dikslist=new HashMap<Disk, HashSet<Film>>();  
	public Map<Disk, TreeSet<Film>> dikslist=new HashMap<Disk, TreeSet<Film>>();
	private int freecapacity; 
	public Film playFilm(String title)
	{
		Film f=null;
		return f;
	}
	public LinkedList<String> filmeklistaja() {
		LinkedList<String> list=new LinkedList<>();
		
		for (Disk k:  dikslist.keySet()) {
			 
		   //listaelem+=k.getId();
		    for (Film v: dikslist.get(k)) {
		    	String listaelem="";
		    	   listaelem+=k.getId()+v.getTitle();
		    	   list.add(listaelem);
		    }
		 		
		}
		return list;
	}
	public void contentprint() {
		LinkedList<String>lista=filmeklistaja();
		for(int i=0; i<lista.size();i++) {
			System.out.println(lista.get(i));
		}
	}
	public void addDisk(Disk d) {
		dikslist.put(d, (TreeSet<Film>)d.getfilmlista());		
	}
	public void menu() throws IOException {		
		menupontok();
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		while(choice!=0) {
		switch(choice) {
		case 1 :  
			contentprint();
			break;
		case 6 :  
			nasinfo();
		break;
		default :
			break;
		}		
		 menupontok();
		choice=sc.nextInt();		
		}
	}
	public void nasinfo() {
		int diskszam=dikslist.size();
		System.out.println("Diskek száma:"+diskszam);
		System.out.println("Disk adatok: ");
		for (Disk k:  dikslist.keySet()) {
			 int id=k.getId();
			 int size=k.getSize();
			 int freespace=k.getFreespace();
			 csatltypes csatl=k.getCs();
			 System.out.println("Disk "+id+".");
			 System.out.println("Csatlakozás: "+csatl);
			 System.out.println("Teljes méret:"+size);
			 System.out.println("Felhasználható: "+freespace);			 
			}
	}
	private void menupontok() {
		System.out.println("Kérem válasszon:");
		System.out.println("1. Filmek listája");
		System.out.println("2. film keresése");
		System.out.println("3. film hozzáadása:");
		System.out.println("4. film lejátszása:");
		System.out.println("5. film törlése:");
		System.out.println("6. Nas Info:");
		System.out.println("0. Kilépés:");
	}
	@Override
	public int compareTo(TreeMap<Disk, HashSet<Film>> arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}

class Film implements Comparable<Film>{
	private Film(String title, int length) {
		super();
		this.title = title;
		this.length = length;
		this.hd=false;
	}
	public Film(String title, int length, boolean hd, int size) {
		super();
		this.title = title;
		this.length = length;
		this.hd = hd;
		this.size = size;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) throws Exception {
		if(title.length()<5 || title.length()>100) {
			throw new Exception("A cím hossza min5 max 100");
		}
		else
		{
			this.title = title;
		}
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) throws Exception {
		if(length<10 || length>400) {
			throw new Exception("A hossz min 10 max 400");
		}
		else
		{
			this.length = length;
		}
	}
	public boolean isHd() {
		return hd;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	private String  title;
	private int  length;
	private boolean hd;
	private int size;
	@Override
	public int compareTo(Film f) {
		return this.getTitle().compareTo(f.getTitle());
	}
	
}
class Disk implements Comparable<Disk>{
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Disk(int id, int size, csatltypes cs) throws Exception{
		super();
		if(size<50 || size>5000 || size%20!=0)
		{
			throw new Exception("Méret: 50-5000 és 20-as osztható");
		}
		else {
			this.size = size;
			this.freespace=size;
		}
		this.cs=cs;
		setId(id);
	}
	public int getSize() {
		return size;
	}
	public int getFreespace() {
		return freespace;
	}
	private int size;
	private csatltypes cs;
	public csatltypes getCs() {
		return cs;
	}
	private int freespace;
	private TreeSet<Film> filmlista=new TreeSet<>();
	public TreeSet<Film> getfilmlista (){
		return this.filmlista;
	}
	public void addFilm(Film f) {
		if(filmlista.contains(f)) {
			System.out.println("Ez a film már létezik.");
		}
		else {
			if(f.getSize()>this.freespace) {
				System.out.println("Ez a film nem fér el a disken.");
			}
			else{
				filmlista.add(f);
				this.freespace-=f.getSize();
				
			}
		}		
	}	
	public boolean removeFilm(Film f) {
		if(filmlista.contains(f)) {
			filmlista.remove(f);
			this.freespace+=f.getSize();
			return true;
		}
		return false;
	}
	
	public Film searchFilm(String k) {
		Film f=null;
		Iterator<Film> itf=filmlista.iterator();
		while(itf.hasNext()) { 
			Film tmpf=itf.next();
			if(tmpf.getTitle()==k) {      //to be refined
				f=tmpf;
			}
		}
		return f;
	}
	@Override
	public int compareTo(Disk d) {
		if (this.id==d.getId()) return 0;
		if (this.id<d.getId()) return -1;
		return 1;
	}
}
enum csatltypes{
	ATA, SATA,SATA2, SATA3;
public void printcs() {
	
}	

};

class RandomFilmGenerator{
	static Random rand=new Random();
	public static Film createFilm() {
		Film f=null;
		String title=null;
		int length;
		boolean hd;
		int size;
		RandomAccessFile raf;
		String sor;
		int hossz=0;
		try {
			raf=new RandomAccessFile("forrasok/filmek.txt", "r");
			for(sor=raf.readLine(); sor!=null; sor=raf.readLine())
			{
				hossz++;
			}
			
			raf.close();
		}
		catch(IOException e){
			e.getMessage();
		}
		int randomsor=rand.nextInt(hossz);
		raf=null;
		try {
			raf=new RandomAccessFile("forrasok/filmek.txt", "r");
			for(int i=0; i<randomsor; i++)
			{
				title=raf.readLine();
			}
			raf.close();
			;
		}
		catch(IOException e){
			e.getMessage();
		}
		length=rand.nextInt(358)+41;
		if(rand.nextInt(10)>5) {
			hd=true;
		}
		else {
			hd=false;
		}
		size=rand.nextInt(95)+5;
		f=new Film(title, length, hd, size);
		return f;
	}
}