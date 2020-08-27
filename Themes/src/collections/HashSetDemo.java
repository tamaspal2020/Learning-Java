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
		System.out.println(set1.contains(20));
		set1.remove(2);
		seeSet(set1);
		Set<String> hashset = new HashSet<>(20, 0.5f); //initial capacity and load factor
		//The load factor describes what is the maximum fill level, above which, a set will need to be resized.
		//A low initial capacity reduces space complexity but increases the frequency of rehashing which is an expensive process.
		//On the other hand, a high initial capacity increases the cost of iteration and the initial memory consumption.
		
		
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
