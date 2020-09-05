package egyeb;

import java.util.TreeMap;

public class ComparableDemo {

	public static void main(String[] args) {
		TreeMap<Disk, Integer> disklist=new TreeMap<>();
		Disk d1=new Disk();
		Disk d2=new Disk();
		disklist.put(d1, 1);
	}

}
class Disk implements Comparable{
	private int id
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	Disk(int id){
		
	}
	
}
