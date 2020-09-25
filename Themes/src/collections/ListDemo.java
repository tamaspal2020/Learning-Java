package collections;

import java.util.List;
import java.util.Queue;
import java.util.Iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ListDemo {

	public static void main(String[] args) {
		Listtry l=new Listtry();
		l.meth1();
		l.IterateswithIterator();		
		List<Integer> szamok=new ArrayList<>();
		szamok.add(32);  //sfdgsfd
		szamok.add(3);
		szamok.add(345345);
		szamok.add(-3);
		Collections.sort(szamok);
		System.out.printf("%s\n" ,szamok);
		Collections.sort(szamok, Collections.reverseOrder());
		System.out.printf("%s\n" ,szamok);
		ArrayList<Integer> listaa =new ArrayList<>();
		listaa.add(1); listaa.add(21); listaa.add(134); listaa.add(12); listaa.add(143);
		listaa.trimToSize();
		System.out.println(listaa);
	}
}



class Listtry{
	public List lista=new ArrayList(10);
	public List<String> lista2=new ArrayList<String>(10);
	public void meth1(){
		lista.add("fgsfg");
		lista.add(3);
		lista.add(3.234);
		lista.add('a');
		for (int i=0; i<lista.size(); i++) {
			System.out.println(lista.get(i).getClass().toString());
		}
	}
	public void IterateswithIterator() {
		Iterator<Object> itr=lista.iterator();   //iterator method returns an iterator
		Iterator<Character> itrchar=lista.iterator();
		System.out.println(itr.next());
		System.out.println(itr.next());
		lista2.add("Apple");
		lista2.add("Mango");
		lista2.add("Guava");
		lista2.add("Orange");
		lista2.add("Peach");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			if(itr.equals((Object)'a')) {
				System.out.println('a');
				itrchar.remove();
			}
		}
		Iterator<String> itr2=lista2.iterator();
		while(itr2.hasNext())
		{
			String s=itr2.next();
			System.out.println(s);
			if(s.equals("Guava")) {
				System.out.println("talalta");
				itr2.remove();
			}
		}
		System.out.println("----------------");
		 itr2=lista2.iterator();   // the new instance of the iterator points to the beginning of lista2
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
	}	
}




