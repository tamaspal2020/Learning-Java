package tablets;
import java.util.ArrayList;
import java.util.HashSet;   /*
HashSet should be used when you don't want to allow duplicate value in your collection. In HashSet you won't be able to find value by index. 
If you still want to find the element you have no other option but to use the iterator, it will iterate through the Hashset and give you one by one element from the Hashset.
You want to find your element by index you should use ArrayList.
*/
import java.util.Iterator;

import tablets.Tablet;
public class Raktar {
	
ArrayList<Tablet> lista=new ArrayList<Tablet>();

public void tabletAddToList(Tablet t) {
		lista.add(t);
	
}

public int db() {
	return lista.size()+1;
}
public void deleteTablet(Tablet t) {
	Iterator<Tablet> i=lista.iterator();
	while(i.hasNext()) {
		if (t==i.next()){
			lista.remove(t);
		}
	}
}
public void deleteTabletbyIndex(int index) {
	Iterator<Tablet> i=lista.iterator();
	int s=0;
	while(i.hasNext()) {
		if(index==s) {
			System.out.println(i.next()+" és az index:"+s);
		}
			
		}
	}
public int   sumOfPrices() {
	Iterator<Tablet> i=lista.iterator();
	int sum=0;
	while(i.hasNext()) {
		sum+=i.next().getar();			
		}
	return sum;
	}

}


