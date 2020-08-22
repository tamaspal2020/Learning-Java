package collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> linl=new LinkedList<>();
		for(int i=0; i<10; i++){
			linl.add(i, i);
		}
		for(int i=0; i<10; i++){
			System.out.println(linl.get(i));
		}

	}

}
