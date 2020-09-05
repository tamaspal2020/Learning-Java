package egyeb;

import java.util.HashSet;
import java.util.TreeMap;

import egyeb.Disk.ExistingIdException;

public class ComparableDemo {

	public static void main(String[] args) throws ExistingIdException {
		TreeMap<Disk, Integer> disklist=new TreeMap<>();
		Disk d1=new Disk(1);
		Disk d2=new Disk(2);
		disklist.put(d1, 1);
	}

}
class Disk implements Comparable<Disk>{
	private int id;
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
	class ExistingIdException extends Exception{
		ExistingIdException(String text){
			super(text);
		}
	}	
}
