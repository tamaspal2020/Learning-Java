import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/// set focuses on uniqueness
public class SetDemo {

	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		set.add("John");
		set.add("John");
		set.add("Jim");
		set.add("Ben");
		set.add("Anna");
		set.add("Tom");
		set.add("Xaver");
		set.add("Peter");
		set.add("Harold");
		System.out.println("Elements:"+set);
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			String s=itr.next();
			System.out.println(s);
			
			}
		set.remove("Tom");
		System.out.println("Elements:"+set);
		
		Set<String> set2=new TreeSet<>();
		set2.add("John");
		set2.add("John");
		set2.add("Jim");
		set2.add("Ben");
		set2.add("Anna");
		set2.add("Tom");
		set2.add("Xaver");
		set2.add("Peter");
		set2.add("Harold");
		System.out.println("Elements:"+set2);
	}

}
