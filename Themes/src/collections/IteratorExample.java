package collections;

import java.util.List;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		ArrayList<Integer> lista=new ArrayList<>(10);
		fillList(lista);		
		printList(lista);
		Iterator<Integer> itr=lista.iterator();   ///interface Iterator
		while(itr.hasNext()) {		
			int number=itr.next();
			if(number==5) {
				itr.remove();
			}
		}
		printList(lista);
	}
	public static void fillList(ArrayList<Integer> a) {
		try {
			for(int i=0;i<getArrayListCapacity(a); i++) {
				a.add(i);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void printList(List<Integer> a) {
		for(int i=0;i<a.size(); i++) {
			System.out.print(a.get(i)+",");
		}
		System.out.println();
	}
private static int getArrayListCapacity(ArrayList<Integer> list) throws Exception{
        
   
        Field arrayField = ArrayList.class.getDeclaredField("elementData");
        
        /*
         * Since the elementData field is private, we need 
         * to make it accessible first 
         */
        arrayField.setAccessible(true);
        
        //now get the elementData Object array from our list
        Object[] internalArray = (Object[])arrayField.get(list);
        
        //Internal array length is the ArrayList capacity!
        return internalArray.length;
    }

}
