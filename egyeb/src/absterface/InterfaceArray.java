package absterface;

import java.util.ArrayList;
import java.util.List;

public class InterfaceArray {
	public static void main(String[] args) {
		List<Aclass> lista=new ArrayList<Aclass>();
		Bclass b=new Bclass();
		b.manage(lista);
	}
}

interface I1{
	void reciever(int d);	
}

interface I2{
	void calculator(int i);	
}

interface I3{
	void printer();	
}

interface Group extends I1, I2, I3{}

class Aclass implements Group {
	int data=0;
	public void reciever(int d) {
		this.data=d;
	}
	public void calculator(int i) {
		this.data=data*i;
	}
	public void printer() {
		System.out.println("d:"+data);
	}
}

class Bclass {
	public void manage(List<Aclass> lista) {
		for (int i=0; i<10; i++) {
			System.out.println("sdfdgsdf");
			Aclass a=new Aclass();
			lista.add(a);
			lista.get(i).reciever(i);
			lista.get(i).calculator(i);
			lista.get(i).printer();
		}
	}
}


