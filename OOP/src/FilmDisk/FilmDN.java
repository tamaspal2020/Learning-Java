package FilmDisk;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.RandomAccess;
import java.util.Set;



public class FilmDN extends RandomFilmGenerator{
	
	public static void main(String[] args) throws Exception {
		Nas nas1=new Nas();
		Disk d1=new Disk(1,200, csatltypes.ATA);
		Disk d2=new Disk(2,1000, csatltypes.SATA);
		Disk d3=new Disk(3,3000, csatltypes.SATA2);
		Disk d4=new Disk(4,4500, csatltypes.SATA3);
		d1.addFilm(createFilm());
		nas1.addDisk(d1);
		nas1.contentprint();
		
	}	
}
class Nas{
	
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
	public Map<Disk, HashSet<Film>> dikslist=new HashMap<Disk, HashSet<Film>>();
	private int freecapacity; 
	public Film playFilm(String title)
	{
		Film f=null;
		return f;
	}
	public LinkedList<String> filmeklistaja() {
		LinkedList<String> list=new LinkedList<>();
		for(Map.Entry<Disk, HashSet<Film>> e : dikslist.entrySet()){
			String listaelem="";
			   for(Disk e1 : dikslist.keySet()) {
				   listaelem+=e1.hashCode()+" disknumber:"+e1.getId()+". (szabadhely:"+e1.getFreespace()+") - ";
				   for(Film f1: e.getValue()) {
					   listaelem+=f1.getTitle();
				   }
			   }
			    list.add(listaelem); 
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
		dikslist.put(d, (HashSet<Film>)d.getfilmlista());
		System.out.println("Disk aded");
	}
}

class Film{
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
	
}
class Disk{
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
	private int freespace;
	private HashSet<Film> filmlista=new HashSet<>();
	public HashSet<Film> getfilmlista (){
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
				System.out.println("Film added");
			}
		}		
	}	
	public boolean removeFilm(Film f) {
		if(filmlista.contains(f)) {
			filmlista.remove(f);
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
}
enum csatltypes{ATA, SATA,SATA2, SATA3};

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
			System.out.println(hossz);
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
			System.out.println(title);
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