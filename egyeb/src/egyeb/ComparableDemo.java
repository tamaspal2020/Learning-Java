package egyeb;

import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

//import egyeb.Disk.ExistingIdException;

public class ComparableDemo {

	public static void main(String[] args) throws ExistingIdException {
		TreeMap<Disk, TreeSet<Film>> disklist=new TreeMap<>();
		
		Disk d1=new Disk(1);
		Disk d2=new Disk(2);
		Film f1=new Film(1);
		Film f2=new Film(2);
		Film f3=new Film(3);
		TreeSet<Film> filmlist=new TreeSet<>();
		filmlist.add(f2);
		filmlist.add(f1);
		TreeSet<Film> filmlist2=new TreeSet<>();
		filmlist2.add(f3);
		filmlist2.add(f2);
		filmlist2.add(f1);
		disklist.put(d2, filmlist2);
		disklist.put(d1, filmlist);
		for(Disk d : disklist.keySet()) {
			System.out.println(d.getId()+":");
			for(Film f : disklist.get(d)) {
				System.out.println(f.getId());
			}
			System.out.println("--------------");
		}
	}

}
class Disk implements Comparable<Disk>{
	private int id;
	public int getId() {
		return id;
	}
	private static HashSet<Integer> idlist=new HashSet<>();
	@Override
	public int compareTo(Disk d) {
		if (this.id==d.id) return 0;
		if (this.id<d.id) return -1;
		return 1;
	}
	Disk(int id) throws ExistingIdException {
		try {
			if(idlist.contains(id)) {
				throw new ExistingIdException("Az id már létezik");
			} 
			else {
				idlist.add(id);
				this.id=id;
			}
		}
		catch(ExistingIdException e) {
			System.out.println("Ilyen id már létezik");
		}
	}
	
}

class Film implements Comparable<Film>{
	private int id;
	public int getId() {
		return id;
	}
	private static HashSet<Integer> idlista=new HashSet<>();
	public Film(int id) throws ExistingIdException{
		try {
			if(idlista.contains(id)) {
				throw new ExistingIdException("Van már ilye id");
			}
			else {
				this.id=id;
				idlista.add(id);
			}
				
		}
		catch(ExistingIdException e) {
			System.out.println("Ilyen id-vel létezik már film");
		}
	}
	@Override
	public int compareTo(Film f) {
		if(this.id==f.id) return 0;
		if(this.id<f.id) return -1;
		return 1;
	}
}
class ExistingIdException extends Exception{
	ExistingIdException(String text){
		super(text);
	}
}	
