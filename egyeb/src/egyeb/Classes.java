package egyeb;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Classes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.otherclass.kiir(200);
		Set<Droid> ds=new HashSet<>();
		ds.add(new Droid(1L, "ADS"));
		ds.add(new Droid(2L, "DGH"));
		ds.add(new Droid(3L, "ADDFGH"));
		ds.add(new Droid(4L, "HGJ"));
		System.out.println(ds.size());
		
	}

}

class A{
int c;	
public A() {
	
}	
public A(int x) {
	
}	
void kiir(int i){
	System.out.println(i+10);
}
}

class B{
	public A otherclass=new A();
	List<A> alist =new LinkedList<>();
	void create() {
	for (int i=0; i<10; i++) {
		alist.add(new A());
	}
	}
}


