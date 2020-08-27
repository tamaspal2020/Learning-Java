package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class HashSetDemo {
static Random rand;
	public static void main(String[] args) {
		System.out.println("sgdfgsdfsgfdg");
		Set<Integer> set1 =new HashSet<Integer>();
		rand=new Random();
		int n=0;
		while(n<100) {
			int i=rand.nextInt(10);
			fillSet(set1, i);
			n++;
		}
		seeSet(set1);
	}
public static void fillSet(Set<Integer> s, int i) {
	s.add(i);
}
public static void seeSet(Set<Integer> s) {
	Iterator<Integer> i=s.iterator();
	while(i.hasNext()) {
		System.out.print(i.next()+",");
	}
}

}
