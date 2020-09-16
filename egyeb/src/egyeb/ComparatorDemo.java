package egyeb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorDemo implements Comparator<Train>{

	public static void main(String[] args) {		
		Set<Train> trains=new TreeSet<>();
		Train t1=new Train(1000);
		Train t2=new Train(1000);
		Train t3=new Train(500);
		Train t4=new Train(2500);
		//trains.add(t1);  compilation error  
		//trains.add(t2);
		aClassthatcanComparetwoTrains ct=new aClassthatcanComparetwoTrains();
		ct.comparetrains();
		ct.comparetrains2(t1, t2);
		ct.comparetrains2(t4, t2);
		ct.comparetrains2(t3, t1);
		List<Train> trainlista=new ArrayList<>();  
		trainlista.add(new Train(234));
		trainlista.add(new Train(4));
		trainlista.add(new Train(34));
		trainlista.add(new Train(234));
		trainlista.add(new Train(435454));
		trainlista.add(new Train(434));      ///not sorted yet
		printlist(trainlista);
		Collections.sort(trainlista, new aClassthatcanComparetwoTrains());
		System.out.println("--------");
		printlist(trainlista);      /// already sorted
		TrywithHashSet th=new TrywithHashSet();
		th.tryingIt();
		
	}

	@Override
	public int compare(Train t1, Train t2) {
		if(t1.getLength()>t2.getLength()) return 1;
		if(t1.getLength()<t2.getLength()) return -1;
		return 0;
	}
	public static void printlist(List<Train> l) {
		for(Train t : l) {
			System.out.println(t.getLength());
		}
	}

}
class aClassthatcanComparetwoTrains implements Comparator<Train> {
	Set<Train> trains=new TreeSet<>();
	@Override
	public int compare(Train t1, Train t2) {
		if(t1.getLength()>t2.getLength()) return 1;
		if(t1.getLength()<t2.getLength()) return -1;
		return 0;
	}
	public void comparetrains(){
		Set<Train> trains=new TreeSet<>(new Comparator<Train>() {

			@Override
			public int compare(Train t1, Train t2) {
				if(t1.getLength()>t2.getLength()) return 1;
				if(t1.getLength()<t2.getLength()) return -1;
				return 0;
			}
			
		});
		Train t1=new Train(1000);
		Train t2=new Train(1000);
		trains.add(t1);
		trains.add(t2);
	}
	public void comparetrains2(Train t1, Train t2){
		if( this.compare(t1, t2) >0 ) System.out.println("Az elsõ nagyobb.");
		if( this.compare(t1, t2) <0 ) System.out.println("A második nagyobb.");
		if( this.compare(t1, t2) ==0 ) System.out.println("A két vonat egyenlõ hosszú.");
	}
	}
	

class Train{
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + length;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		if (length != other.length)
			return false;
		return true;
	}

	private int length;

	public Train(int length) {
		super();
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
}
class TrywithHashSet{
	public void tryingIt() {
		Set<Train> trainlista2=new HashSet<>();
		Train t1=new Train(234);
		Train t2=new Train(234);
		trainlista2.add(t1);
		trainlista2.add(t2);
		Iterator<Train> itrain=trainlista2.iterator();
		while(itrain.hasNext()) {
			System.out.println(itrain.next().getLength());
		}
		System.out.println(trainlista2.size());
	}
}


