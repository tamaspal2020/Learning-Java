package collections;

import java.util.ArrayList;
import java.util.List;

public class TheForLoop {

	public static void main(String[] args) {
		int[] intlista=new int[10];
		
		filllist(intlista);
		
		List<Integer> secondlist=new ArrayList<>();
		for(Integer x: intlista) {
			secondlist.add(x*2);
		}
		
		printlist(secondlist);

	}
	public static void filllist(int[] a) {
		for (int i=0; i<a.length;i++) {
			a[i]=i;
		}
	}
	public static void printlist(List<Integer> l) {
		for (int i=0; i<l.size();i++) {
			System.out.print(l.get(i)+",");
		}
	}

}
