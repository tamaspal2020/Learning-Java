package egyeb;

import java.util.HashSet;
import java.util.TreeMap;

public class ComparableDemo {

	public static void main(String[] args) {
		TreeMap<Disk, Integer> disklist=new TreeMap<>();
		Disk d1=new Disk(1);
		Disk d2=new Disk(2);
		disklist.put(d1, 1);
	}

}
class Disk implements Comparable{
	private int id;
	private static HashSet<Integer> idlist=new HashSet<>();
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	Disk(int id) throws ExistingIdException {
		try {
			if(idlist.contains(id) {
				throw new ExistingIdException("Az id m�r l�tezik");
			} 
			this.id=id;
		}
		catch(ExistingIdException e) {
			System.out
		}
	}
	class ExistingIdException extends Exception{
		ExistingIdException(String text){
			super(text);
		}
	}
	
}
